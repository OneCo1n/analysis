package com.cnpc.analysis.bean;

/**
 * ClassName: Bill
 * Description:
 * date: 2021/11/18 10:29
 *
 * @author guoweizhou
 * @since JDK 1.8
 */

public class BillBean {

    private String material;
    private String plant;
    private String date;
    private int quantity;

    public BillBean() {
    }

    public BillBean(String material, String plant, String date, int quantity) {
        this.material = material;
        this.plant = plant;
        this.date = date;
        this.quantity = quantity;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getPlant() {
        return plant;
    }

    public void setPlant(String plant) {
        this.plant = plant;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "material='" + material + '\'' +
                ", plant='" + plant + '\'' +
                ", date='" + date + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
