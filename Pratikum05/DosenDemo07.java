package Pratikum05;

import java.util.Scanner;

public class DosenDemo07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DataDosen07 list = new DataDosen07();
        int pilih;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (Termuda → Tertua)");
            System.out.println("4. Sorting DSC (Tertua → Termuda)");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Kode  : ");
                    String kd = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nm = sc.nextLine();
                    System.out.print("Jenis Kelamin (true=L, false=P): ");
                    boolean jk = sc.nextBoolean();
                    System.out.print("Usia  : ");
                    int usia = sc.nextInt();
                    sc.nextLine();

                    list.tambah(new Dosen07(kd, nm, jk, usia));
                    break;

                case 2:
                    list.tampil();
                    break;

                case 3:
                    list.sortingASC();
                    System.out.println("Data diurutkan ASC");
                    list.tampil();
                    break;

                case 4:
                    list.sortingDSC();
                    System.out.println("Data diurutkan DSC");
                    list.tampil();
                    break;

                case 0:
                    System.out.println("Keluar...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
            }

        } while (pilih != 0);
    }
}