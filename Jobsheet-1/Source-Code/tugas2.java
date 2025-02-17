import java.util.Scanner;

public class tugas2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Masukkan Panjang sisi kubus:");
        int sisi = sc.nextInt();

        while (true) {
            System.out.println("\n=== Program Penghitungan Kubus ===");
            System.out.println("1. Volume Kubus ");
            System.out.println("2. Luas Kubus ");
            System.out.println("3. Keliling Kubus ");
            System.out.println("4. Keluar.");
            System.out.print("Pilih Menu: ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                System.out.println("Volume Kubus: " + volumeKubur(sisi));
                break;
                case 2:
                System.out.println("Luas Kubus: " + luasKubus(sisi));
                break;
                case 3:
                System.out.println("Keliling Kubus: " + kelilingKubus(sisi));
                break;
                case 4:
                System.out.println("Terima Kasih Telah Menggunakan Program Kami.");
                return;
                default:
                System.out.println("Menu tidak tersedia. Silahkan pilih menu yang tersedia.");
                break;
            }
        }
    }
    
    public static int volumeKubur(int sisi) {
        int volume = sisi * sisi * sisi;
        return volume;
    }

    public static int luasKubus(int sisi) {
        int luas = 6 * (sisi * sisi);
        return luas;
    }

    public static int kelilingKubus(int sisi) {
        int keliling = 12* sisi;
        return keliling;
    }
}
