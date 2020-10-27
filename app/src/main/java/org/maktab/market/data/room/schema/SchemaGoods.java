package org.maktab.market.data.room.schema;

public class SchemaGoods {
    public static final String DATABASE_NAME = "shope.db";
    public static final int VERSION = 1;
    public static final String TABLE_NAME_GOODS = "goods";

    public static class Culomns {
        public static final String NAME = "name";
        public static final String PRICE = "price";
        public static final String REVIEW = "review";
        public static final String UUID = "uuid";
        public static final String DATE_ARRIVAL = "creatDate";
        public static final String STAR = "star";
    }
}
