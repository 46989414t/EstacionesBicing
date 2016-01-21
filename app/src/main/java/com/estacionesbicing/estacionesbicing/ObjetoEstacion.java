package com.estacionesbicing.estacionesbicing;

import java.util.ArrayList;
import java.util.List;


public class ObjetoEstacion {


    private List<Station> stations = new ArrayList<Station>();

    private Integer updateTime;

    /**
     *
     * @return
     * The stations
     */
    public List<Station> getStations() {
        return stations;
    }

    /**
     *
     * @param stations
     * The stations
     */
    public void setStations(List<Station> stations) {
        this.stations = stations;
    }

    /**
     *
     * @return
     * The updateTime
     */
    public Integer getUpdateTime() {
        return updateTime;
    }

    /**
     *
     * @param updateTime
     * The updateTime
     */
    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

}