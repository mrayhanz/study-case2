public class DataDosen17 {

    Dosen17 DataDosen17[] = new Dosen17[5];
    int idx;

    void tambah(Dosen17 dsn){
        if (idx < DataDosen17.length) {
            DataDosen17[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data Sudah Penuh");
        }
    }

    void tampil(){
        for(Dosen17 dsn : DataDosen17){
            dsn.tampil();
            System.out.println("-----------------------------");
        }
    }

    void SortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (DataDosen17[j].usia > DataDosen17[j + 1].usia) {
                    Dosen17 temp = DataDosen17[j];
                    DataDosen17[j] = DataDosen17[j + 1];
                    DataDosen17[j + 1] = temp;
                }
            }
        }
    }

    void SortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (DataDosen17[j].usia > DataDosen17[maxIdx].usia) {
                    maxIdx = j;
                }
            }
            Dosen17 temp = DataDosen17[i];
            DataDosen17[i] = DataDosen17[maxIdx];
            DataDosen17[maxIdx] = temp;
        }
    }

    void insertionSort(){
        for (int i = 1; i < idx; i++) {
            Dosen17 key = DataDosen17[i];
            int j = i - 1;
            while (j >= 0 && DataDosen17[j].usia > key.usia) {
                DataDosen17[j + 1] = DataDosen17[j];
                j--;
            }
            DataDosen17[j + 1] = key;
        }
    }

    int sequentialSearching(String cari) {
        int posisi = -1;
        for (int j = 0; j < DataDosen17.length; j++) {
            if (DataDosen17[j].nama.equals(cari)) {
                posisi = j;
                break;
            }
        }
    
        int jumlah = 0;
        for (int j = 0; j < DataDosen17.length; j++) {
            if (DataDosen17[j].nama.equals(cari)) {
                jumlah++;
            }
        }
    
        if (jumlah > 1) {
            System.out.println("Peringatan! Ditemukan lebih dari satu data dengan nama '" + cari + "'.");
        }
    
        return posisi;
    }
    

    int findBinarySearch(double cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == DataDosen17[mid].usia) {
    
                int jumlah = 0;
                for (int i = 0; i < DataDosen17.length; i++) {
                    if (DataDosen17[i].usia == cari) {
                        jumlah++;
                    }
                }
    
                if (jumlah > 1) {
                    System.out.println("Peringatan! Ditemukan lebih dari satu data dengan usia " + cari + ".");
                }
    
                return mid;
    
            } else if (DataDosen17[mid].usia > cari) {
                return findBinarySearch(cari, left, mid - 1);
            } else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
    

    public int getLength() {
        return idx;
    }

    public void tampilData(int pos) {
        if (pos >= 0 && pos < idx) {
            DataDosen17[pos].tampil();
        } else {
            System.out.println("Posisi tidak valid.");
        }
    }
}