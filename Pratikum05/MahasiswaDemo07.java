package Pratikum05;

import java.util.Scanner;

public class MahasiswaDemo07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi07 list = new MahasiswaBerprestasi07();

        for (int i = 0; i < 5; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));

            System.out.print("NIM   : ");
            String nim = sc.nextLine();

            System.out.print("Nama  : ");
            String nama = sc.nextLine();

            System.out.print("Kelas : ");
            String kelas = sc.nextLine();

            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            list.tambah(new Mahasiswa07(nim, nama, kelas, ipk));
        }

        System.out.println("\nData sebelum sorting:");
        list.tampil();

        System.out.println("Data setelah Insertion Sort (ASC):");
        list.insertionSort();
        list.tampil();
    }
}