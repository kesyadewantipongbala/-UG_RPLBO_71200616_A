package com.ug6.soal1;

import java.util.ArrayList;

public class VendingMachine {
    private int code;
    private int capacity;
    private int usedCapacity;
    private ArrayList<Goods> goods;
    private ArrayList<Double> acceptanceBalance;
    private double consumerMoney;

    public VendingMachine() {
    }

    public VendingMachine(final int code, final int capacity) {
        this.setCode(code);
        this.setCapacity(capacity);
    }

    public VendingMachine(final int code, final int capacity, final ArrayList<Goods> goods, final ArrayList<Double> acceptanceBalance) {
        this.code = code;
        this.capacity = capacity;
        this.goods = goods;
        this.acceptanceBalance = acceptanceBalance;
    }

    // methode
    public void processOrder(String goodsCode, int orderQuantity){

    }

    public void takeMoney(double money){

    }

    public void giveGood(double goodsPrice, String goodsName){

    }

    public double withdrawMoney(){

        return 0;
    }

    public void inputGoods(Goods goods){

    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setUsedCapacity(int usedCapacity) {
        this.usedCapacity = usedCapacity;
    }

    public void setGoods(ArrayList<Goods> goods) {
        this.goods = goods;
    }

    public void setAcceptanceBalance(ArrayList<Double> acceptanceBalance) {
        this.acceptanceBalance = acceptanceBalance;
    }

    public void setConsumerMoney(double consumerMoney) {
        this.consumerMoney = consumerMoney;
    }
}
