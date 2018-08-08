package com.jiankangyouyi.health.ai.api.response;

import java.math.BigDecimal;
import java.util.List;

import com.jiankangyouyi.health.ai.api.HealthAiResponse;

/**
 * 一图多物识别返回接口Bean
 * 
 * @author yangsongbo
 *
 */
public class ImageFoodSingleRecognizeResponse extends HealthAiResponse {

	private static final long serialVersionUID = 1L;

	/**
	 * 识别的食物列表
	 */
	private List<RecognizeSingleFood> topFoodNutrientBeanList;

	public List<RecognizeSingleFood> getTopFoodNutrientBeanList() {
		return topFoodNutrientBeanList;
	}

	public void setTopFoodNutrientBeanList(List<RecognizeSingleFood> topFoodNutrientBeanList) {
		this.topFoodNutrientBeanList = topFoodNutrientBeanList;
	}

	@Override
	public String toString() {
		return "ImageSingleRecognizeRes [topFoodNutrientBeanList=" + topFoodNutrientBeanList + "]";
	}

	/**
	 * 识别出的食物
	 * 
	 * @author yangsongbo
	 *
	 */
	public static class RecognizeSingleFood {
		/**
		 * 识别食物置信度
		 */
		private BigDecimal confidence;

		/**
		 * 食物ID
		 */
		private String foodId;

		/**
		 * 食物名称
		 */
		private String foodName;

		/**
		 * 食物图片：此图片为食物库中存储的食物图片URL，非请求中的图片数据。
		 */
		private String imageUrl;

		/**
		 * 食物单位
		 */
		private String unit;

		/**
		 * 功效
		 */
		private List<String> efficacys;

		/**
		 * 热量
		 */
		private int heat;

		/**
		 * 能量
		 */
		private int heatKJ;

		/**
		 * 蛋白质
		 */
		private BigDecimal protein;

		/**
		 * 脂肪
		 */
		private BigDecimal fat;

		/**
		 * 碳水化合物
		 */
		private BigDecimal carbohydrate;

		/**
		 * 水分
		 */
		private BigDecimal moisture;

		/**
		 * 胆固醇
		 */
		private BigDecimal cholesterol;

		/**
		 * 食部
		 */
		private BigDecimal ediblePart;

		/**
		 * 不溶性纤维
		 */
		private BigDecimal solkfloc;

		/**
		 * 维生素B1
		 */
		private BigDecimal vitaminB1;

		/**
		 * 维生素B2
		 */
		private BigDecimal vitaminB2;

		/**
		 * 维生素C
		 */
		private BigDecimal vitaminC;

		/**
		 * 维生素B6
		 */
		private BigDecimal vitaminB6;

		/**
		 * 维生素B12
		 */
		private BigDecimal vitaminB12;

		/**
		 * 维生素B3(烟酸)
		 */
		private BigDecimal vitaminB3;

		/**
		 * 维生素B5(泛酸)
		 */
		private BigDecimal vitaminB5;

		/**
		 * 维生素B9(叶酸)
		 */
		private BigDecimal vitaminB9;

		/**
		 * 维生素A
		 */
		private BigDecimal vitaminA;

		/**
		 * 维生素D
		 */
		private BigDecimal vitaminD;

		/**
		 * 维生素E
		 */
		private BigDecimal vitaminE;

		/**
		 * 维生素K
		 */
		private BigDecimal vitaminK;

		/**
		 * 赖氨酸
		 */
		private BigDecimal lysine;

		/**
		 * 色氨酸
		 */
		private BigDecimal tryptophan;

		/**
		 * 缬氨酸
		 */
		private BigDecimal valine;

		/**
		 * 苯丙氨酸
		 */
		private BigDecimal phenylalanine;

		/**
		 * 苏氨酸
		 */
		private BigDecimal threonine;

		/**
		 * 异亮氨酸
		 */
		private BigDecimal isoleucine;

		/**
		 * 亮氨酸
		 */
		private BigDecimal leucine;

		/**
		 * 蛋氨酸
		 */
		private BigDecimal methionine;

		/**
		 * 精氨酸
		 */
		private BigDecimal arginine;

