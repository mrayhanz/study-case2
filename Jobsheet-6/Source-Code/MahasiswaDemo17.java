import java.util.Scanner;

public class MahasiswaDemo17 {
    public static void main(String[] args) {
        MahasiswaBerprestasi17 list = new MahasiswaBerprestasi17();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i ++){
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            String ip = sc.nextLine();
            Double ipk = Double.parseDouble(ip);
            System.out.println("-----------------------------------");
            list.tambah(new Mahasiswa17(nim, nama, kelas, ipk));
        }

        // System.out.println("Data Mahasiswa sebelum sorting : ");
        // list.tampil();

        // System.out.println("Data Mahasiswa sesudah sorting berdasarkan IPK (DESC) :");
        // list.bubbleSort();
        // list.tampil();

        // System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC) :");
        // list.selectionSort();
        // list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC) :");
        list.insertionSort();
        list.tampil();
    }
}
