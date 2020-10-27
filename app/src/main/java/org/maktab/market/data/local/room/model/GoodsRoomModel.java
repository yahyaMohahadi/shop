package org.maktab.market.data.local.room.model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import org.maktab.market.data.local.room.schema.SchemaGoods;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Entity(tableName = SchemaGoods.TABLE_NAME_GOODS)
public class GoodsRoomModel implements Serializable {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = SchemaGoods.Culomns.UUID)
    private UUID mUUID;

    @ColumnInfo(name = SchemaGoods.Culomns.NAME)
    private String mStringName;

    @ColumnInfo(name = SchemaGoods.Culomns.PRICE)
    private Float mFloatPrice;

    @ColumnInfo(name = SchemaGoods.Culomns.STAR)
    private Float mFloatStare;

    @ColumnInfo(name = SchemaGoods.Culomns.DATE_ARRIVAL)
    private Date mDateArrival;

    public GoodsRoomModel() {
    }

    public UUID getUUID() {
        return mUUID;
    }

    public void setUUID(UUID UUID) {
        mUUID = UUID;
    }

    public String getStringName() {
        return mStringName;
    }

    public void setStringName(String stringName) {
        mStringName = stringName;
    }

    public Float getFloatPrice() {
        return mFloatPrice;
    }

    public void setFloatPrice(Float floatPrice) {
        mFloatPrice = floatPrice;
    }

    public Float getFloatStare() {
        return mFloatStare;
    }

    public void setFloatStare(Float floatStare) {
        mFloatStare = floatStare;
    }

    public Date getDateArrival() {
        return mDateArrival;
    }

    public void setDateArrival(Date dateArrival) {
        mDateArrival = dateArrival;
    }
}
