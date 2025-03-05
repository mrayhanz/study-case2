import java.util.Arrays;
import java.util.Scanner;

public class DosenDemo17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Dosen: ");
        int jumlah = sc.nextInt();
        System.out.println();
        Dosen17[] arrayOfDosen = new Dosen17[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i+1));
            arrayOfDosen[i] = new Dosen17();
            arrayOfDosen[i].tambahData();
            System.out.println("----------------------------");
        }

        for (Dosen17 dosen : arrayOfDosen){
            System.out.println("Data Dosen Ke-" + (Arrays.asList(arrayOfDosen).indexOf(dosen)+1));
            dosen.cetakinfo();
            System.out.println("----------------------------");
        }
    }
}
