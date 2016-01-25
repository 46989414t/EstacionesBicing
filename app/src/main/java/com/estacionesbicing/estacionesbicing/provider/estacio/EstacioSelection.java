package com.estacionesbicing.estacionesbicing.provider.estacio;

import java.util.Date;

import android.content.Context;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;

import com.estacionesbicing.estacionesbicing.provider.base.AbstractSelection;

/**
 * Selection for the {@code estacio} table.
 */
public class EstacioSelection extends AbstractSelection<EstacioSelection> {
    @Override
    protected Uri baseUri() {
        return EstacioColumns.CONTENT_URI;
    }

    /**
     * Query the given content resolver using this selection.
     *
     * @param contentResolver The content resolver to query.
     * @param projection A list of which columns to return. Passing null will return all columns, which is inefficient.
     * @return A {@code EstacioCursor} object, which is positioned before the first entry, or null.
     */
    public EstacioCursor query(ContentResolver contentResolver, String[] projection) {
        Cursor cursor = contentResolver.query(uri(), projection, sel(), args(), order());
        if (cursor == null) return null;
        return new EstacioCursor(cursor);
    }

    /**
     * Equivalent of calling {@code query(contentResolver, null)}.
     */
    public EstacioCursor query(ContentResolver contentResolver) {
        return query(contentResolver, null);
    }

    /**
     * Query the given content resolver using this selection.
     *
     * @param context The context to use for the query.
     * @param projection A list of which columns to return. Passing null will return all columns, which is inefficient.
     * @return A {@code EstacioCursor} object, which is positioned before the first entry, or null.
     */
    public EstacioCursor query(Context context, String[] projection) {
        Cursor cursor = context.getContentResolver().query(uri(), projection, sel(), args(), order());
        if (cursor == null) return null;
        return new EstacioCursor(cursor);
    }

    /**
     * Equivalent of calling {@code query(context, null)}.
     */
    public EstacioCursor query(Context context) {
        return query(context, null);
    }


    public EstacioSelection id(long... value) {
        addEquals("estacio." + EstacioColumns._ID, toObjectArray(value));
        return this;
    }

    public EstacioSelection idNot(long... value) {
        addNotEquals("estacio." + EstacioColumns._ID, toObjectArray(value));
        return this;
    }

    public EstacioSelection orderById(boolean desc) {
        orderBy("estacio." + EstacioColumns._ID, desc);
        return this;
    }

    public EstacioSelection orderById() {
        return orderById(false);
    }

    public EstacioSelection type(String... value) {
        addEquals(EstacioColumns.TYPE, value);
        return this;
    }

    public EstacioSelection typeNot(String... value) {
        addNotEquals(EstacioColumns.TYPE, value);
        return this;
    }

    public EstacioSelection typeLike(String... value) {
        addLike(EstacioColumns.TYPE, value);
        return this;
    }

    public EstacioSelection typeContains(String... value) {
        addContains(EstacioColumns.TYPE, value);
        return this;
    }

    public EstacioSelection typeStartsWith(String... value) {
        addStartsWith(EstacioColumns.TYPE, value);
        return this;
    }

    public EstacioSelection typeEndsWith(String... value) {
        addEndsWith(EstacioColumns.TYPE, value);
        return this;
    }

    public EstacioSelection orderByType(boolean desc) {
        orderBy(EstacioColumns.TYPE, desc);
        return this;
    }

    public EstacioSelection orderByType() {
        orderBy(EstacioColumns.TYPE, false);
        return this;
    }

    public EstacioSelection latitude(String... value) {
        addEquals(EstacioColumns.LATITUDE, value);
        return this;
    }

    public EstacioSelection latitudeNot(String... value) {
        addNotEquals(EstacioColumns.LATITUDE, value);
        return this;
    }

    public EstacioSelection latitudeLike(String... value) {
        addLike(EstacioColumns.LATITUDE, value);
        return this;
    }

    public EstacioSelection latitudeContains(String... value) {
        addContains(EstacioColumns.LATITUDE, value);
        return this;
    }

    public EstacioSelection latitudeStartsWith(String... value) {
        addStartsWith(EstacioColumns.LATITUDE, value);
        return this;
    }

    public EstacioSelection latitudeEndsWith(String... value) {
        addEndsWith(EstacioColumns.LATITUDE, value);
        return this;
    }

    public EstacioSelection orderByLatitude(boolean desc) {
        orderBy(EstacioColumns.LATITUDE, desc);
        return this;
    }

