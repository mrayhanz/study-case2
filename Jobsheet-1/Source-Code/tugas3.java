import java.util.Scanner;

public class tugas3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.print("Masukkan Jumlah Matkul : ");
        int jumlahMatkul = sc.nextInt();

        String [] matkul = new String[jumlahMatkul];
        int [] sks = new int[jumlahMatkul];
        int [] sems = new int[jumlahMatkul];
        String [] hari = new String[jumlahMatkul];

        while (true) {
            System.out.println("    === Jadwal Kuliah ===");
            System.out.println("1. Input Jadwal");
            System.out.println("2. Menampilkan Seluruh Jadwal");
            System.out.println("3. Menampilkan Jadwal Pada Hari tertentu");
            System.out.println("4. Menampilkan Jadwal Pada Semester tertentu");
            System.out.println("5. Cari Jadwal Mata Kuliah");
            System.out.println("6. Keluar");

            System.out.print("Pilih Menu : ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1 :
                    inputJadwal(matkul, sks, sems, hari);
                    break;
                case 2 :
                    menampilkanSeluruhJadwal(matkul, sks, sems, hari);
                    break;
                case 3 :
                    jadwalPadaHari(matkul, sks, sems, hari);
                    break;
                case 4 :
                    jadwalPadaSemester(matkul, sks, sems, hari);
                    break;
                case 5 :
                    cariJadwalMataKuliah(matkul, sks, sems, hari);
                    break;
                case 6 :
                    System.out.println("Terima Kasih Telah Menggunakan Program Kami.");
                    return;
                default :
                    System.out.println("Menu Tidak Valid, Silahkan Coba Lagi.");
            }
        }
    }

    public static void inputJadwal(String[] matkul, int[] sks, int[] sems, String[] hari) {
        for (int i = 0; i < matkul.length; i++) {
            System.out.println("Jadwal Mata Kuliah Ke- " + (i+1) );
            System.out.println("=========");

            System.out.print("Masukkan Mata Kuliah : ");
            matkul[i] = sc.next();

            System.out.print("Masukkan SKS : ");
            sks[i] = sc.nextInt();

            System.out.print("Masukkan Semester  : ");
            sems[i] = sc.nextInt();

            System.out.print("Masukkan Hari  : ");
            hari[i] = sc.next();
            System.out.println();
        }
    }

    public static void menampilkanSeluruhJadwal(String[] matkul, int[] sks, int[] sems, String[] hari) {
        if (matkul[0] == null) {
            System.out.println("Jadwal Kosong, Silahkan Input Jadwal terlebih dahulu.");
        } else{
            for (int i = 0; i < matkul.length; i++) {
                System.out.println();
                System.out.println("Matkul : " + matkul[i]);
                System.out.println("Hari : " + hari[i]);
                System.out.println("Semester : " + sems[i]);
                System.out.println("SKS : " + sks[i]);
                System.out.println();
            }
        }
    }

    public static void jadwalPadaHari(String[] matkul, int[] sks, int[] sems, String[] hari) {
        System.out.println("============");
        System.out.print("Masukkan Hari yang di Inginkan : ");
        String hariInput = sc.next();
        System.out.println();

        if (!hariInput.equalsIgnoreCase("senin") && !hariInput.equalsIgnoreCase("selasa") && 
        !hariInput.equalsIgnoreCase("rabu") && !hariInput.equalsIgnoreCase("kamis") && 
        !hariInput.equalsIgnoreCase("jumat") && !hariInput.equalsIgnoreCase("sabtu") && 
        !hariInput.equalsIgnoreCase("minggu")) {
            System.out.println("Masukkan Hari yang valid.\n");
            return;
        }else {
            for (int i = 0; i < matkul.length; i++) {
                if (hari[i].equalsIgnoreCase(hariInput)) {
                    System.out.println();
                    System.out.println("Matkul : " + matkul[i]);
                    System.out.println("Hari : " + hari[i]);
                    System.out.println("Semester : " + sems[i]);
                    System.out.println("SKS : " + sks[i]);
                    System.out.println();
                }else{
                    System.out.println("Jadwal Tidak di temukan untuk hari " + hariInput + "\n");
                }
            }
        }
    }

    public static void jadwalPadaSemester(String[] matkul, int[] sks, int[] sems, String[] hari) {
        System.out.println("=======");
        System.out.print("Masukkan Semester yang di Inginkan : ");
        int semsInput = sc.nextInt();
        System.out.println();

        if (semsInput < 0 || semsInput > 8) {
            System.out.println("Masukkan Semester yang valid.\n");
            return;
        }else {
            for (int i = 0; i < matkul.length; i++) {
                if (sems[i] == semsInput) {
                    System.out.println();
                    System.out.println("Matkul : " + matkul[i]);
                    System.out.println("Hari : " + hari[i]);
                    System.out.println("Semester : " + sems[i]);
                    System.out.println("SKS : " + sks[i]);
                    System.out.println();
                }else{  
                    System.out.println("Jadwal Tidak di temukan untuk semester " + semsInput + "\n");
                }
            }
        }
    }

    public static void cariJadwalMataKuliah(String[] matkul, int[] sks, int[] sems, String[] hari) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=======");
        System.out.print("Masukkan Mata Kuliah yang diinginkan: ");
        String matkulInput = sc.nextLine();

        boolean found = false;
        for (int i = 0; i < matkul.length; i++) {
            if (matkulInput.equalsIgnoreCase(matkul[i])) {
                found = true;
                System.out.println();
                System.out.println("Matkul   : " + matkul[i]);
                System.out.println("Hari     : " + hari[i]);
                System.out.println("Semester : " + sems[i]);
                System.out.println("SKS      : " + sks[i]);
                System.out.println();
                break; 
            }
        }
        if (!found) {
            System.out.println("Mata Kuliah tidak ditemukan.\n");
        }
    }
}