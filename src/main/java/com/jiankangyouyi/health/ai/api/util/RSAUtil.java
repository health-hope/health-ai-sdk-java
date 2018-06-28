package com.jiankangyouyi.health.ai.api.util;

import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;

public class RSAUtil {

	private static final String SIGN_ALGORITHMS_SHA1 = "SHA1WithRSA";
	
	private static final String SIGN_ALGORITHMS_SHA256 = "SHA256withRSA";  

	private static final String KEY_ALGORITHM = "RSA";
    
	/**
	 * 生成密钥对,长度默认1024
	 * @return
	 * @throws Exception
	 */
	public static Map<String, String> generateKeyPair() {
		return generateKeyPair(1024);
	}
	
    /**
     * 生成密钥对,指定key长度,默认1024
     * @param keyLength
     * @return 包含公钥和私钥的map对象, map.get("PublicKey")为经过base64编码后公钥串,map.get("PrivateKey")为经过base64编码后私钥串
     */
    public static Map<String, String> generateKeyPair(int keyLength) {
        //获得对象 KeyPairGenerator 参数 RSA 1024个字节
        KeyPairGenerator keyPairGen;
		try {
			keyPairGen = KeyPairGenerator.getInstance(KEY_ALGORITHM);
			keyPairGen.initialize(keyLength);
	        //通过对象 KeyPairGenerator 获取对象KeyPair
	        KeyPair keyPair = keyPairGen.generateKeyPair();
	        
	        //通过对象 KeyPair 获取RSA公私钥对象RSAPublicKey RSAPrivateKey
	        RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic();
	        RSAPrivateKey privateKey = (RSAPrivateKey) keyPair.getPrivate();
	        //公私钥对象存入map中
	        Map<String, String> keyMap = new HashMap<String, String>(2);
	        keyMap.put("PublicKey", Base64Util.encode(publicKey.getEncoded()));
	        keyMap.put("PrivateKey", Base64Util.encode(privateKey.getEncoded()));
	        return keyMap;
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return null;
    }

	/**
	 * RSA签名
	 * 
	 * @param content
	 *            待签名数据
	 * @param privateKey
	 *            商户私钥
	 * @param input_charset
	 *            编码格式
	 * @return 签名值
	 */
	public static String signWithSHA1(String content, String privateKey,
			String input_charset) {
		try {
			PKCS8EncodedKeySpec priPKCS8 = new PKCS8EncodedKeySpec(
					Base64Util.decode(privateKey));
			KeyFactory keyf = KeyFactory.getInstance("RSA");
			PrivateKey priKey = keyf.generatePrivate(priPKCS8);

			java.security.Signature signature = java.security.Signature
					.getInstance(SIGN_ALGORITHMS_SHA1);

			signature.initSign(priKey);
			signature.update(content.getBytes(input_charset));

			byte[] signed = signature.sign();

			return Base64Util.encode(signed);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	/**
	 * RSA验签名检查
	 * 
	 * @param content
	 *            待签名数据
	 * @param sign
	 *            签名值
	 * @param alipay_public_key
	 *            公钥
	 * @param input_charset
	 *            编码格式
	 * @return 布尔值
	 */
	public static boolean verifyWithSHA1(String content, String sign,
			String public_key, String input_charset) {
		try {
			KeyFactory keyFactory = KeyFactory.getInstance("RSA");
			byte[] encodedKey = Base64Util.decode(public_key);
			PublicKey pubKey = keyFactory
					.generatePublic(new X509EncodedKeySpec(encodedKey));

			java.security.Signature signature = java.security.Signature
					.getInstance(SIGN_ALGORITHMS_SHA1);

			signature.initVerify(pubKey);
			signature.update(content.getBytes(input_charset));

			boolean bverify = signature.verify(Base64Util.decode(sign));
			return bverify;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}
	
	/**
	 * RSA签名
	 * 
	 * @param content
	 *            待签名数据
	 * @param privateKey
	 *            商户私钥
	 * @param input_charset
	 *            编码格式
	 * @return 签名值
	 */
	public static String signWithSHA256(String content, String privateKey,
			String input_charset) {
		try {
			PKCS8EncodedKeySpec priPKCS8 = new PKCS8EncodedKeySpec(
					Base64Util.decode(privateKey));
			KeyFactory keyf = KeyFactory.getInstance("RSA");
			PrivateKey priKey = keyf.generatePrivate(priPKCS8);

			java.security.Signature signature = java.security.Signature
					.getInstance(SIGN_ALGORITHMS_SHA256);

			signature.initSign(priKey);
			signature.update(content.getBytes(input_charset));

			byte[] signed = signature.sign();

			return Base64Util.encode(signed);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	/**
	 * RSA验签名检查
	 * 
	 * @param content
	 *            待签名数据
	 * @param sign
	 *            签名值
	 * @param alipay_public_key
	 *            公钥
	 * @param input_charset
	 *            编码格式
	 * @return 布尔值
	 */
	public static boolean verifyWithSHA256(String content, String sign,
			String public_key, String input_charset) {
		try {
			KeyFactory keyFactory = KeyFactory.getInstance("RSA");
			byte[] encodedKey = Base64Util.decode(public_key);
			PublicKey pubKey = keyFactory
					.generatePublic(new X509EncodedKeySpec(encodedKey));

			java.security.Signature signature = java.security.Signature
					.getInstance(SIGN_ALGORITHMS_SHA256);

			signature.initVerify(pubKey);
			signature.update(content.getBytes(input_charset));

			boolean bverify = signature.verify(Base64Util.decode(sign));
			return bverify;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}
	
}
