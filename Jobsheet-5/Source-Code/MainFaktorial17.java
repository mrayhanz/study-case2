import java.util.Scanner;

public class MainFaktorial17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nilai: ");
        int nilai = sc.nextInt();

        Faktorial17 fk = new Faktorial17();
        System.out.println("Nilai Faktorial " + nilai + " menggunakan BF: " + fk.faktorialBF(nilai));
        System.out.println("Nilai Faktorial " + nilai + " menggunakan DC: " + fk.faktorialDC(nilai));
    }
}