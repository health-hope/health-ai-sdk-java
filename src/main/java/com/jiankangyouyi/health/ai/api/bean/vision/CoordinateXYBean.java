package com.jiankangyouyi.health.ai.api.bean.vision;

/**
 * TODO: X和Y坐标
 *
 * @author yangsongbo
 * @date 2019年2月1日
 */
public class CoordinateXYBean {

    /**
     * X坐标
     */
    private float x;

    /**
     * Y坐标
     */
    private float y;

    public CoordinateXYBean() {
        super();
    }

    public CoordinateXYBean(float x, float y) {
        super();
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

}
