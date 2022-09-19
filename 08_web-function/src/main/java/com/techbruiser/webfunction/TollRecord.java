package com.techbruiser.webfunction;

public class TollRecord {

    private String stationId;

    private String licensePlate;

    private String timestamp;

    public TollRecord(String stationId, String licensePlate, String timestamp) {
        this.stationId = stationId;
        this.licensePlate = licensePlate;
        this.timestamp = timestamp;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    
    
}
