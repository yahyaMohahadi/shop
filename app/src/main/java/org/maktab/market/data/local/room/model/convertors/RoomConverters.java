package org.maktab.market.data.local.room.model.convertors;

import androidx.room.TypeConverter;

import java.util.Date;
import java.util.UUID;

public class RoomConverters {

    @TypeConverter
    public static String fromUUID(UUID uuid) {
        return uuid == null ? null : uuid.toString();
    }

    @TypeConverter
    public static UUID stringToUUID(String value) {
        return value == null ? null : UUID.fromString(value);
    }

    @TypeConverter
    public static Date fromTimestamp(Long value) {
        return value == null ? null : new Date(value);
    }

    @TypeConverter
    public static Long dateToTimestamp(Date date) {
        return date == null ? null : date.getTime();
    }
}
