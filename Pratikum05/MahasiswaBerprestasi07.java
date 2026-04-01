package Pratikum05;

public class MahasiswaBerprestasi07 {
    Mahasiswa07[] listMhs = new Mahasiswa07[5];
    int idx;

    void tambah(Mahasiswa07 m) {
        listMhs[idx] = m;
        idx++;
    }

    void tampil() {
        for (Mahasiswa07 m : listMhs) {
            m.tampilInformasi();
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 0; j < listMhs.length - i - 1; j++) {
                if (listMhs[j].ipk < listMhs[j + 1].ipk) {
                    Mahasiswa07 tmp = listMhs[j];
                    listMhs[j] = listMhs[j + 1];
                    listMhs[j + 1] = tmp;
                }
            }
        }
    }
}