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

    public void addField(String fieldName, Class fieldClass) {
        fieldMap = fieldMap != null ? fieldMap : new HashMap<String,MetadataField>();
        fieldMap.put( fieldName , new MetadataField(fieldName, fieldClass) );
    }
}
