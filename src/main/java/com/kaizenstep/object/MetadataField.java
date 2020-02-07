package com.kaizenstep.object;

import java.util.HashMap;
import java.lang.reflect.Field;

public class MetadataField {

    public String fieldName;
    public Class fieldClass;

    public MetadataField(String fieldName, Class fieldClass){
        this.factory(fieldName, fieldClass);
    }
    private void factory(String fieldName, Class fieldClass){
        this.fieldName = fieldName;
        this.fieldClass = fieldClass;
    }

    public Object getValue(sObject obj) throws IllegalAccessException {

        Field field = null;
        try { field = obj.getClass().getField(fieldName); }
        catch (NoSuchFieldException e)
        { e.printStackTrace(); return null; }
        return field.get(obj);
    }
}
