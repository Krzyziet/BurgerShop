package com.Krzysztof;

public class BaseBurger { // You have choice. You can add 4 addition to base burger, take difrrent meat and bread.
    private String name;
    private String bread;
    private String meat;
    private double  price;
    private double addsPrice = 0;
    private String addsNames = "";

    private Additions add1 ;
    private Additions add2 ;
    private Additions add3 ;
    private Additions add4;


    public double  getPrice() {
        return price;
    }

    public double getTotalPrice(){
        return getPrice()+getAddsPrice();
    }


    public double getAddsPrice() {
        return addsPrice;
    }

    public String getAddsNames() {
        return addsNames;
    }

    public String getName() {
        return name;
    }

    public void add1Additions(String name, double price){
        Additions add1 = new Additions(name,price);
        addsNames += add1.getName() +" ";
        addsPrice += add1.getPrice();
    }
    public void add2Additions(String name, double price){
        Additions add2 = new Additions(name,price);
        addsNames += add2.getName() +" ";
        addsPrice += add2.getPrice();
    }
    public void add3Additions(String name, double price){
        Additions add3 = new Additions(name,price);
        addsNames += add3.getName() +" ";
        addsPrice += add3.getPrice();
    }
    public void add4Additions(String name, double price){
        Additions add4 = new Additions(name,price);
        addsNames += add4.getName() +" ";
        addsPrice += add4.getPrice();
    }


    public BaseBurger(String name, String bread, String meat, double price) {
        this.name = name;
        this.bread = bread;
        this.meat = meat;
        this.price = price;
    }
}

class Additions {
    private String name;
    private double price;

    public Additions(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
