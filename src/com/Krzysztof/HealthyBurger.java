package com.Krzysztof;

public class HealthyBurger extends BaseBurger {
    private String addsNames = "";
    private double addsPrice = 0;

    private Additions add5;
    private Additions add6;

    @Override
    public String getAddsNames() {
        return super.getAddsNames() + addsNames;
    }

    @Override
    public double getAddsPrice() {
        return super.getAddsPrice() + addsPrice;
    }

    public void add5Additions(String name, double price) {
        Additions add5 = new Additions(name, price);
        addsNames += add5.getName() + " ";
        addsPrice += add5.getPrice();
    }

    public void add6Additions(String name, double price) {
        Additions add6 = new Additions(name, price);
        addsNames += add6.getName() + " ";
        addsPrice += add6.getPrice();
    }

    public HealthyBurger(String name, String meat, double price) {
        super(name, "brown " ,meat, price);

    }
}