		/**
		 * 谷氨酸
		 */
		private BigDecimal glutamic;

		/**
		 * 组氨酸
		 */
		private BigDecimal histidine;

		/**
		 * 丙氨酸
		 */
		private BigDecimal alanine;

		/**
		 * 甘氨酸
		 */
		private BigDecimal glycine;

		/**
		 * 脯氨酸
		 */
		private BigDecimal proline;

		/**
		 * 丝氨酸
		 */
		private BigDecimal serine;

		/**
		 * 天冬氨酸
		 */
		private BigDecimal aspartic;

		/**
		 * 钙
		 */
		private BigDecimal calcium;

		/**
		 * 磷
		 */
		private BigDecimal phosphorus;

		/**
		 * 钾
		 */
		private BigDecimal potassium;

		/**
		 * 钠
		 */
		private BigDecimal sodium;

		/**
		 * 镁
		 */
		private BigDecimal magnesium;

		/**
		 * 铜
		 */
		private BigDecimal copper;

		/**
		 * 铁
		 */
		private BigDecimal iron;

		/**
		 * 锌
		 */
		private BigDecimal zinc;

		/**
		 * 锰
		 */
		private BigDecimal manganese;

		/**
		 * 碘
		 */
		private BigDecimal iodine;

		/**
		 * 铬
		 */
		private BigDecimal chromium;

		/**
		 * 氟
		 */
		private BigDecimal fluorine;

		/**
		 * 硒
		 */
		private BigDecimal selenium;

		/**
		 * 总脂肪酸
		 */
		private BigDecimal totalFattyAcid;

		/**
		 * 饱和脂肪酸
		 */
		private BigDecimal saturatedFattyAcid;

		/**
		 * 单不饱和脂肪酸
		 */
		private BigDecimal monounsaturatedFattyAcid;

		/**
		 * 多不饱和脂肪酸
		 */
		private BigDecimal polyunsaturatedFattyAcid;

		/**
		 * 单不饱和脂肪酸占比
		 */
		private BigDecimal mfaPercent;

		/**
		 * 多不饱和脂肪酸占比
		 */
		private BigDecimal pfaPercent;

		/**
		 * 饱和脂肪酸占比
		 */
		private BigDecimal sfaPercent;

		/**
		 * 胡萝卜素
		 */
		private BigDecimal carotene;

		/**
		 * 大豆异黄酮
		 */
		private BigDecimal soyIsoflavone;

		/**
		 * GI（血糖生成指数）
		 */
		private BigDecimal gi;

		public BigDecimal getConfidence() {
			return confidence;
		}

		public void setConfidence(BigDecimal confidence) {
			this.confidence = confidence;
		}

		public String getFoodId() {
			return foodId;
		}

		public void setFoodId(String foodId) {
			this.foodId = foodId;
		}

		public String getFoodName() {
			return foodName;
		}

		public void setFoodName(String foodName) {
			this.foodName = foodName;
		}

		public String getImageUrl() {
			return imageUrl;
		}

		public void setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
		}

		public String getUnit() {
			return unit;
		}

		public void setUnit(String unit) {
			this.unit = unit;
		}

		public List<String> getEfficacys() {
			return efficacys;
		}

		public void setEfficacys(List<String> efficacys) {
			this.efficacys = efficacys;
		}

		public int getHeat() {
			return heat;
		}

		public void setHeat(int heat) {
			this.heat = heat;
		}

		public int getHeatKJ() {
			return heatKJ;
		}

		public void setHeatKJ(int heatKJ) {
			this.heatKJ = heatKJ;
		}

		public BigDecimal getProtein() {
			return protein;
		}

		public void setProtein(BigDecimal protein) {
			this.protein = protein;
		}

		public BigDecimal getFat() {
			return fat;
		}

		public void setFat(BigDecimal fat) {
			this.fat = fat;
		}

		public BigDecimal getCarbohydrate() {
			return carbohydrate;
		}

		public void setCarbohydrate(BigDecimal carbohydrate) {
			this.carbohydrate = carbohydrate;
		}

		public BigDecimal getMoisture() {
			return moisture;
		}

		public void setMoisture(BigDecimal moisture) {
			this.moisture = moisture;
		}

