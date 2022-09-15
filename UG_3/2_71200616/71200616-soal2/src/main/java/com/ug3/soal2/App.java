package com.ug3.soal2;
import java.util.Scanner;


public class App {
    public static void main( String[] args ) {
        String kata1;
        String kata2;
        int jml_kata1;
        int jml_kata2;
        int jumlah;
        Scanner  scan = new Scanner(System.in);

        System.out.println("Bilangan Fibonacci dari kata");
        System.out.print("Masukkan input pertama: ");
        kata1 = scan.nextLine();
        jml_kata1 = kata1.length();
        System.out.print("Masukkan input kedua: ");
        kata2 = scan.nextLine();
        jml_kata2 = kata2.length();

        System.out.println("\nBilangan Fibonacci dari kata");
        for(int i = 0; i <= 1; i++ )
            System.out.print(jml_kata1+" "+ jml_kata2+"n");
            jumlah = jml_kata1+ jml_kata2;
            jml_kata1 = jml_kata2;
            jml_kata2 = jumlah;
    }
}
