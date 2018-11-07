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
	
	public static void main(String[] args) {
//		String privateKey = "MIICWwIBAAKBgQC36ULM/K+pupdZupwEKA6XxmMd2dN7Y0mJNnst1XviUD0FbNs0iuGt79VIeE5xsS6pQDxBi8KigbxCNGm9q3cpfOFwyIcenw+MTRmQiII658zhLRJlmhioBEVNwd7zz1XWrbMyKQZdcx5qY1AhAn+4ig7BzvKRlAFk3v+awLbeEQIDAQABAoGAGGIb0jO6UoWDpYjhQIfTD3plD8Mej+BlEoUfpb8FMscyn/KDyZ6UN0xx+a7Br78vEY+LraELCCKtRBXQ4y3FmYfRPD5qbPBdTCejrMeg38lQ8TQ7ORTJhHFS+7u+kzYO9JYinlhJRxzw04l3Q3KnVLa5h9JvkWbkuzePjwfLMnECQQDr5rAWWP6RdLpQ9twEFqMGyEJAFHPa7ddNUpy8rEZKpjP080c+D8ZU56g6YlO0PEn175+ZOYt40ED7NBrqbVMlAkEAx5SasxpvDGPMY43ZGc44vSQDNgvmfePc253HXGXij8neJRta7+yPr+Dj+WlmXbVSw6q9kRqjVY2mOTajH2+hfQJAfgTUWHveMlILHilhy4VUPdFJIvZKFdAszg+tz1SwkDxNUTONAWhn6P9/7QCN+qCiWhFSTwZgrX+C1y80mbshSQJAHa7BT0/oIiyZkljfaBIeqCq5+4jLj/+asmMF6n0QtBfu3Q/zd2l0eVD2NvrxCZDVLVqwdOtETY4SocG5gwxkNQJABvf68NI8U32+muNAczg5uYXeh/baKfir6J043ZvkhHSfoRZ8Q5ntGSUAHIWCfPgsmdscT+5/qCAciCChR8wJJg==";
//		String sign = signWithSHA256("appId=5ba9fc91ccbe98681e1c812f&nonceStr=5531ecb166574a80b074d3bc4db79a08&timestamp=2018-10-08 15:48:30&version=2.0", privateKey, HealthAiConstants.CHARSET_UTF8);
//	
//		System.out.println(sign);
		
		String public_key ="MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCF7u94l3XOYrvz/G/R53OLdi1aFr1PqWB7X3aI+jPFXCzTa5sFQ9OOD7Sf4zTldNXKp0Glvt9qjvVpJxobdrO4XMEQm67n8Ame+U+viGvXOOD4foD9ljselrLGtMi32cmq1+G782fJmkio83UREpCF9Vs1AtRUYf7vtvpLL05pewIDAQAB";
		String content = "appId=5ba9fc91ccbe98681e1c812f&nonceStr=5531ecb166574a80b074d3bc4db79a08&timestamp=2018-10-08 15:48:30&version=2.0";
		String sign = "Tx1eEqNOKG70QCzlpaECvfvtWPenjS0e5nFy3W3jcrr0lwe6qXBtzlrd65bBonHgXCSdmw8TwTx+Bfimf2S/9SG1N1uAx6Ic2HVE+/yTcijjjxrcR57Ao1NPWpExViSO+bKd52F7hDPkd32Ok+RLn5ogVGy/ExoIVDrzD6pZ0xs=";
		System.out.println(verifyWithSHA256(content, sign, public_key, "utf-8"));
	}
	
}
