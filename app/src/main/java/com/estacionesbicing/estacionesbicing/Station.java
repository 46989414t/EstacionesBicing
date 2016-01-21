package com.estacionesbicing.estacionesbicing;


public class Station {


    private String id;

    private String type;

    private String latitude;

    private String longitude;

    private String streetName;

    private String streetNumber;

    private String altitude;
    private String slots;

    private String bikes;

    private String nearbyStations;

    private String status;

    /**
     *
     * @return
     * The id
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The latitude
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     *
     * @param latitude
     * The latitude
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     *
     * @return
     * The longitude
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     *
     * @param longitude
     * The longitude
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     *
     * @return
     * The streetName
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     *
     * @param streetName
     * The streetName
     */
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    /**
     *
     * @return
     * The streetNumber
     */
    public String getStreetNumber() {
        return streetNumber;
    }

    /**
     *
     * @param streetNumber
     * The streetNumber
     */
    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    /**
     *
     * @return
     * The altitude
     */
    public String getAltitude() {
        return altitude;
    }

    /**
     *
     * @param altitude
     * The altitude
     */
    public void setAltitude(String altitude) {
        this.altitude = altitude;
    }

    /**
     *
     * @return
     * The slots
     */
    public String getSlots() {
        return slots;
    }

    /**
     *
     * @param slots
     * The slots
     */
    public void setSlots(String slots) {
        this.slots = slots;
    }

    /**
     *
     * @return
     * The bikes
     */
    public String getBikes() {
        return bikes;
    }

    /**
     *
     * @param bikes
     * The bikes
     */
    public void setBikes(String bikes) {
        this.bikes = bikes;
    }

    /**
     *
     * @return
     * The nearbyStations
     */
    public String getNearbyStations() {
        return nearbyStations;
    }

    /**
     *
     * @param nearbyStations
     * The nearbyStations
     */
    public void setNearbyStations(String nearbyStations) {
        this.nearbyStations = nearbyStations;
    }

    /**
     *
     * @return
     * The status
     */
    public String getStatus() {
        return status;
    }

    /**
     *
     * @param status
     * The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

}