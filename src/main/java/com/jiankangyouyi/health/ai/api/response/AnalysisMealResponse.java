package com.jiankangyouyi.health.ai.api.response;

import java.math.BigDecimal;
import java.util.List;

import com.jiankangyouyi.health.ai.api.HealthAiResponse;

/**
 * 饮食分析
 * 
 * @see /v2/analysis/meal.do
 * @author yangsongbo
 *
 */
public class AnalysisMealResponse extends HealthAiResponse {

	private static final long serialVersionUID = 1L;

	/**
	 * 用户摄入总量
	 */
	private int userTotalIntake;

	/**
	 * 标准摄入总量
	 */
	private int standardTotalIntake;

	/**
	 * 早餐分析
	 */
	private MealAnalysisResult breakfastAnalysis;

	/**
	 * 午餐分析
	 */
	private MealAnalysisResult lunchAnalysis;

	/**
	 * 晚餐分析
	 */
	private MealAnalysisResult supperAnalysis;

	
	/**
	 * 脂肪分析
	 */
	private EnergyYieldingNutrientAnalysisResult fatAnalysis;
	
	/**
	 * 蛋白质分析
	 */
	private EnergyYieldingNutrientAnalysisResult proteinAnalysis;
	
	/**
	 * 碳水化合物分析
	 */
	private EnergyYieldingNutrientAnalysisResult carbohydrateAnalysis;
	
	/**
	 * 营养素分析
	 */
	private List<NutrientAnalysisResult> nutrientAnalysis;
	
	

	public int getUserTotalIntake() {
		return userTotalIntake;
	}

	public void setUserTotalIntake(int userTotalIntake) {
		this.userTotalIntake = userTotalIntake;
	}

	public int getStandardTotalIntake() {
		return standardTotalIntake;
	}

	public void setStandardTotalIntake(int standardTotalIntake) {
		this.standardTotalIntake = standardTotalIntake;
	}

	public MealAnalysisResult getBreakfastAnalysis() {
		return breakfastAnalysis;
	}

	public void setBreakfastAnalysis(MealAnalysisResult breakfastAnalysis) {
		this.breakfastAnalysis = breakfastAnalysis;
	}

	public MealAnalysisResult getLunchAnalysis() {
		return lunchAnalysis;
	}

	public void setLunchAnalysis(MealAnalysisResult lunchAnalysis) {
		this.lunchAnalysis = lunchAnalysis;
	}

	public MealAnalysisResult getSupperAnalysis() {
		return supperAnalysis;
	}

	public void setSupperAnalysis(MealAnalysisResult supperAnalysis) {
		this.supperAnalysis = supperAnalysis;
	}

	public List<NutrientAnalysisResult> getNutrientAnalysis() {
		return nutrientAnalysis;
	}

	public void setNutrientAnalysis(List<NutrientAnalysisResult> nutrientAnalysis) {
		this.nutrientAnalysis = nutrientAnalysis;
	}

	public EnergyYieldingNutrientAnalysisResult getFatAnalysis() {
		return fatAnalysis;
	}

	public void setFatAnalysis(EnergyYieldingNutrientAnalysisResult fatAnalysis) {
		this.fatAnalysis = fatAnalysis;
	}

	public EnergyYieldingNutrientAnalysisResult getProteinAnalysis() {
		return proteinAnalysis;
	}

	public void setProteinAnalysis(EnergyYieldingNutrientAnalysisResult proteinAnalysis) {
		this.proteinAnalysis = proteinAnalysis;
	}

	public EnergyYieldingNutrientAnalysisResult getCarbohydrateAnalysis() {
		return carbohydrateAnalysis;
	}

	public void setCarbohydrateAnalysis(EnergyYieldingNutrientAnalysisResult carbohydrateAnalysis) {
		this.carbohydrateAnalysis = carbohydrateAnalysis;
	}





	/**
	 * 餐别分析结果
	 * @author yangsongbo
	 *
	 */
	public static class MealAnalysisResult {

		/**
		 * 用户摄入量
		 */
		private int userIntake;

		/**
		 * 标准摄入上限
		 */
		private int standardIntakeUpper;

		/**
		 * 标准摄入下限
		 */
		private int standardIntakeLower;

		/**
		 * 标准摄入上限百分比
		 */
		private int standardPercentUpper;

		/**
		 * 标准摄入下限百分比
		 */
		private int standardPercentLower;
		
		
		

		public MealAnalysisResult() {
			super();
		}

		public MealAnalysisResult(int userIntake, int standardIntakeUpper, int standardIntakeLower,
				int standardPercentUpper, int standardPercentLower) {
			super();
			this.userIntake = userIntake;
			this.standardIntakeUpper = standardIntakeUpper;
			this.standardIntakeLower = standardIntakeLower;
			this.standardPercentUpper = standardPercentUpper;
			this.standardPercentLower = standardPercentLower;
		}

		@Override
		public String toString() {
			return "MealAnalysisResult [userIntake=" + userIntake + ", standardIntakeUpper=" + standardIntakeUpper
					+ ", standardIntakeLower=" + standardIntakeLower + ", standardPercentUpper=" + standardPercentUpper
					+ ", standardPercentLower=" + standardPercentLower + "]";
		}

