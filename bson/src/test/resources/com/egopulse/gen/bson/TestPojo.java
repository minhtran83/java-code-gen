package com.egopulse.gen.bson;

import com.egopulse.gen.bean.Bean;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Bson
@Bean
public interface TestPojo {
    boolean isBoolean();
    byte getByte();
    short getShort();
    int getInt();
    long getLong();
    float getFloat();
    double getDouble();
    String getString();
    List<String> getListString();
    Set<String> getSetString();
    Map<String, String> getMapStringString();
}
