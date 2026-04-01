package Pratikum05;

public class SortingMain07 {
    public static void main(String[] args) {

        int data[] = {30, 20, 2, 8, 14};
        Sorting07 s = new Sorting07(data, data.length);

        System.out.println("Data awal 2");
        s.tampil();

        System.out.println("Data sudah diurutkan dengan SELECTION SORT (ASC)");
        s.selectionSort();
        s.tampil();
    }
}