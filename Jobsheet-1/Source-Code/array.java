    import java.util.Scanner;

    public class array {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String namaMK[] = {"Pancasila" , "Konsep Teknologi Informasi" , "Critical Thinking dan Problem Solving" , "Matematika Dasar"
            , "Bahasa Inggris" , "Dasar Pemrograman" , "Praktikum Dasar Pemrograman" , "Keselamatan dan Kesehatan Kerja"};
            int SKS[] = { 2 , 2 , 2 , 3 , 2 , 2 , 3 , 2};
            int nilai[] = new int[8];
            double bobot[] = new double[8];
            String nilaiHuruf[] = new String[8];

            System.out.println("=====================");
            System.out.println("Program Menghitung IP Semester");
            System.out.println("=====================");

            for (int i = 0; i < namaMK.length;i++){
                System.out.print("Masukkan nilai Angka untuk MK " + namaMK[i] + ": ");
                nilai[i] = sc.nextInt();
                while (nilai[i] > 100 || nilai[i] < 0) {
                    System.out.print("Nilai tidak valid, silahkan masukkan nilai antara 0-100 :");
                    nilai[i] = sc.nextInt();
                }

                if (nilai[i] > 80 && nilai[i] <= 100){
                    nilaiHuruf[i] = "A";
                    bobot[i] = 4.0;
                } else if (nilai[i] > 73 && nilai[i] <= 80){
                    nilaiHuruf[i] = "B+";
                    bobot[i] = 3.5;
                } else if (nilai[i] > 65 && nilai[i] <= 73){
                    nilaiHuruf[i] = "B";
                    bobot[i] = 3.0;
                } else if (nilai[i] > 60 && nilai[i] <= 65){
                    nilaiHuruf[i] = "C+";
                    bobot[i] = 2.5;
                } else if(nilai[i] > 50 && nilai[i] <= 60){
                    nilaiHuruf[i] = "C";
                    bobot[i] = 2.0;
                } else if(nilai[i] > 39 && nilai[i] <= 50){
                    nilaiHuruf[i] = "D";
                    bobot[i] = 1.0;
                } else if(nilai[i] <= 39) {
                    nilaiHuruf[i] = "E";
                    bobot[i] = 0.0;
                }

            }
            System.out.println("=====================");
            System.out.println("Hasil Konversi Nilai");
            System.out.println("=====================");
            System.out.println("MK\t\t\t\t\t\tNilai Angka\tNilai Huruf\tBobot Nilai");

            for (int i = 0; i < nilai.length; i++) {
                String mk = namaMK[i];
                while (mk.length() < 52) {
                    mk += " ";
                }
                System.out.println(mk + nilai[i] + "              " + nilaiHuruf[i] + "              " + bobot[i]);
            }

            double totalNilai = 0.0;
            double totalSKS = 0.0;

            for (int i = 0; i < namaMK.length;i++){
                totalSKS += SKS[i];
                totalNilai += (bobot[i] * SKS[i]);
            }

            double IP = totalNilai / totalSKS;

            System.out.println("=====================");
            System.out.printf("IP : " + "%.2f", IP);
        }
    }
