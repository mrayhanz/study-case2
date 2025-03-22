public class TugasMain {
    public static void main(String[] args) {
        Tugas mhs[] = new Tugas[8];
        mhs[0] = new Tugas("Ahmad", "220101001", 2022, 78, 82);
        mhs[1] = new Tugas("Budi", "220101002", 2022, 85, 88); 
        mhs[2] = new Tugas("Cindy", "220101003", 2021, 90, 87);
        mhs[3] = new Tugas("Dian", "220101004", 2021, 76, 79);
        mhs[4] = new Tugas("Eko", "220101005", 2023, 92, 95);
        mhs[5] = new Tugas("Fajar", "220101006", 2020, 88, 85);
        mhs[6] = new Tugas("Gina", "220101007", 2023, 80, 83);
        mhs[7] = new Tugas("Hadi", "220101008", 2020, 82, 84);

        Tugas maxUTS = new Tugas();
        int max = maxUTS.maxUtsDc(mhs, 0, mhs.length-1);
        System.out.println("=== Data Mahasiswa Dengan Nilai UTS Tertinggi ===");
        System.out.println("Nama : " + mhs[max].nama);
        System.out.println("Nim : " + mhs[max].nim);
        System.out.println("Tahun Masuk : " + mhs[max].ThnMasuk);
        System.out.println("Nilai UTS : " + mhs[max].nilaiUTS);
        System.out.println();

        Tugas minUTS = new Tugas();
        int min = minUTS.minUtsDc(mhs, 0, mhs.length-1);
        System.out.println("=== Data Mahasiswa Dengan Nilai UTS Terendah ===");
        System.out.println("Nama : " + mhs[min].nama);
        System.out.println("Nim : " + mhs[min].nim);
        System.out.println("Tahun Masuk : " + mhs[min].ThnMasuk);
        System.out.println("Nilai UTS : " + mhs[min].nilaiUTS);
        System.out.println();

        Tugas mahasiswa = new Tugas();
        System.out.println("Rata-rata Nilai UAS : " + mahasiswa.rataUas(mhs));
    }
}