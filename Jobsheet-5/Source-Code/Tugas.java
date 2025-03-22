public class Tugas {
    Tugas mhs[];
    String nama, nim;
    int ThnMasuk, nilaiUTS, nilaiUAS;

    Tugas() {
    }

    Tugas(String nama, String nim, int ThnMasuk, int nilaiUTS,int nilaiUAS) {
        this.nama = nama;
        this.nim = nim;
        this.ThnMasuk = ThnMasuk;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    int maxUtsDc(Tugas mhs[], int l,int r) {
        if (l == r) {
            return l;
        }else{
            int mid = (l + r) / 2;
            int maxL = maxUtsDc(mhs, l, mid);
            int maxR = maxUtsDc(mhs, mid + 1, r);
            return (mhs[maxL].nilaiUTS > mhs[maxR].nilaiUTS) ? maxL : maxR;
        }
    }

    int minUtsDc(Tugas mhs[], int l,int r) {
        if (l == r) {
            return l;
        }else{        
            int mid = (l + r) / 2;
            int minL = minUtsDc(mhs, l, mid);
            int minR = minUtsDc(mhs, mid + 1, r);
            return (mhs[minL].nilaiUTS < mhs[minR].nilaiUTS) ? minL : minR;
        }
    }

    double rataUas(Tugas mhs[]){
        double total = 0;
        for (int i = 0; i < mhs.length; i++) {
            total = total + mhs[i].nilaiUAS;
        }
        return total/mhs.length;
    }
}