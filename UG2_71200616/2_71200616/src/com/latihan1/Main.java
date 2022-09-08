package com.latihan1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    gaji hitungGaji = new gaji();

        Scanner inp = new Scanner(System.in);
        System.out.println("Berapa karyawan: ");
        int jmlLoop = inp.nextInt();

        System.out.println("Masukkan jumlah jam kerja: ");
        int totJamKerja = inp.nextInt();

        if (totJamKerja == 8){
            hitungGaji.hitung(300000);

        }

    }
}
