package io.confluent.connect.jdbc.util;

import io.confluent.connect.jdbc.source.JdbcSourceConnectorConfig;

import java.sql.Timestamp;

public class TimestampColumnTypeUtil {
    public static byte[] BinaryDefault = {(byte) 0x00};
    public static Timestamp TimestampDefault = new Timestamp(0L);

    public static Object getDefault(String columnType) {
        if (columnType.equals(JdbcSourceConnectorConfig.TIMESTAMP_COLUMN_TYPE_BINARY)) {
            return BinaryDefault;
        } else if (columnType.equals(JdbcSourceConnectorConfig.TIMESTAMP_COLUMN_TYPE_DEFAULT)) {
            return TimestampDefault;
        }

        return null;
    }
}
