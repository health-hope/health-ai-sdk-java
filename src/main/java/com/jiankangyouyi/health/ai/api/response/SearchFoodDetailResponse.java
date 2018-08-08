package com.jiankangyouyi.health.ai.api.response;

import com.jiankangyouyi.health.ai.api.HealthAiResponse;

/**
 * 查询食物列表
 * 
 * @author yangsongbo
 *
 */
public class SearchFoodDetailResponse extends HealthAiResponse {

	private static final long serialVersionUID = 1L;

	
	/**
     * 食物ID
     */
    private String foodId;

    /**
     * 食物名称
     */
    private String foodName;
    
    /**
     * 食物图片
     */
    private String foodImageUrl;

    /**
     * 食物单位
     */
    private String unit;

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
    private double protein;

    /**
     * 脂肪
     */
    private double fat;

    /**
     * 碳水化合物
     */
    private double carbohydrate;

    /**
     * 水分
     */
    private double moisture;

    /**
     * 胆固醇
     */
    private double cholesterol;

    /**
     * 食部
     */
    private double ediblePart;

    /**
     * 不溶性纤维
     */
    private double solkfloc;

    /**
     * 维生素B1
     */
    private double vitaminB1;

    /**
     * 维生素B2
     */
    private double vitaminB2;

    /**
     * 维生素C
     */
    private double vitaminC;

    /**
     * 维生素B6
     */
    private double vitaminB6;

    /**
     * 维生素B12
     */
    private double vitaminB12;

    /**
     * 维生素B3(烟酸)
     */
    private double vitaminB3;

    /**
     * 维生素B5(泛酸)
     */
    private double vitaminB5;

    /**
     * 维生素B9(叶酸)
     */
    private double vitaminB9;

    /**
     * 维生素A
     */
    private double vitaminA;

    /**
     * 维生素D
     */
    private double vitaminD;

    /**
     * 维生素E
     */
    private double vitaminE;

    /**
     * 维生素K
     */
    private double vitaminK;

    /**
     * 赖氨酸
     */
    private double lysine;

    /**
     * 色氨酸
     */
    private double tryptophan;

    /**
     * 缬氨酸
     */
    private double valine;

    /**
     * 苯丙氨酸
     */
    private double phenylalanine;

    /**
     * 苏氨酸
     */
    private double threonine;

    /**
     * 异亮氨酸
     */
    private double isoleucine;

    /**
     * 亮氨酸
     */
    private double leucine;

    /**
     * 蛋氨酸
     */
    private double methionine;

    /**
     * 精氨酸
     */
    private double arginine;

    /**
     * 谷氨酸
     */
    private double glutamic;

    /**
     * 组氨酸
     */
    private double histidine;

    /**
     * 丙氨酸
     */
    private double alanine;

    /**
     * 甘氨酸
     */
    private double glycine;

    /**
     * 脯氨酸
     */
    private double proline;

    /**
     * 丝氨酸
     */
    private double serine;

    /**
     * 天冬氨酸
     */
    private double aspartic;

    /**
     * 钙
     */
    private double calcium;

    /**
     * 磷
     */
    private double phosphorus;

    /**
     * 钾
     */
    private double potassium;

    /**
     * 钠
     */
    private double sodium;
    /** 镁(mg) */
    private double magnesium;

    /**
     * 铜
     */
    private double copper;

    /**
     * 铁
     */
    private double iron;

    /**
     * 锌
     */
    private double zinc;

    /**
     * 锰
     */
    private double manganese;

    /**
     * 碘
     */
    private double iodine;

    /**
     * 铬
     */
    private double chromium;

    /**
     * 氟
     */
    private double fluorine;

    /**
     * 硒
     */
    private double selenium;

    /**
     * 总脂肪酸
     */
    private double totalFattyAcid;

    /**
     * 饱和脂肪酸
     */
    private double saturatedFattyAcid;

    /**
     * 单不饱和脂肪酸
     */
    private double monounsaturatedFattyAcid;

    /**
     * 多不饱和脂肪酸
     */
    private double polyunsaturatedFattyAcid;

