package com.kaizenstep.object;

public class AccountB2B extends Account {

    public void addChildren(ksObject obj){}
    public void addContact(Contact con) {
        super.addChildren(con);
    }
}
