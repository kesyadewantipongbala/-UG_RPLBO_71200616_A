package com.latihan1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    TabunganKonversional K_71200616 = new TabunganKonversional();
        TabunganBerjangka I_71200616 = new TabunganBerjangka();


        System.out.println("Pilihan:\n 1.Penyetoran \n2.Penarikan\n3.Lihat Saldo");

        Scanner inp = new Scanner(System.in);
        System.out.println("Masukkan Pilihan: ");
        int pilihan = inp.nextInt();

        if(pilihan == 1){
            K_71200616.penyetoran(200000);
            System.out.println("-----Tabungan Konvensional-----");
            System.out.print("Penyetoran Rp.");
            K_71200616.getSaldo();
            I_71200616.penyetoran(1000000);
            System.out.println("-----Tabungan Berjangka-----");
            System.out.print("Penyetoran Rp.");
            I_71200616.getSaldo();
        }else if(pilihan == 2){
            K_71200616.penarikan(50000);
            System.out.println("-----Tabungan Konvensional-----");
            System.out.print("Penarikan Rp.");
            K_71200616.getSaldo();
            I_71200616.penarikan(500000);
            System.out.println("-----Tabungan Berjangka-----");
            System.out.print("Penarikan Rp.");
            I_71200616.getSaldo();
        }else if(pilihan == 3){
            System.out.print("Saldo K_71200616: ");
            K_71200616.getSaldo();
            System.out.print("Saldo I_71200616: ");
            I_71200616.getSaldo();
        }else{
            System.out.println("Inputan anda salah!");
        }
    }
}
