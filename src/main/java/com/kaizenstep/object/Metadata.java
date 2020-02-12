package com.kaizenstep.object;

import java.util.*;

public class Metadata {

    public Map<String,MetadataField> fieldMap;

    public Metadata(){
        this.factory();
    }
    private void factory(){
        fieldMap = new HashMap<String,MetadataField>();
    }

    public void addField( MetadataField mf ) {
        fieldMap.put( mf.fieldName , mf );
    }
    public void addField(String fieldName, Class fieldClass) {
        addField( fieldName, fieldName, fieldClass);
    }
    public void addField(String fieldName, String dbName, Class fieldClass) {
        fieldMap = fieldMap != null ? fieldMap : new HashMap<String,MetadataField>();
        boolean notDB = fieldClass == List.class || fieldClass == Map.class;
        dbName = notDB ? null : dbName;
        fieldMap.put( fieldName , new MetadataField(fieldName, dbName, fieldClass) );
    }

}
