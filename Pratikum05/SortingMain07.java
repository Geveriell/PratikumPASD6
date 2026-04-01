package Pratikum05;

public class SortingMain07 {
    public static void main(String[] args) {

        int c[] = {40, 10, 4, 9, 3};
        Sorting07 dataurut3 = new Sorting07(c, c.length);

        System.out.println("Data awal 3");
        dataurut3.tampil();

        System.out.println("Data sudah diurutkan dengan INSERTION SORT (ASC)");
        dataurut3.insertionSort();
        dataurut3.tampil();
    }
}