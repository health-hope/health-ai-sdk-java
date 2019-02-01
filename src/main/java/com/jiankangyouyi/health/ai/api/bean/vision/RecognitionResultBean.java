package com.jiankangyouyi.health.ai.api.bean.vision;

/**
 * TODO:识别结果父类
 *
 * @author yangsongbo
 * @date 2019年2月1日
 */
public class RecognitionResultBean {

    /**
     * 图片宽度
     */
    private int imageWidth;

    /**
     * 图片高度
     */
    private int imageHeight;

    /**
     * 面部区域右边界
     */
    private int right;

    /**
     * 面部区域右边界
     */
    private int left;

    /**
     * 面部区域上边界
     */
    private int top;

    /**
     * 面部区域下边界
     */
    private int bottom;

    /**
     * 识别类型,如：一字眉
     */
    private String shape;

    public int getImageWidth() {
        return imageWidth;
    }

    public void setImageWidth(int imageWidth) {
        this.imageWidth = imageWidth;
    }

    public int getImageHeight() {
        return imageHeight;
    }

    public void setImageHeight(int imageHeight) {
        this.imageHeight = imageHeight;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getBottom() {
        return bottom;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

}
