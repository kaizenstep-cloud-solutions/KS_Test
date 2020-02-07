package com.kaizenstep.object;

import java.util.HashMap;

public class AccountB2B extends Account {

    public void addChildren(sObject obj){}
    public void addContact(Contact con) {
        super.addChildren(con);
    }
}
