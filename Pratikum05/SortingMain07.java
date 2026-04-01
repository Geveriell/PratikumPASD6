package Pratikum05;

public class SortingMain07 {
    public static void main(String[] args) {

        int data[] = {20, 10, 2, 7, 12};
        Sorting07 s = new Sorting07(data, data.length);

        System.out.println("Data awal 3");
        s.tampil();

        System.out.println("Data sudah diurutkan dengan INSERTION SORT (ASC)");
        s.insertionSort();
        s.tampil();
    }
}