		public BigDecimal getCholesterol() {
			return cholesterol;
		}

		public void setCholesterol(BigDecimal cholesterol) {
			this.cholesterol = cholesterol;
		}

		public BigDecimal getEdiblePart() {
			return ediblePart;
		}

		public void setEdiblePart(BigDecimal ediblePart) {
			this.ediblePart = ediblePart;
		}

		public BigDecimal getSolkfloc() {
			return solkfloc;
		}

		public void setSolkfloc(BigDecimal solkfloc) {
			this.solkfloc = solkfloc;
		}

		public BigDecimal getVitaminB1() {
			return vitaminB1;
		}

		public void setVitaminB1(BigDecimal vitaminB1) {
			this.vitaminB1 = vitaminB1;
		}

		public BigDecimal getVitaminB2() {
			return vitaminB2;
		}

		public void setVitaminB2(BigDecimal vitaminB2) {
			this.vitaminB2 = vitaminB2;
		}

		public BigDecimal getVitaminC() {
			return vitaminC;
		}

		public void setVitaminC(BigDecimal vitaminC) {
			this.vitaminC = vitaminC;
		}

		public BigDecimal getVitaminB6() {
			return vitaminB6;
		}

		public void setVitaminB6(BigDecimal vitaminB6) {
			this.vitaminB6 = vitaminB6;
		}

		public BigDecimal getVitaminB12() {
			return vitaminB12;
		}

		public void setVitaminB12(BigDecimal vitaminB12) {
			this.vitaminB12 = vitaminB12;
		}

		public BigDecimal getVitaminB3() {
			return vitaminB3;
		}

		public void setVitaminB3(BigDecimal vitaminB3) {
			this.vitaminB3 = vitaminB3;
		}

		public BigDecimal getVitaminB5() {
			return vitaminB5;
		}

		public void setVitaminB5(BigDecimal vitaminB5) {
			this.vitaminB5 = vitaminB5;
		}

		public BigDecimal getVitaminB9() {
			return vitaminB9;
		}

		public void setVitaminB9(BigDecimal vitaminB9) {
			this.vitaminB9 = vitaminB9;
		}

		public BigDecimal getVitaminA() {
			return vitaminA;
		}

		public void setVitaminA(BigDecimal vitaminA) {
			this.vitaminA = vitaminA;
		}

		public BigDecimal getVitaminD() {
			return vitaminD;
		}

		public void setVitaminD(BigDecimal vitaminD) {
			this.vitaminD = vitaminD;
		}

		public BigDecimal getVitaminE() {
			return vitaminE;
		}

		public void setVitaminE(BigDecimal vitaminE) {
			this.vitaminE = vitaminE;
		}

		public BigDecimal getVitaminK() {
			return vitaminK;
		}

		public void setVitaminK(BigDecimal vitaminK) {
			this.vitaminK = vitaminK;
		}

		public BigDecimal getLysine() {
			return lysine;
		}

		public void setLysine(BigDecimal lysine) {
			this.lysine = lysine;
		}

		public BigDecimal getTryptophan() {
			return tryptophan;
		}

		public void setTryptophan(BigDecimal tryptophan) {
			this.tryptophan = tryptophan;
		}

		public BigDecimal getValine() {
			return valine;
		}

		public void setValine(BigDecimal valine) {
			this.valine = valine;
		}

		public BigDecimal getPhenylalanine() {
			return phenylalanine;
		}

		public void setPhenylalanine(BigDecimal phenylalanine) {
			this.phenylalanine = phenylalanine;
		}

		public BigDecimal getThreonine() {
			return threonine;
		}

		public void setThreonine(BigDecimal threonine) {
			this.threonine = threonine;
		}

		public BigDecimal getIsoleucine() {
			return isoleucine;
		}

		public void setIsoleucine(BigDecimal isoleucine) {
			this.isoleucine = isoleucine;
		}

		public BigDecimal getLeucine() {
			return leucine;
		}

		public void setLeucine(BigDecimal leucine) {
			this.leucine = leucine;
		}

		public BigDecimal getMethionine() {
			return methionine;
		}

