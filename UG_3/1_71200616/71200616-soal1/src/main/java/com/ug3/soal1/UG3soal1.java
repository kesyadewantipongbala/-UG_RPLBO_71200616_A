package com.ug3.soal1;

import java.util.Scanner;
public class UG3soal1 {
    public static void main( String[] args )
    {
        String nama_makanan;
        String tgl;
        String jumlah;
        String berat;
        Scanner  scan = new Scanner(System.in);

        System.out.println("==========Data Produk==========");
        System.out.print("Nama makanan: ");
        nama_makanan = scan.nextLine();
        System.out.print("Tanggal kadaluarsa: ");
        tgl = scan.nextLine();
        System.out.print("Jumlah (quantity): ");
        jumlah = scan.nextLine();
        System.out.print("Berat (gram): ");
        berat = scan.nextLine();

        System.out.println("\n==========Data Produk==========");
        System.out.println("Nama makanan: "+nama_makanan);
        System.out.println("Tanggal kadaluarsa: "+tgl);
        System.out.println("Jumlah (quantity): "+jumlah);
        System.out.println("Berat (gram): "+berat);
        }
    }

