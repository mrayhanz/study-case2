import java.util.Scanner;

public class Matakuliah17Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Matakuliah : ");
        int matkul = sc.nextInt();
        Matakuliah17[] arrayOfMatakuliah = new Matakuliah17[matkul];

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i+1));
            arrayOfMatakuliah[i] = new Matakuliah17();
            arrayOfMatakuliah[i].tambahData();
        }

        for (int i = 0; i < 3; i++){
            System.out.println("Data Matakuliah ke-" + (i+1));
            arrayOfMatakuliah[i].cetakinfo();
        }
    }
}