		public void setMethionine(BigDecimal methionine) {
			this.methionine = methionine;
		}

		public BigDecimal getArginine() {
			return arginine;
		}

		public void setArginine(BigDecimal arginine) {
			this.arginine = arginine;
		}

		public BigDecimal getGlutamic() {
			return glutamic;
		}

		public void setGlutamic(BigDecimal glutamic) {
			this.glutamic = glutamic;
		}

		public BigDecimal getHistidine() {
			return histidine;
		}

		public void setHistidine(BigDecimal histidine) {
			this.histidine = histidine;
		}

		public BigDecimal getAlanine() {
			return alanine;
		}

		public void setAlanine(BigDecimal alanine) {
			this.alanine = alanine;
		}

		public BigDecimal getGlycine() {
			return glycine;
		}

		public void setGlycine(BigDecimal glycine) {
			this.glycine = glycine;
		}

		public BigDecimal getProline() {
			return proline;
		}

		public void setProline(BigDecimal proline) {
			this.proline = proline;
		}

		public BigDecimal getSerine() {
			return serine;
		}

		public void setSerine(BigDecimal serine) {
			this.serine = serine;
		}

		public BigDecimal getAspartic() {
			return aspartic;
		}

		public void setAspartic(BigDecimal aspartic) {
			this.aspartic = aspartic;
		}

		public BigDecimal getCalcium() {
			return calcium;
		}

		public void setCalcium(BigDecimal calcium) {
			this.calcium = calcium;
		}

		public BigDecimal getPhosphorus() {
			return phosphorus;
		}

		public void setPhosphorus(BigDecimal phosphorus) {
			this.phosphorus = phosphorus;
		}

		public BigDecimal getPotassium() {
			return potassium;
		}

		public void setPotassium(BigDecimal potassium) {
			this.potassium = potassium;
		}

		public BigDecimal getSodium() {
			return sodium;
		}

		public void setSodium(BigDecimal sodium) {
			this.sodium = sodium;
		}

		public BigDecimal getCopper() {
			return copper;
		}

		public void setCopper(BigDecimal copper) {
			this.copper = copper;
		}

		public BigDecimal getIron() {
			return iron;
		}

		public void setIron(BigDecimal iron) {
			this.iron = iron;
		}

		public BigDecimal getZinc() {
			return zinc;
		}

		public void setZinc(BigDecimal zinc) {
			this.zinc = zinc;
		}

		public BigDecimal getManganese() {
			return manganese;
		}

		public void setManganese(BigDecimal manganese) {
			this.manganese = manganese;
		}

		public BigDecimal getIodine() {
			return iodine;
		}

		public void setIodine(BigDecimal iodine) {
			this.iodine = iodine;
		}

		public BigDecimal getChromium() {
			return chromium;
		}

		public void setChromium(BigDecimal chromium) {
			this.chromium = chromium;
		}

		public BigDecimal getFluorine() {
			return fluorine;
		}

		public void setFluorine(BigDecimal fluorine) {
			this.fluorine = fluorine;
		}

		public BigDecimal getSelenium() {
			return selenium;
		}

		public void setSelenium(BigDecimal selenium) {
			this.selenium = selenium;
		}

		public BigDecimal getTotalFattyAcid() {
			return totalFattyAcid;
		}

		public void setTotalFattyAcid(BigDecimal totalFattyAcid) {
			this.totalFattyAcid = totalFattyAcid;
		}

		public BigDecimal getSaturatedFattyAcid() {
			return saturatedFattyAcid;
		}

		public void setSaturatedFattyAcid(BigDecimal saturatedFattyAcid) {
			this.saturatedFattyAcid = saturatedFattyAcid;
		}

		public BigDecimal getMonounsaturatedFattyAcid() {
			return monounsaturatedFattyAcid;
		}

		public void setMonounsaturatedFattyAcid(BigDecimal monounsaturatedFattyAcid) {
			this.monounsaturatedFattyAcid = monounsaturatedFattyAcid;
		}

		public BigDecimal getPolyunsaturatedFattyAcid() {
			return polyunsaturatedFattyAcid;
		}

