import java.util.Scanner;
public class Dosen17 {
    public String kode;
    public String nama;
    public boolean jenisKelamin;
    public int usia;

    public Dosen17() {}

    public Dosen17(String kode, String nama, boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    void tambahData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Kode           : ");
        kode = sc.nextLine();
        System.out.print("Nama           : ");
        nama = sc.nextLine();
        while (true) {
            System.out.print("Jenis Kelamin  : ");
            String gender = sc.nextLine().trim();
            if (gender.equalsIgnoreCase("Pria")) {
                jenisKelamin = true;
                break;
            } else if (gender.equalsIgnoreCase("Wanita")) {
                jenisKelamin = false;
                break;
            } else {
                System.out.println("Input tidak valid. Masukkan 'Pria' atau 'Wanita'.");
            }
        }
        System.out.print("Usia           : ");
        usia = sc.nextInt();
    }

    void cetakinfo(){
        System.out.println("Kode           : " + kode);
        System.out.println("Nama           : " + nama);
        System.out.println("Jenis Kelamin  : " + (jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia           : " + usia);
    }
}