    public EstacioSelection orderByLatitude() {
        orderBy(EstacioColumns.LATITUDE, false);
        return this;
    }

    public EstacioSelection longitude(String... value) {
        addEquals(EstacioColumns.LONGITUDE, value);
        return this;
    }

    public EstacioSelection longitudeNot(String... value) {
        addNotEquals(EstacioColumns.LONGITUDE, value);
        return this;
    }

    public EstacioSelection longitudeLike(String... value) {
        addLike(EstacioColumns.LONGITUDE, value);
        return this;
    }

    public EstacioSelection longitudeContains(String... value) {
        addContains(EstacioColumns.LONGITUDE, value);
        return this;
    }

    public EstacioSelection longitudeStartsWith(String... value) {
        addStartsWith(EstacioColumns.LONGITUDE, value);
        return this;
    }

    public EstacioSelection longitudeEndsWith(String... value) {
        addEndsWith(EstacioColumns.LONGITUDE, value);
        return this;
    }

    public EstacioSelection orderByLongitude(boolean desc) {
        orderBy(EstacioColumns.LONGITUDE, desc);
        return this;
    }

    public EstacioSelection orderByLongitude() {
        orderBy(EstacioColumns.LONGITUDE, false);
        return this;
    }

    public EstacioSelection streetname(String... value) {
        addEquals(EstacioColumns.STREETNAME, value);
        return this;
    }

    public EstacioSelection streetnameNot(String... value) {
        addNotEquals(EstacioColumns.STREETNAME, value);
        return this;
    }

    public EstacioSelection streetnameLike(String... value) {
        addLike(EstacioColumns.STREETNAME, value);
        return this;
    }

    public EstacioSelection streetnameContains(String... value) {
        addContains(EstacioColumns.STREETNAME, value);
        return this;
    }

    public EstacioSelection streetnameStartsWith(String... value) {
        addStartsWith(EstacioColumns.STREETNAME, value);
        return this;
    }

    public EstacioSelection streetnameEndsWith(String... value) {
        addEndsWith(EstacioColumns.STREETNAME, value);
        return this;
    }

    public EstacioSelection orderByStreetname(boolean desc) {
        orderBy(EstacioColumns.STREETNAME, desc);
        return this;
    }

    public EstacioSelection orderByStreetname() {
        orderBy(EstacioColumns.STREETNAME, false);
        return this;
    }

    public EstacioSelection streetnumber(String... value) {
        addEquals(EstacioColumns.STREETNUMBER, value);
        return this;
    }

    public EstacioSelection streetnumberNot(String... value) {
        addNotEquals(EstacioColumns.STREETNUMBER, value);
        return this;
    }

    public EstacioSelection streetnumberLike(String... value) {
        addLike(EstacioColumns.STREETNUMBER, value);
        return this;
    }

    public EstacioSelection streetnumberContains(String... value) {
        addContains(EstacioColumns.STREETNUMBER, value);
        return this;
    }

    public EstacioSelection streetnumberStartsWith(String... value) {
        addStartsWith(EstacioColumns.STREETNUMBER, value);
        return this;
    }

    public EstacioSelection streetnumberEndsWith(String... value) {
        addEndsWith(EstacioColumns.STREETNUMBER, value);
        return this;
    }

    public EstacioSelection orderByStreetnumber(boolean desc) {
        orderBy(EstacioColumns.STREETNUMBER, desc);
        return this;
    }

    public EstacioSelection orderByStreetnumber() {
        orderBy(EstacioColumns.STREETNUMBER, false);
        return this;
    }

    public EstacioSelection altitude(String... value) {
        addEquals(EstacioColumns.ALTITUDE, value);
        return this;
    }

    public EstacioSelection altitudeNot(String... value) {
        addNotEquals(EstacioColumns.ALTITUDE, value);
        return this;
    }

    public EstacioSelection altitudeLike(String... value) {
        addLike(EstacioColumns.ALTITUDE, value);
        return this;
    }

    public EstacioSelection altitudeContains(String... value) {
        addContains(EstacioColumns.ALTITUDE, value);
        return this;
    }

    public EstacioSelection altitudeStartsWith(String... value) {
        addStartsWith(EstacioColumns.ALTITUDE, value);
        return this;
    }

    public EstacioSelection altitudeEndsWith(String... value) {
        addEndsWith(EstacioColumns.ALTITUDE, value);
        return this;
    }

    public EstacioSelection orderByAltitude(boolean desc) {
        orderBy(EstacioColumns.ALTITUDE, desc);
        return this;
    }

