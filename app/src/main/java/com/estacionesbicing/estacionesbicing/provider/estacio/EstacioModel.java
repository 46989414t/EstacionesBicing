package com.estacionesbicing.estacionesbicing.provider.estacio;

import com.estacionesbicing.estacionesbicing.provider.base.BaseModel;

import java.util.Date;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Data model for the {@code estacio} table.
 */
public interface EstacioModel extends BaseModel {

    /**
     * Get the {@code type} value.
     * Can be {@code null}.
     */
    @Nullable
    String getType();

    /**
     * Get the {@code latitude} value.
     * Can be {@code null}.
     */
    @Nullable
    String getLatitude();

    /**
     * Get the {@code longitude} value.
     * Can be {@code null}.
     */
    @Nullable
    String getLongitude();

    /**
     * Get the {@code streetname} value.
     * Can be {@code null}.
     */
    @Nullable
    String getStreetname();

    /**
     * Get the {@code streetnumber} value.
     * Can be {@code null}.
     */
    @Nullable
    String getStreetnumber();

    /**
     * Get the {@code altitude} value.
     * Can be {@code null}.
     */
    @Nullable
    String getAltitude();

    /**
     * Get the {@code slots} value.
     * Can be {@code null}.
     */
    @Nullable
    String getSlots();

    /**
     * Get the {@code bikes} value.
     * Can be {@code null}.
     */
    @Nullable
    String getBikes();

    /**
     * Get the {@code nearbystations} value.
     * Can be {@code null}.
     */
    @Nullable
    String getNearbystations();

    /**
     * Get the {@code status} value.
     * Can be {@code null}.
     */
    @Nullable
    String getStatus();
}