		public int getUserIntake() {
			return userIntake;
		}

		public void setUserIntake(int userIntake) {
			this.userIntake = userIntake;
		}

		public int getStandardIntakeUpper() {
			return standardIntakeUpper;
		}

		public void setStandardIntakeUpper(int standardIntakeUpper) {
			this.standardIntakeUpper = standardIntakeUpper;
		}

		public int getStandardIntakeLower() {
			return standardIntakeLower;
		}

		public void setStandardIntakeLower(int standardIntakeLower) {
			this.standardIntakeLower = standardIntakeLower;
		}

		public int getStandardPercentUpper() {
			return standardPercentUpper;
		}

		public void setStandardPercentUpper(int standardPercentUpper) {
			this.standardPercentUpper = standardPercentUpper;
		}

		public int getStandardPercentLower() {
			return standardPercentLower;
		}

		public void setStandardPercentLower(int standardPercentLower) {
			this.standardPercentLower = standardPercentLower;
		}

	}
	
	
	/**
	 * 营养素分析结果
	 * @author yangsongbo
	 *
	 */
	public static class NutrientAnalysisResult{
		
		/**
		 * 营养素类型
		 */
		private String nutrient;
		
		/**
		 * 用户摄入量
		 */
		private BigDecimal userIntake;
		
		/**
		 * 标准摄入量上限
		 */
		private BigDecimal standardIntakeUpper;
		
		/**
		 * 标准摄入量下限
		 */
		private BigDecimal standardIntakeLower;
		
		/**
		 * 单位 ： 克、毫克、微克
		 */
		private String unit;
		
		
		

		public NutrientAnalysisResult() {
			super();
		}
		
		

		public NutrientAnalysisResult(String nutrient, BigDecimal userIntake, BigDecimal standardIntakeUpper,
				BigDecimal standardIntakeLower, String unit) {
			super();
			this.nutrient = nutrient;
			this.userIntake = userIntake;
			this.standardIntakeUpper = standardIntakeUpper;
			this.standardIntakeLower = standardIntakeLower;
			this.unit = unit;
		}



		public String getNutrient() {
			return nutrient;
		}

		public void setNutrient(String nutrient) {
			this.nutrient = nutrient;
		}

		public BigDecimal getUserIntake() {
			return userIntake;
		}

		public void setUserIntake(BigDecimal userIntake) {
			this.userIntake = userIntake;
		}

		public BigDecimal getStandardIntakeUpper() {
			return standardIntakeUpper;
		}

		public void setStandardIntakeUpper(BigDecimal standardIntakeUpper) {
			this.standardIntakeUpper = standardIntakeUpper;
		}

		public BigDecimal getStandardIntakeLower() {
			return standardIntakeLower;
		}

		public void setStandardIntakeLower(BigDecimal standardIntakeLower) {
			this.standardIntakeLower = standardIntakeLower;
		}

		public String getUnit() {
			return unit;
		}

		public void setUnit(String unit) {
			this.unit = unit;
		}

		@Override
		public String toString() {
			return "NutrientAnalysisResult [nutrient=" + nutrient + ", userIntake=" + userIntake
					+ ", standardIntakeUpper=" + standardIntakeUpper + ", standardIntakeLower=" + standardIntakeLower
					+ ", unit=" + unit + "]";
		}
		
	}
	
	/**
	 * 三大产能营养素分析项
	 * @author yangsongbo
	 *
	 */
	public static class EnergyYieldingNutrientAnalysisResult{
		/**
		 * 标准摄入百分比上限
		 */
		private int standardPercentUpper;
		
		/**
		 * 标准摄入百分比下限
		 */
		private int standardPercentLower;
		
		/**
		 * 用户摄入百分比
		 */
		private int userPercent;
		
		
		
		

		public EnergyYieldingNutrientAnalysisResult() {
			super();
		}

		public EnergyYieldingNutrientAnalysisResult(int standardPercentUpper, int standardPercentLower,
				int userPercent) {
			super();
			this.standardPercentUpper = standardPercentUpper;
			this.standardPercentLower = standardPercentLower;
			this.userPercent = userPercent;
		}

		public int getStandardPercentUpper() {
			return standardPercentUpper;
		}

		public void setStandardPercentUpper(int standardPercentUpper) {
			this.standardPercentUpper = standardPercentUpper;
		}

		public int getStandardPercentLower() {
			return standardPercentLower;
		}

		public void setStandardPercentLower(int standardPercentLower) {
			this.standardPercentLower = standardPercentLower;
		}

		public int getUserPercent() {
			return userPercent;
		}

		public void setUserPercent(int userPercent) {
			this.userPercent = userPercent;
		}

		@Override
		public String toString() {
			return "EnergyYieldingNutrientAnalysisResult [standardPercentUpper=" + standardPercentUpper
					+ ", standardPercentLower=" + standardPercentLower + ", userPercent=" + userPercent + "]";
		}


	}

}
