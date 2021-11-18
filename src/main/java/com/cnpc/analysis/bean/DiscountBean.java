package com.cnpc.analysis.bean;

/**
 * ClassName: DiscountBean
 * Description:
 * date: 2021/11/18 14:43
 *
 * @author guoweizhou
 * @since JDK 1.8
 */
public class DiscountBean {

    private String plant;
    private String calday;
    private String discountRate;

    public DiscountBean() {
    }

    public DiscountBean(String plant, String calday, String discountRate) {
        this.plant = plant;
        this.calday = calday;
        this.discountRate = discountRate;
    }

    public String getPlant() {
        return plant;
    }

    public void setPlant(String plant) {
        this.plant = plant;
    }

    public String getCalday() {
        return calday;
    }

    public void setCalday(String calday) {
        this.calday = calday;
    }

    public String getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(String discountRate) {
        this.discountRate = discountRate;
    }

    @Override
    public String toString() {
        return "DiscountBean{" +
                "plant='" + plant + '\'' +
                ", calday='" + calday + '\'' +
                ", discountRate='" + discountRate + '\'' +
                '}';
    }
}
