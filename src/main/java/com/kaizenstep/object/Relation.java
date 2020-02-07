package com.kaizenstep.object;

import java.util.*;

public class Relation {

    public Map<String,sObject> lookup;
    public Relation(sObject obj1, sObject obj2) {
        lookup = new HashMap<String,sObject>();
        lookup.put( obj1.ID , obj2 );
        lookup.put( obj2.ID , obj1 );
    }
}
