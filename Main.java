package com.tutorial;


import java.util.Scanner;

public class Main{
    public static void main(String[]args){

        /* Awal Login */

        System.out.println("====================================");
        System.out.println("=================LOGIN==============");
        System.out.println("====================================");

        String username = "suhendri";
        int password = 12345;
        Scanner tombol = new Scanner(System.in);

        System.out.print("Please Input Username =");
        username=tombol.nextLine();
        System.out.print("Input Your Password =");
        password= tombol.nextInt();

        if((username=="suhendri") && (password==12345)){
            System.out.println("Welcome in Application Learn");
        }else{
            System.out.println("something wrong");
        }

        /* Akhir Login */

        System.out.println(" ");
        System.out.println(" ");

        /* Awal Kalkulator */

        System.out.println("====================================");
        System.out.println("===============Kalkulator===========");
        System.out.println("====================================");

        System.out.println(" ");

        int bil_A;
        int bil_B;
        int hasil;

        int aksi = int [01,02,03,04];

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Kode-Kode Operator Aritmatika");
        System.out.println("Penjumlahan = 01");
        System.out.println("Pengurangan = 02");
        System.out.println("Perkalian = 03");
        System.out.println("Pembagian = 04");

        System.out.println(" ");

        System.out.print("Please Insert Code Operator Aritmatika =");
        aksi=keyboard.nextLine();

        if (aksi= 01 == 01)
        {
            hasil = bil_A + bil_B;
        } else if (aksi= 02 == 02) {
            hasil = bil_A - bil_B;
        }else if (aksi= 03 == 03) {
            hasil = bil_A * bil_B;
        }else if (aksi= 04 == 04) {
            hasil = bil_A / bil_B;
        }


        System.out.print("Masukkan Bilangan Pertama =");
        bil_A=keyboard.nextInt();

        System.out.print("Masukkan Bilangan Kedua =");
        bil_B=keyboard.nextInt();

        System.out.print("Hasil Penjumlahan Adalah =" +hasil);

        System.out.println("");

        if (hasil >= 100){
            System.out.println("Bilangan Melebihi Seratus");
        }else {
            System.out.println("Bilangan Kurang Dari Seratus");
        }

        /* Akhir Kalkulator */

    }
}