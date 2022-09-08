package com.latihan1;

public class TabunganBerjangka {
    private String pemilik;
    private double saldo;

    public void getSaldo(){
        saldo += saldo;
        System.out.println(saldo);
    }

    public void penarikan(double tarik){
        saldo += tarik;
    }

    public void penyetoran(double setor){
        saldo += setor;
    }
}
