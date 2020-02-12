package com.kaizenstep.object;

import java.util.*;

public class Relation {

    public Map<String, ksObject> lookup;
    public Relation(ksObject obj1, ksObject obj2) {
        lookup = new HashMap<String, ksObject>();
        lookup.put( obj1.ID , obj2 );
        lookup.put( obj2.ID , obj1 );
    }
}
