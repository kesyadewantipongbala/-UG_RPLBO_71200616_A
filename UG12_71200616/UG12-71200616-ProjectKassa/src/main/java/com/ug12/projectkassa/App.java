package com.ug12.projectkassa;

public class App 
{
    public static void main( String[] args )
    {
        Kassa kassa = new Kassa();
        Produk produk1 = new Produk("Cort AC 160 CF",3112000);
        Produk produk2 = new Produk("Cort AD810 OP",1115000);
        Produk produk3 = new Produk("Yamaha PSR-F52",1467000);
        Produk produk4 = new Produk("Roland EX20A",3180000);
        System.out.println("----------Skenario 1: Registrasi Kasir----------");
        Kasir kasir1 = new Kasir("Kesya Dewanti","kesyadewanti","kesyadewanti");
        Kasir kasir2 = new Kasir("Naomi Randan","naomirandan","naomirandan");
        kassa.register(kasir1); kassa.register(kasir2);
        System.out.println("----------Skenario 2: Login Gagal----------");
        kassa.login("kesya","kesya");
        System.out.println("----------Skenario 3: Login Berhasil (Username: kesyadewanti)----------");
        kassa.login("kesyadewanti","kesyadewanti");
        System.out.println("----------Skenario 4: Print Nota #1----------");
        kassa.tambahPesanan(produk1,1);
        kassa.tambahPesanan(produk2,2);
        kassa.printNota();
        System.out.println("----------Skenario 5: Print Nota #2----------");
        kassa.tambahPesanan(produk4,1);
        kassa.printNota();
        System.out.println("----------Skenario 6: Login Berhasil (Username: naomirandan)----------");
        kassa.login("naomirandan","naomirandan");
        System.out.println("----------Skenario 7: Print Nota #3----------");
        kassa.tambahPesanan(produk3,2);
        kassa.tambahPesanan(produk4,1);
        kassa.printNota();
        System.out.println("----------Skenario 8: Informasi Pejualan Kasir----------");
        kassa.printPenjualanKasir();
    }
}
