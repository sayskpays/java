package com.interface_study.uses;

public class Customer implements Buy, Sell{


    @Override
    public void buy() {

    }

    @Override
    public void order() {
        Sell.super.order();
    }

    @Override
    public void sell() {

    }
}
