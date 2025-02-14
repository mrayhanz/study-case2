import java.util.Scanner;

public class pemilihan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("======================");
        System.out.print("Masukkan Nilai Tugas: ");
        double nTugas = sc.nextInt();
        System.out.print("Masukkan Nilai Kuis: ");
        double nKuis = sc.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        double nUTS = sc.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        double nUAS = sc.nextInt();
        System.out.println("======================");
        System.out.println("======================");
        if (nTugas < 0 || nTugas > 100 || nKuis < 0 || nKuis > 100 || nUTS < 0 || nUTS > 100 || nUAS < 0 || nUAS > 100) {
            System.out.println("Nilai Tidak Valid");
            return;
        }

        double nilaiAkhir = (0.2 * nTugas) + (0.2 * nKuis) + (0.3 * nUTS) + (0.4 * nUAS);
        String nilaiHuruf;
        if (nilaiAkhir <= 100 && nilaiAkhir > 80) { 
            nilaiHuruf = "A";
        }
        else if (nilaiAkhir < 80 && nilaiAkhir >= 73) { 
            nilaiHuruf = "B+";
        }
        else if (nilaiAkhir < 73 && nilaiAkhir >= 65) { 
            nilaiHuruf = "B";
        }
        else if (nilaiAkhir < 65 && nilaiAkhir >= 60) { 
            nilaiHuruf = "C+";
        }
        else if (nilaiAkhir < 60 && nilaiAkhir >= 50) { 
            nilaiHuruf = "C";
        }
        else if (nilaiAkhir < 50 && nilaiAkhir >= 39) { 
            nilaiHuruf = "D";
        }
        else{ 
            nilaiHuruf = "E";
        }

        System.out.println("Nilai Akhir : " + nilaiAkhir);
        System.out.println("Nilai Huruf : " + nilaiHuruf);
        System.out.println("======================");
        if (nilaiHuruf.equalsIgnoreCase("D")) {
            System.out.println("ANDA TIDAK LULUS");
        } else if (nilaiHuruf.equalsIgnoreCase("E")) {
            System.out.println("ANDA TIDAK LULUS");
        } else {
            System.out.println("SELAMAT ANDA LULUS");
        }
    }
}