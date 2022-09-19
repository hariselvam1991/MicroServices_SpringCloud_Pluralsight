package com.pluralsight.dataservice2;

public class VehicleDetails {

    private String customerId; 
    private String carType;
    private String licensePlate;

    public VehicleDetails(String customerId, String carType, String licensePlate) {
        this.customerId = customerId;
        this.carType = carType;
        this.licensePlate = licensePlate;
    }

    public VehicleDetails() {
    }

    public String getCustomerId() {
        return customerId;
    }
    public String getLicensePlate() {
        return licensePlate;
    }
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
    public String getCarType() {
        return carType;
    }
    public void setCarType(String carType) {
        this.carType = carType;
    }
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    
}
