package Pratikum05;

public class Sorting07 {
    int[] data;
    int jmlData;

    Sorting07(int[] data, int jmlData) {
        this.data = data;
        this.jmlData = jmlData;
    }

    void insertionSort() {
        for (int i = 1; i < jmlData; i++) {
            int key = data[i];
            int j = i - 1;

            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = key;
        }
    }

    void tampil() {
        for (int i = 0; i < jmlData; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}