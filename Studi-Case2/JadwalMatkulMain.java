import java.util.Scanner;

public class JadwalMatkulMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;
        do {
            System.out.println("=== MENU ===");
            System.out.println("1. Tampilkan Data Dosen");
            System.out.println("2. Tampilkan Data Mata Kuliah");
            System.out.println("3. Tampilkan Data Jadwal");
            System.out.println("4. Urutkan Jadwal Berdasarkan Hari dan Jam");
            System.out.println("5. Cari Jadwal Berdasarkan Nama dosen");
            System.out.println("6. Keluar");

            System.out.print("Pilihan Menu : ");
            menu = sc.nextInt();
            sc.nextLine(); 

            switch (menu) {
                case 1:

                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:

                    break;

                case 6:
                    System.out.println("Program Selesai");
                    break;

                default:
                    System.out.println("Menu Tidak Tersedia");
            }
        } while (menu != 6);
    }
}