		public void setPolyunsaturatedFattyAcid(BigDecimal polyunsaturatedFattyAcid) {
			this.polyunsaturatedFattyAcid = polyunsaturatedFattyAcid;
		}

		public BigDecimal getMfaPercent() {
			return mfaPercent;
		}

		public void setMfaPercent(BigDecimal mfaPercent) {
			this.mfaPercent = mfaPercent;
		}

		public BigDecimal getPfaPercent() {
			return pfaPercent;
		}

		public void setPfaPercent(BigDecimal pfaPercent) {
			this.pfaPercent = pfaPercent;
		}

		public BigDecimal getSfaPercent() {
			return sfaPercent;
		}

		public void setSfaPercent(BigDecimal sfaPercent) {
			this.sfaPercent = sfaPercent;
		}

		public BigDecimal getCarotene() {
			return carotene;
		}

		public void setCarotene(BigDecimal carotene) {
			this.carotene = carotene;
		}

		public BigDecimal getSoyIsoflavone() {
			return soyIsoflavone;
		}

		public void setSoyIsoflavone(BigDecimal soyIsoflavone) {
			this.soyIsoflavone = soyIsoflavone;
		}

		public BigDecimal getGi() {
			return gi;
		}

		public void setGi(BigDecimal gi) {
			this.gi = gi;
		}

		public BigDecimal getMagnesium() {
			return magnesium;
		}

		public void setMagnesium(BigDecimal magnesium) {
			this.magnesium = magnesium;
		}

		@Override
		public String toString() {
			return "RecognizeSingleFood [confidence=" + confidence + ", foodId=" + foodId + ", foodName=" + foodName
					+ ", imageUrl=" + imageUrl + ", unit=" + unit + ", efficacys=" + efficacys + ", heat=" + heat
					+ ", heatKJ=" + heatKJ + ", protein=" + protein + ", fat=" + fat + ", carbohydrate=" + carbohydrate
					+ ", moisture=" + moisture + ", cholesterol=" + cholesterol + ", ediblePart=" + ediblePart
					+ ", solkfloc=" + solkfloc + ", vitaminB1=" + vitaminB1 + ", vitaminB2=" + vitaminB2 + ", vitaminC="
					+ vitaminC + ", vitaminB6=" + vitaminB6 + ", vitaminB12=" + vitaminB12 + ", vitaminB3=" + vitaminB3
					+ ", vitaminB5=" + vitaminB5 + ", vitaminB9=" + vitaminB9 + ", vitaminA=" + vitaminA + ", vitaminD="
					+ vitaminD + ", vitaminE=" + vitaminE + ", vitaminK=" + vitaminK + ", lysine=" + lysine
					+ ", tryptophan=" + tryptophan + ", valine=" + valine + ", phenylalanine=" + phenylalanine
					+ ", threonine=" + threonine + ", isoleucine=" + isoleucine + ", leucine=" + leucine
					+ ", methionine=" + methionine + ", arginine=" + arginine + ", glutamic=" + glutamic
					+ ", histidine=" + histidine + ", alanine=" + alanine + ", glycine=" + glycine + ", proline="
					+ proline + ", serine=" + serine + ", aspartic=" + aspartic + ", calcium=" + calcium
					+ ", phosphorus=" + phosphorus + ", potassium=" + potassium + ", sodium=" + sodium + ", magnesium="
					+ magnesium + ", copper=" + copper + ", iron=" + iron + ", zinc=" + zinc + ", manganese="
					+ manganese + ", iodine=" + iodine + ", chromium=" + chromium + ", fluorine=" + fluorine
					+ ", selenium=" + selenium + ", totalFattyAcid=" + totalFattyAcid + ", saturatedFattyAcid="
					+ saturatedFattyAcid + ", monounsaturatedFattyAcid=" + monounsaturatedFattyAcid
					+ ", polyunsaturatedFattyAcid=" + polyunsaturatedFattyAcid + ", mfaPercent=" + mfaPercent
					+ ", pfaPercent=" + pfaPercent + ", sfaPercent=" + sfaPercent + ", carotene=" + carotene
					+ ", soyIsoflavone=" + soyIsoflavone + ", gi=" + gi + "]";
		}

	}

}
