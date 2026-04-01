package Pratikum05;

public class MahasiswaBerprestasi07 {
    Mahasiswa07[] listMhs = new Mahasiswa07[5];
    int idx;

    void tambah(Mahasiswa07 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            listMhs[i].tampilInformasi();
        }
    }

    void bubbleSort() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (listMhs[j].ipk < listMhs[j + 1].ipk) {
                    Mahasiswa07 tmp = listMhs[j];
                    listMhs[j] = listMhs[j + 1];
                    listMhs[j + 1] = tmp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < idx - 1; i++) {
            int min = i;
            for (int j = i + 1; j < idx; j++) {
                if (listMhs[j].ipk < listMhs[min].ipk) {
                    min = j;
                }
            }
            Mahasiswa07 tmp = listMhs[min];
            listMhs[min] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Mahasiswa07 temp = listMhs[i];
            int j = i - 1;

            while (j >= 0 && listMhs[j].ipk > temp.ipk) {
                listMhs[j + 1] = listMhs[j];
                j--;
            }

            listMhs[j + 1] = temp;
        }
    }
}