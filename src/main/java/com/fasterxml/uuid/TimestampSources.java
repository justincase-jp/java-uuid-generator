package com.fasterxml.uuid;

class TimestampSources {
    static final TimestampSource SYSTEM_TIMESTAMP_SOURCE = new TimestampSource() {
        @Override
        public long currentTimeMillis() {
            return System.currentTimeMillis();
        }
    };
}
