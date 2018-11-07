package com.jiankangyouyi.health.ai.api.response;

import java.math.BigDecimal;
import java.util.List;

import com.jiankangyouyi.health.ai.api.HealthAiResponse;

/**
 * 人体三维重建识别
 * 
 * @see /v2/three/dimensional/feedback
 * @author yangsongbo
 *
 */
public class BodyThreeDimensionalResponse extends HealthAiResponse {

	private static final long serialVersionUID = 1L;

	/**
	 * 识别结果
	 */
	private BobyThreeDimensionalResult recognitionResult;

		

	public BobyThreeDimensionalResult getRecognitionResult() {
		return recognitionResult;
	}



	public void setRecognitionResult(BobyThreeDimensionalResult recognitionResult) {
		this.recognitionResult = recognitionResult;
	}



	public static class BobyThreeDimensionalResult {
		
		/**
		 * 身高,单位：cm
		 */
		private BigDecimal height;
		
		/**
		 * 小腿长,单位：cm
		 */
		private BigDecimal lshank;
		
		/**
		 * 腰围,单位：cm
		 */
		private BigDecimal waist;	
		
		/**
		 * 大腿长,单位：cm
		 */
		private BigDecimal lthigh;	
		
		/**
		 * 小臂长,单位：cm
		 */
		private BigDecimal lforearm;
		
		/**
		 * 大臂长,单位：cm
		 */
		private BigDecimal lupperarm;
		
		
		/**
		 * 上身长,单位：cm
		 */
		private BigDecimal lnecktohip;
		
		/**
		 * 肩宽,单位：cm
		 */
		private BigDecimal wshoulder;
		
		/**
		 * 胸围,单位：cm
		 */
		private BigDecimal gchest;
		
		/**
		 * 臀围,单位：cm
		 */
		private BigDecimal hipline;	
		
		/**
		 * 胯围,单位：cm
		 */
		private BigDecimal hiplineTail;	
		
		/**
		 * 体重,单位：kg
		 */
		private BigDecimal weight;
		
		/**
		 * 点云数据
		 */
		private List<List<Double>> pointCloudData;

		public BigDecimal getHeight() {
			return height;
		}

		public void setHeight(BigDecimal height) {
			this.height = height;
		}

		public BigDecimal getLshank() {
			return lshank;
		}

		public void setLshank(BigDecimal lshank) {
			this.lshank = lshank;
		}

		public BigDecimal getWaist() {
			return waist;
		}

		public void setWaist(BigDecimal waist) {
			this.waist = waist;
		}

		public BigDecimal getLthigh() {
			return lthigh;
		}

		public void setLthigh(BigDecimal lthigh) {
			this.lthigh = lthigh;
		}

		public BigDecimal getLforearm() {
			return lforearm;
		}

		public void setLforearm(BigDecimal lforearm) {
			this.lforearm = lforearm;
		}

		public BigDecimal getLupperarm() {
			return lupperarm;
		}

		public void setLupperarm(BigDecimal lupperarm) {
			this.lupperarm = lupperarm;
		}

		public BigDecimal getLnecktohip() {
			return lnecktohip;
		}

		public void setLnecktohip(BigDecimal lnecktohip) {
			this.lnecktohip = lnecktohip;
		}

		public BigDecimal getWshoulder() {
			return wshoulder;
		}

		public void setWshoulder(BigDecimal wshoulder) {
			this.wshoulder = wshoulder;
		}

		public BigDecimal getGchest() {
			return gchest;
		}

		public void setGchest(BigDecimal gchest) {
			this.gchest = gchest;
		}

		public BigDecimal getHipline() {
			return hipline;
		}

		public void setHipline(BigDecimal hipline) {
			this.hipline = hipline;
		}

		public BigDecimal getHiplineTail() {
			return hiplineTail;
		}

		public void setHiplineTail(BigDecimal hiplineTail) {
			this.hiplineTail = hiplineTail;
		}

		public BigDecimal getWeight() {
			return weight;
		}

		public void setWeight(BigDecimal weight) {
			this.weight = weight;
		}

		public List<List<Double>> getPointCloudData() {
			return pointCloudData;
		}

		public void setPointCloudData(List<List<Double>> pointCloudData) {
			this.pointCloudData = pointCloudData;
		}

		@Override
		public String toString() {
			return "BobyThreeDimensionalResult [height=" + height + ", lshank=" + lshank + ", waist=" + waist
					+ ", lthigh=" + lthigh + ", lforearm=" + lforearm + ", lupperarm=" + lupperarm + ", lnecktohip="
					+ lnecktohip + ", wshoulder=" + wshoulder + ", gchest=" + gchest + ", hipline=" + hipline
					+ ", hiplineTail=" + hiplineTail + ", weight=" + weight + ", pointCloudData=" + pointCloudData
					+ "]";
		} 
		
		
		
	}
}
