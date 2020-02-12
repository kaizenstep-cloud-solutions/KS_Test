package com.kaizenstep.object;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

public class MetadataField {

    public String fieldName;
    public String dbName;
    public Class fieldClass;

    public MetadataField(String fieldName, Class fieldClass){
        this(fieldName,fieldName,fieldClass);
    }
    public MetadataField(String fieldName, String dbName, Class fieldClass){
        this.factory(fieldName, dbName, fieldClass);
    }
    private void factory(String fieldName, String dbName, Class fieldClass){
        boolean notDB = fieldClass == List.class || fieldClass == Map.class;

        this.fieldName = fieldName;
        this.dbName = notDB ? null : dbName;
        this.fieldClass = fieldClass;
    }

    public Object getValue(ksObject obj) throws IllegalAccessException {

        Field field = null;
        try { field = obj.getClass().getField(fieldName); }
        catch (NoSuchFieldException e)
        { e.printStackTrace(); return null; }
        return field.get(obj);
    }
}