    public EstacioSelection orderByAltitude() {
        orderBy(EstacioColumns.ALTITUDE, false);
        return this;
    }

    public EstacioSelection slots(String... value) {
        addEquals(EstacioColumns.SLOTS, value);
        return this;
    }

    public EstacioSelection slotsNot(String... value) {
        addNotEquals(EstacioColumns.SLOTS, value);
        return this;
    }

    public EstacioSelection slotsLike(String... value) {
        addLike(EstacioColumns.SLOTS, value);
        return this;
    }

    public EstacioSelection slotsContains(String... value) {
        addContains(EstacioColumns.SLOTS, value);
        return this;
    }

    public EstacioSelection slotsStartsWith(String... value) {
        addStartsWith(EstacioColumns.SLOTS, value);
        return this;
    }

    public EstacioSelection slotsEndsWith(String... value) {
        addEndsWith(EstacioColumns.SLOTS, value);
        return this;
    }

    public EstacioSelection orderBySlots(boolean desc) {
        orderBy(EstacioColumns.SLOTS, desc);
        return this;
    }

    public EstacioSelection orderBySlots() {
        orderBy(EstacioColumns.SLOTS, false);
        return this;
    }

    public EstacioSelection bikes(String... value) {
        addEquals(EstacioColumns.BIKES, value);
        return this;
    }

    public EstacioSelection bikesNot(String... value) {
        addNotEquals(EstacioColumns.BIKES, value);
        return this;
    }

    public EstacioSelection bikesLike(String... value) {
        addLike(EstacioColumns.BIKES, value);
        return this;
    }

    public EstacioSelection bikesContains(String... value) {
        addContains(EstacioColumns.BIKES, value);
        return this;
    }

    public EstacioSelection bikesStartsWith(String... value) {
        addStartsWith(EstacioColumns.BIKES, value);
        return this;
    }

    public EstacioSelection bikesEndsWith(String... value) {
        addEndsWith(EstacioColumns.BIKES, value);
        return this;
    }

    public EstacioSelection orderByBikes(boolean desc) {
        orderBy(EstacioColumns.BIKES, desc);
        return this;
    }

    public EstacioSelection orderByBikes() {
        orderBy(EstacioColumns.BIKES, false);
        return this;
    }

    public EstacioSelection nearbystations(String... value) {
        addEquals(EstacioColumns.NEARBYSTATIONS, value);
        return this;
    }

    public EstacioSelection nearbystationsNot(String... value) {
        addNotEquals(EstacioColumns.NEARBYSTATIONS, value);
        return this;
    }

    public EstacioSelection nearbystationsLike(String... value) {
        addLike(EstacioColumns.NEARBYSTATIONS, value);
        return this;
    }

    public EstacioSelection nearbystationsContains(String... value) {
        addContains(EstacioColumns.NEARBYSTATIONS, value);
        return this;
    }

    public EstacioSelection nearbystationsStartsWith(String... value) {
        addStartsWith(EstacioColumns.NEARBYSTATIONS, value);
        return this;
    }

    public EstacioSelection nearbystationsEndsWith(String... value) {
        addEndsWith(EstacioColumns.NEARBYSTATIONS, value);
        return this;
    }

    public EstacioSelection orderByNearbystations(boolean desc) {
        orderBy(EstacioColumns.NEARBYSTATIONS, desc);
        return this;
    }

    public EstacioSelection orderByNearbystations() {
        orderBy(EstacioColumns.NEARBYSTATIONS, false);
        return this;
    }

    public EstacioSelection status(String... value) {
        addEquals(EstacioColumns.STATUS, value);
        return this;
    }

    public EstacioSelection statusNot(String... value) {
        addNotEquals(EstacioColumns.STATUS, value);
        return this;
    }

    public EstacioSelection statusLike(String... value) {
        addLike(EstacioColumns.STATUS, value);
        return this;
    }

    public EstacioSelection statusContains(String... value) {
        addContains(EstacioColumns.STATUS, value);
        return this;
    }

    public EstacioSelection statusStartsWith(String... value) {
        addStartsWith(EstacioColumns.STATUS, value);
        return this;
    }

    public EstacioSelection statusEndsWith(String... value) {
        addEndsWith(EstacioColumns.STATUS, value);
        return this;
    }

    public EstacioSelection orderByStatus(boolean desc) {
        orderBy(EstacioColumns.STATUS, desc);
        return this;
    }

    public EstacioSelection orderByStatus() {
        orderBy(EstacioColumns.STATUS, false);
        return this;
    }
}
