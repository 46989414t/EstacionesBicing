package com.estacionesbicing.estacionesbicing.provider.estacio;

import java.util.Date;

import android.database.Cursor;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.estacionesbicing.estacionesbicing.provider.base.AbstractCursor;

/**
 * Cursor wrapper for the {@code estacio} table.
 */
public class EstacioCursor extends AbstractCursor implements EstacioModel {
    public EstacioCursor(Cursor cursor) {
        super(cursor);
    }

    /**
     * Primary key.
     */
    public long getId() {
        Long res = getLongOrNull(EstacioColumns._ID);
        if (res == null)
            throw new NullPointerException("The value of '_id' in the database was null, which is not allowed according to the model definition");
        return res;
    }

    /**
     * Get the {@code type} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getType() {
        String res = getStringOrNull(EstacioColumns.TYPE);
        return res;
    }

    /**
     * Get the {@code latitude} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getLatitude() {
        String res = getStringOrNull(EstacioColumns.LATITUDE);
        return res;
    }

    /**
     * Get the {@code longitude} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getLongitude() {
        String res = getStringOrNull(EstacioColumns.LONGITUDE);
        return res;
    }

    /**
     * Get the {@code streetname} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getStreetname() {
        String res = getStringOrNull(EstacioColumns.STREETNAME);
        return res;
    }

    /**
     * Get the {@code streetnumber} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getStreetnumber() {
        String res = getStringOrNull(EstacioColumns.STREETNUMBER);
        return res;
    }

    /**
     * Get the {@code altitude} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getAltitude() {
        String res = getStringOrNull(EstacioColumns.ALTITUDE);
        return res;
    }

    /**
     * Get the {@code slots} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getSlots() {
        String res = getStringOrNull(EstacioColumns.SLOTS);
        return res;
    }

    /**
     * Get the {@code bikes} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getBikes() {
        String res = getStringOrNull(EstacioColumns.BIKES);
        return res;
    }

    /**
     * Get the {@code nearbystations} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getNearbystations() {
        String res = getStringOrNull(EstacioColumns.NEARBYSTATIONS);
        return res;
    }

    /**
     * Get the {@code status} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getStatus() {
        String res = getStringOrNull(EstacioColumns.STATUS);
        return res;
    }
}
