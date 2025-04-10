import java.util.Scanner;

public class DosenMain17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;
        boolean jenisKelamin;

        DataDosen17 dataDosen = new DataDosen17();

        do {
            System.out.println("=== MENU ===");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Semua Data Dosen");
            System.out.println("3. Sorting ASC Dosen Berdasarkan Usia");
            System.out.println("4. Sorting DSC Dosen Berdasarkan Usia");
            System.out.println("5. Cari Dosen Berdasarkan Nama");
            System.out.println("6. Cari Dosen Berdasarkan Usia");
            System.out.println("7. Keluar");

            System.out.print("Pilihan Menu : ");
            menu = sc.nextInt();
            sc.nextLine(); 

            switch (menu) {
                case 1:
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Masukkan Data Dosen ke-" + (i + 1));
                        System.out.print("Kode Dosen : ");
                        String kd = sc.nextLine();
                        System.out.print("Nama Dosen : ");
                        String name = sc.nextLine();
                        System.out.print("Jenis Kelamin (Pria/Wanita) : ");
                        String gender = sc.nextLine();
                        jenisKelamin = gender.equalsIgnoreCase("pria");
                        System.out.print("Usia : ");
                        int age = sc.nextInt();
                        sc.nextLine();
                        System.out.println();

                        dataDosen.tambah(new Dosen17(kd, name, jenisKelamin, age));
                    }
                    break;

                case 2:
                    System.out.println("Data Semua Dosen : ");
                    dataDosen.tampil();
                    break;

                case 3:
                    System.out.println("Data Dosen Berdasarkan Usia (ASC) : ");
                    dataDosen.SortingASC();
                    dataDosen.tampil();
                    break;

                case 4:
                    System.out.println("Data Dosen Berdasarkan Usia (DSC) : ");
                    dataDosen.SortingDSC();
                    dataDosen.tampil();
                    break;

                case 5:
                    System.out.print("Masukkan Nama Dosen yang dicari : ");
                    String cari = sc.nextLine();
                    int hasilNama = dataDosen.sequentialSearching(cari);
                    if (hasilNama != -1) {
                        System.out.println("Data ditemukan di posisi: " + hasilNama);
                        dataDosen.tampilData(hasilNama);
                    } else {
                        System.out.println("Dosen dengan nama '" + cari + "' tidak ditemukan.");
                    }
                    break;

                case 6:
                    System.out.print("Masukkan Usia Dosen yang dicari : ");
                    int cariUsia = sc.nextInt();
                    dataDosen.SortingASC();
                    int hasilUsia = dataDosen.findBinarySearch(cariUsia, 0, dataDosen.getLength() - 1);
                    if (hasilUsia != -1) {
                        System.out.println("Data ditemukan di posisi: " + hasilUsia);
                        dataDosen.tampilData(hasilUsia);
                    } else {
                        System.out.println("Dosen dengan usia " + cariUsia + " tidak ditemukan.");
                    }
                    break;

                case 7:
                    System.out.println("Program Selesai");
                    break;

                default:
                    System.out.println("Menu Tidak Tersedia");
            }
        } while (menu != 7);
    }
}
