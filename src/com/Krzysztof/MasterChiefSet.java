package com.Krzysztof;

public class MasterChiefSet extends BaseBurger {
    private String getAddsNames ="";
    private double getAddsPrice = 0;

    public void add1Additions() {
        add1Additions("cola", 3);
    }


    public void add2Additions() {
        add2Additions("lay's", 5);
    }

    @Override
    public void add3Additions(String name, double price) {
        System.out.println("cannot make it");
    }

    @Override
    public void add4Additions(String name, double price) {
        System.out.println("cannot make it");
    }

    @Override
    public String getAddsNames() {
        return super.getAddsNames()+getAddsNames;
    }

    @Override
    public double getAddsPrice() {
        return super.getAddsPrice()+getAddsPrice;
    }

    @Override
    public double getTotalPrice() {
        return super.getTotalPrice()+getAddsPrice;
    }

    public MasterChiefSet(String name, String bread, String meat, double price) {
        super(name, bread, meat, price);
        add1Additions();
        add2Additions();

    }
}

