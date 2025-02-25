public class MataKuliahMain17 {
    public static void main(String[] args) {
        MataKuliah17 mk1 = new MataKuliah17();
        mk1.KodeMK = "MK1ALSD";
        mk1.nama = "Algoritma & Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 3;

        mk1.tammpilInformasi();
        System.out.println();

        MataKuliah17 mk2 = new MataKuliah17("MK2BD", "Basis Data", 2, 2);
        mk2.tammpilInformasi();

        System.out.println("\nPercobaan Method :");
        mk1.ubahSKS(4);
        mk1.tambahJam(1);
        mk1.tammpilInformasi();

        System.out.println("----------------");

        mk2.ubahSKS(3);
        mk2.tambahJam(1);
        mk2.tammpilInformasi();
    }
}
