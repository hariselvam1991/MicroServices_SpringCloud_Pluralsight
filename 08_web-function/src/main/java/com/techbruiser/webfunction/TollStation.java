package com.techbruiser.webfunction;

public class TollStation {

    private String stationId;

    public TollStation(String stationId, Float mileMaker, Integer stallCount) {
        this.stationId = stationId;
        this.mileMaker = mileMaker;
        this.stallCount = stallCount;
    }

    private Float mileMaker;

    private Integer stallCount;

    public Integer getStallCount() {
        return stallCount;
    }

    public Float getMileMaker() {
        return mileMaker;
    }

    public void setMileMaker(Float mileMaker) {
        this.mileMaker = mileMaker;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public void setStallCount(Integer stallCount) {
        this.stallCount = stallCount;
    }
    
}