    /**
     * 单不饱和脂肪酸占比
     */
    private double mfaPercent;

    /**
     * 多不饱和脂肪酸占比
     */
    private double pfaPercent;

    /**
     * 饱和脂肪酸占比
     */
    private double sfaPercent;

    /**
     * 胡萝卜素
     */
    private double carotene;

    /**
     * 大豆异黄酮
     */
    private double soyIsoflavone;

    /**
     * GI（血糖生成指数）
     */
    private double gi;

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

	public String getFoodImageUrl() {
		return foodImageUrl;
	}

	public void setFoodImageUrl(String foodImageUrl) {
		this.foodImageUrl = foodImageUrl;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
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

	public double getProtein() {
		return protein;
	}

	public void setProtein(double protein) {
		this.protein = protein;
	}

	public double getFat() {
		return fat;
	}

	public void setFat(double fat) {
		this.fat = fat;
	}

	public double getCarbohydrate() {
		return carbohydrate;
	}

	public void setCarbohydrate(double carbohydrate) {
		this.carbohydrate = carbohydrate;
	}

	public double getMoisture() {
		return moisture;
	}

	public void setMoisture(double moisture) {
		this.moisture = moisture;
	}

	public double getCholesterol() {
		return cholesterol;
	}

	public void setCholesterol(double cholesterol) {
		this.cholesterol = cholesterol;
	}

	public double getEdiblePart() {
		return ediblePart;
	}

	public void setEdiblePart(double ediblePart) {
		this.ediblePart = ediblePart;
	}

	public double getSolkfloc() {
		return solkfloc;
	}

	public void setSolkfloc(double solkfloc) {
		this.solkfloc = solkfloc;
	}

	public double getVitaminB1() {
		return vitaminB1;
	}

	public void setVitaminB1(double vitaminB1) {
		this.vitaminB1 = vitaminB1;
	}

	public double getVitaminB2() {
		return vitaminB2;
	}

	public void setVitaminB2(double vitaminB2) {
		this.vitaminB2 = vitaminB2;
	}

	public double getVitaminC() {
		return vitaminC;
	}

	public void setVitaminC(double vitaminC) {
		this.vitaminC = vitaminC;
	}

	public double getVitaminB6() {
		return vitaminB6;
	}

	public void setVitaminB6(double vitaminB6) {
		this.vitaminB6 = vitaminB6;
	}

	public double getVitaminB12() {
		return vitaminB12;
	}

	public void setVitaminB12(double vitaminB12) {
		this.vitaminB12 = vitaminB12;
	}

	public double getVitaminB3() {
		return vitaminB3;
	}

	public void setVitaminB3(double vitaminB3) {
		this.vitaminB3 = vitaminB3;
	}

	public double getVitaminB5() {
		return vitaminB5;
	}

	public void setVitaminB5(double vitaminB5) {
		this.vitaminB5 = vitaminB5;
	}

	public double getVitaminB9() {
		return vitaminB9;
	}

	public void setVitaminB9(double vitaminB9) {
		this.vitaminB9 = vitaminB9;
	}

	public double getVitaminA() {
		return vitaminA;
	}

	public void setVitaminA(double vitaminA) {
		this.vitaminA = vitaminA;
	}

	public double getVitaminD() {
		return vitaminD;
	}

	public void setVitaminD(double vitaminD) {
		this.vitaminD = vitaminD;
	}

	public double getVitaminE() {
		return vitaminE;
	}

	public void setVitaminE(double vitaminE) {
		this.vitaminE = vitaminE;
	}

	public double getVitaminK() {
		return vitaminK;
	}

	public void setVitaminK(double vitaminK) {
		this.vitaminK = vitaminK;
	}

	public double getLysine() {
		return lysine;
	}

	public void setLysine(double lysine) {
		this.lysine = lysine;
	}

	public double getTryptophan() {
		return tryptophan;
	}

	public void setTryptophan(double tryptophan) {
		this.tryptophan = tryptophan;
	}

	public double getValine() {
		return valine;
	}

	public void setValine(double valine) {
		this.valine = valine;
	}

	public double getPhenylalanine() {
		return phenylalanine;
	}

	public void setPhenylalanine(double phenylalanine) {
		this.phenylalanine = phenylalanine;
	}

	public double getThreonine() {
		return threonine;
	}

	public void setThreonine(double threonine) {
		this.threonine = threonine;
	}

	public double getIsoleucine() {
		return isoleucine;
	}

	public void setIsoleucine(double isoleucine) {
		this.isoleucine = isoleucine;
	}

	public double getLeucine() {
		return leucine;
	}

	public void setLeucine(double leucine) {
		this.leucine = leucine;
	}

	public double getMethionine() {
		return methionine;
	}

	public void setMethionine(double methionine) {
		this.methionine = methionine;
	}

	public double getArginine() {
		return arginine;
	}

	public void setArginine(double arginine) {
		this.arginine = arginine;
	}

	public double getGlutamic() {
		return glutamic;
	}

	public void setGlutamic(double glutamic) {
		this.glutamic = glutamic;
	}

	public double getHistidine() {
		return histidine;
	}

	public void setHistidine(double histidine) {
		this.histidine = histidine;
	}

	public double getAlanine() {
		return alanine;
	}

	public void setAlanine(double alanine) {
		this.alanine = alanine;
	}

	public double getGlycine() {
		return glycine;
	}

	public void setGlycine(double glycine) {
		this.glycine = glycine;
	}

	public double getProline() {
		return proline;
	}

	public void setProline(double proline) {
		this.proline = proline;
	}

	public double getSerine() {
		return serine;
	}

	public void setSerine(double serine) {
		this.serine = serine;
	}

	public double getAspartic() {
		return aspartic;
	}

	public void setAspartic(double aspartic) {
		this.aspartic = aspartic;
	}

	public double getCalcium() {
		return calcium;
	}

	public void setCalcium(double calcium) {
		this.calcium = calcium;
	}

	public double getPhosphorus() {
		return phosphorus;
	}

	public void setPhosphorus(double phosphorus) {
		this.phosphorus = phosphorus;
	}

	public double getPotassium() {
		return potassium;
	}

	public void setPotassium(double potassium) {
		this.potassium = potassium;
	}

	public double getSodium() {
		return sodium;
	}

	public void setSodium(double sodium) {
		this.sodium = sodium;
	}

	public double getMagnesium() {
		return magnesium;
	}

	public void setMagnesium(double magnesium) {
		this.magnesium = magnesium;
	}

	public double getCopper() {
		return copper;
	}

	public void setCopper(double copper) {
		this.copper = copper;
	}

	public double getIron() {
		return iron;
	}

	public void setIron(double iron) {
		this.iron = iron;
	}

	public double getZinc() {
		return zinc;
	}

	public void setZinc(double zinc) {
		this.zinc = zinc;
	}

	public double getManganese() {
		return manganese;
	}

	public void setManganese(double manganese) {
		this.manganese = manganese;
	}

	public double getIodine() {
		return iodine;
	}

	public void setIodine(double iodine) {
		this.iodine = iodine;
	}

	public double getChromium() {
		return chromium;
	}

	public void setChromium(double chromium) {
		this.chromium = chromium;
	}

	public double getFluorine() {
		return fluorine;
	}

	public void setFluorine(double fluorine) {
		this.fluorine = fluorine;
	}

	public double getSelenium() {
		return selenium;
	}

	public void setSelenium(double selenium) {
		this.selenium = selenium;
	}

	public double getTotalFattyAcid() {
		return totalFattyAcid;
	}

	public void setTotalFattyAcid(double totalFattyAcid) {
		this.totalFattyAcid = totalFattyAcid;
	}

	public double getSaturatedFattyAcid() {
		return saturatedFattyAcid;
	}

	public void setSaturatedFattyAcid(double saturatedFattyAcid) {
		this.saturatedFattyAcid = saturatedFattyAcid;
	}

	public double getMonounsaturatedFattyAcid() {
		return monounsaturatedFattyAcid;
	}

	public void setMonounsaturatedFattyAcid(double monounsaturatedFattyAcid) {
		this.monounsaturatedFattyAcid = monounsaturatedFattyAcid;
	}

	public double getPolyunsaturatedFattyAcid() {
		return polyunsaturatedFattyAcid;
	}

	public void setPolyunsaturatedFattyAcid(double polyunsaturatedFattyAcid) {
		this.polyunsaturatedFattyAcid = polyunsaturatedFattyAcid;
	}

	public double getMfaPercent() {
		return mfaPercent;
	}

	public void setMfaPercent(double mfaPercent) {
		this.mfaPercent = mfaPercent;
	}

	public double getPfaPercent() {
		return pfaPercent;
	}

	public void setPfaPercent(double pfaPercent) {
		this.pfaPercent = pfaPercent;
	}

	public double getSfaPercent() {
		return sfaPercent;
	}

	public void setSfaPercent(double sfaPercent) {
		this.sfaPercent = sfaPercent;
	}

	public double getCarotene() {
		return carotene;
	}

	public void setCarotene(double carotene) {
		this.carotene = carotene;
	}

	public double getSoyIsoflavone() {
		return soyIsoflavone;
	}

	public void setSoyIsoflavone(double soyIsoflavone) {
		this.soyIsoflavone = soyIsoflavone;
	}

	public double getGi() {
		return gi;
	}

	public void setGi(double gi) {
		this.gi = gi;
	}

	@Override
	public String toString() {
		return "SearchFoodDetailResponse [foodId=" + foodId + ", foodName=" + foodName + ", foodImageUrl="
				+ foodImageUrl + ", unit=" + unit + ", heat=" + heat + ", heatKJ=" + heatKJ + ", protein=" + protein
				+ ", fat=" + fat + ", carbohydrate=" + carbohydrate + ", moisture=" + moisture + ", cholesterol="
				+ cholesterol + ", ediblePart=" + ediblePart + ", solkfloc=" + solkfloc + ", vitaminB1=" + vitaminB1
				+ ", vitaminB2=" + vitaminB2 + ", vitaminC=" + vitaminC + ", vitaminB6=" + vitaminB6 + ", vitaminB12="
				+ vitaminB12 + ", vitaminB3=" + vitaminB3 + ", vitaminB5=" + vitaminB5 + ", vitaminB9=" + vitaminB9
				+ ", vitaminA=" + vitaminA + ", vitaminD=" + vitaminD + ", vitaminE=" + vitaminE + ", vitaminK="
				+ vitaminK + ", lysine=" + lysine + ", tryptophan=" + tryptophan + ", valine=" + valine
				+ ", phenylalanine=" + phenylalanine + ", threonine=" + threonine + ", isoleucine=" + isoleucine
				+ ", leucine=" + leucine + ", methionine=" + methionine + ", arginine=" + arginine + ", glutamic="
				+ glutamic + ", histidine=" + histidine + ", alanine=" + alanine + ", glycine=" + glycine + ", proline="
				+ proline + ", serine=" + serine + ", aspartic=" + aspartic + ", calcium=" + calcium + ", phosphorus="
				+ phosphorus + ", potassium=" + potassium + ", sodium=" + sodium + ", magnesium=" + magnesium
				+ ", copper=" + copper + ", iron=" + iron + ", zinc=" + zinc + ", manganese=" + manganese + ", iodine="
				+ iodine + ", chromium=" + chromium + ", fluorine=" + fluorine + ", selenium=" + selenium
				+ ", totalFattyAcid=" + totalFattyAcid + ", saturatedFattyAcid=" + saturatedFattyAcid
				+ ", monounsaturatedFattyAcid=" + monounsaturatedFattyAcid + ", polyunsaturatedFattyAcid="
				+ polyunsaturatedFattyAcid + ", mfaPercent=" + mfaPercent + ", pfaPercent=" + pfaPercent
				+ ", sfaPercent=" + sfaPercent + ", carotene=" + carotene + ", soyIsoflavone=" + soyIsoflavone + ", gi="
				+ gi + "]";
	}

	
}
