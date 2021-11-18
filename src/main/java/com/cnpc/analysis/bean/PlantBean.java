package com.cnpc.analysis.bean;

/**
 * ClassName: PlantBean
 * Description:
 * date: 2021/11/18 16:11
 *
 * @author guoweizhou
 * @since JDK 1.8
 */

public class PlantBean {

    private String plant;
    private String date;
    private int numberStation;
    private int numberStore;
    private String plantAsset;
    private String roadClass;
    private String plantStars;
    private String storeClass;
    private String buildingArea;
    private String businessHall;
    private String pakingArea;
    private String storeArea;
    private String plantClassCode;
    private String plantLocationClass;
    private String plantKeyanliangDesc;
    private String plantTypeDesc;

    public PlantBean() {
    }

    public PlantBean(String plant, String date, int numberStation, int numberStore, String plantAsset,
                     String roadClass, String plantStars, String storeClass, String buildingArea,
                     String businessHall, String pakingArea, String storeArea, String plantClassCode,
                     String plantLocationClass, String plantKeyanliangDesc, String plantTypeDesc) {
        this.plant = plant;
        this.date = date;
        this.numberStation = numberStation;
        this.numberStore = numberStore;
        this.plantAsset = plantAsset;
        this.roadClass = roadClass;
        this.plantStars = plantStars;
        this.storeClass = storeClass;
        this.buildingArea = buildingArea;
        this.businessHall = businessHall;
        this.pakingArea = pakingArea;
        this.storeArea = storeArea;
        this.plantClassCode = plantClassCode;
        this.plantLocationClass = plantLocationClass;
        this.plantKeyanliangDesc = plantKeyanliangDesc;
        this.plantTypeDesc = plantTypeDesc;
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

    public String getPakingArea() {
        return pakingArea;
    }

    public void setPakingArea(String pakingArea) {
        this.pakingArea = pakingArea;
    }

    public int getNumberStation() {
        return numberStation;
    }

    public void setNumberStation(int numberStation) {
        this.numberStation = numberStation;
    }

    public int getNumberStore() {
        return numberStore;
    }

    public void setNumberStore(int numberStore) {
        this.numberStore = numberStore;
    }

    public String getPlantAsset() {
        return plantAsset;
    }

    public void setPlantAsset(String plantAsset) {
        this.plantAsset = plantAsset;
    }

    public String getRoadClass() {
        return roadClass;
    }

    public void setRoadClass(String roadClass) {
        this.roadClass = roadClass;
    }

    public String getPlantStars() {
        return plantStars;
    }

    public void setPlantStars(String plantStars) {
        this.plantStars = plantStars;
    }

    public String getStoreClass() {
        return storeClass;
    }

    public void setStoreClass(String storeClass) {
        this.storeClass = storeClass;
    }

    public String getBuildingArea() {
        return buildingArea;
    }

    public void setBuildingArea(String buildingArea) {
        this.buildingArea = buildingArea;
    }

    public String getBusinessHall() {
        return businessHall;
    }

    public void setBusinessHall(String businessHall) {
        this.businessHall = businessHall;
    }

    public String getStoreArea() {
        return storeArea;
    }

    public void setStoreArea(String storeArea) {
        this.storeArea = storeArea;
    }

    public String getPlantClassCode() {
        return plantClassCode;
    }

    public void setPlantClassCode(String plantClassCode) {
        this.plantClassCode = plantClassCode;
    }

    public String getPlantLocationClass() {
        return plantLocationClass;
    }

    public void setPlantLocationClass(String plantLocationClass) {
        this.plantLocationClass = plantLocationClass;
    }

    public String getPlantKeyanliangDesc() {
        return plantKeyanliangDesc;
    }

    public void setPlantKeyanliangDesc(String plantKeyanliangDesc) {
        this.plantKeyanliangDesc = plantKeyanliangDesc;
    }

    public String getPlantTypeDesc() {
        return plantTypeDesc;
    }

    public void setPlantTypeDesc(String plantTypeDesc) {
        this.plantTypeDesc = plantTypeDesc;
    }

    @Override
    public String toString() {
        return "PlantBean{" +
                "plant='" + plant + '\'' +
                ", date='" + date + '\'' +
                ", numberStation=" + numberStation +
                ", numberStore=" + numberStore +
                ", plantAsset='" + plantAsset + '\'' +
                ", roadClass='" + roadClass + '\'' +
                ", plantStars='" + plantStars + '\'' +
                ", storeClass='" + storeClass + '\'' +
                ", buildingArea='" + buildingArea + '\'' +
                ", businessHall='" + businessHall + '\'' +
                ", pakingArea='" + pakingArea + '\'' +
                ", storeArea='" + storeArea + '\'' +
                ", plantClassCode='" + plantClassCode + '\'' +
                ", plantLocationClass='" + plantLocationClass + '\'' +
                ", plantKeyanliangDesc='" + plantKeyanliangDesc + '\'' +
                ", plantTypeDesc='" + plantTypeDesc + '\'' +
                '}';
    }
}
