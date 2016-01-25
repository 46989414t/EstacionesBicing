package com.estacionesbicing.estacionesbicing.provider.estacio;

import java.util.Date;

import android.content.Context;
import android.content.ContentResolver;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.estacionesbicing.estacionesbicing.provider.base.AbstractContentValues;

/**
 * Content values wrapper for the {@code estacio} table.
 */
public class EstacioContentValues extends AbstractContentValues {
    @Override
    public Uri uri() {
        return EstacioColumns.CONTENT_URI;
    }

    /**
     * Update row(s) using the values stored by this object and the given selection.
     *
     * @param contentResolver The content resolver to use.
     * @param where The selection to use (can be {@code null}).
     */
    public int update(ContentResolver contentResolver, @Nullable EstacioSelection where) {
        return contentResolver.update(uri(), values(), where == null ? null : where.sel(), where == null ? null : where.args());
    }

    /**
     * Update row(s) using the values stored by this object and the given selection.
     *
     * @param contentResolver The content resolver to use.
     * @param where The selection to use (can be {@code null}).
     */
    public int update(Context context, @Nullable EstacioSelection where) {
        return context.getContentResolver().update(uri(), values(), where == null ? null : where.sel(), where == null ? null : where.args());
    }

    public EstacioContentValues putType(@Nullable String value) {
        mContentValues.put(EstacioColumns.TYPE, value);
        return this;
    }

    public EstacioContentValues putTypeNull() {
        mContentValues.putNull(EstacioColumns.TYPE);
        return this;
    }

    public EstacioContentValues putLatitude(@Nullable String value) {
        mContentValues.put(EstacioColumns.LATITUDE, value);
        return this;
    }

    public EstacioContentValues putLatitudeNull() {
        mContentValues.putNull(EstacioColumns.LATITUDE);
        return this;
    }

    public EstacioContentValues putLongitude(@Nullable String value) {
        mContentValues.put(EstacioColumns.LONGITUDE, value);
        return this;
    }

    public EstacioContentValues putLongitudeNull() {
        mContentValues.putNull(EstacioColumns.LONGITUDE);
        return this;
    }

    public EstacioContentValues putStreetname(@Nullable String value) {
        mContentValues.put(EstacioColumns.STREETNAME, value);
        return this;
    }

    public EstacioContentValues putStreetnameNull() {
        mContentValues.putNull(EstacioColumns.STREETNAME);
        return this;
    }

    public EstacioContentValues putStreetnumber(@Nullable String value) {
        mContentValues.put(EstacioColumns.STREETNUMBER, value);
        return this;
    }

    public EstacioContentValues putStreetnumberNull() {
        mContentValues.putNull(EstacioColumns.STREETNUMBER);
        return this;
    }

    public EstacioContentValues putAltitude(@Nullable String value) {
        mContentValues.put(EstacioColumns.ALTITUDE, value);
        return this;
    }

    public EstacioContentValues putAltitudeNull() {
        mContentValues.putNull(EstacioColumns.ALTITUDE);
        return this;
    }

    public EstacioContentValues putSlots(@Nullable String value) {
        mContentValues.put(EstacioColumns.SLOTS, value);
        return this;
    }

    public EstacioContentValues putSlotsNull() {
        mContentValues.putNull(EstacioColumns.SLOTS);
        return this;
    }

    public EstacioContentValues putBikes(@Nullable String value) {
        mContentValues.put(EstacioColumns.BIKES, value);
        return this;
    }

    public EstacioContentValues putBikesNull() {
        mContentValues.putNull(EstacioColumns.BIKES);
        return this;
    }

    public EstacioContentValues putNearbystations(@Nullable String value) {
        mContentValues.put(EstacioColumns.NEARBYSTATIONS, value);
        return this;
    }

    public EstacioContentValues putNearbystationsNull() {
        mContentValues.putNull(EstacioColumns.NEARBYSTATIONS);
        return this;
    }

    public EstacioContentValues putStatus(@Nullable String value) {
        mContentValues.put(EstacioColumns.STATUS, value);
        return this;
    }

    public EstacioContentValues putStatusNull() {
        mContentValues.putNull(EstacioColumns.STATUS);
        return this;
    }
}
