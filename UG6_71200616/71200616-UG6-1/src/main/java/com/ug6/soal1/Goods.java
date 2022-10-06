package com.ug6.soal1;

public class Goods {
    private int code;
    private String name;
    private int quality;
    private double price;

    public Goods() {
    }

    public Goods(final int code, final String name) {
        this.setCode(code);
        this.setName(name);
        this.quality = 0;
        this.price=0.0;
    }

    public Goods(final int code, final String name, final int quality, final double price) {
        this.setCode(code);
        this.setName(name);
        this.setQuality(quality);
        this.setPrice(price);
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuality() {
        return this.quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
