package com.techbruiser.customerservice;

public class CustomerDetails {

    private String contactId;
    private String contactName;
    private String postalCode;
    private String carType;
    private String licensePlate;
    public String getContactId() {
        return contactId;
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
    public String getPostalCode() {
        return postalCode;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    public String getContactName() {
        return contactName;
    }
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }
    public void setContactId(String contactId) {
        this.contactId = contactId;
    }
    
}
