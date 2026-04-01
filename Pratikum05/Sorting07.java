package Pratikum05;

public class Sorting07 {
    int[] data;
    int jmlData;

    Sorting07(int[] data, int jmlData) {
        this.data = data;
        this.jmlData = jmlData;
    }

    void selectionSort() {
        for (int i = 0; i < jmlData - 1; i++) {
            int min = i;
            for (int j = i + 1; j < jmlData; j++) {
                if (data[j] < data[min]) {
                    min = j;
                }
            }
            int tmp = data[min];
            data[min] = data[i];
            data[i] = tmp;
        }
    }

    void tampil() {
        for (int i = 0; i < jmlData; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}