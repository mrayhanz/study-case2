public class DosenMain17 {
    public static void main(String[] args) {
        Dosen17 dosen1 = new Dosen17();
        dosen1.idDosen = "D001";
        dosen1.nama = "Asep";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2017;
        dosen1.bidangKeahlian = "Informatika";

        dosen1.tampilInformasi();
        System.out.println();

        Dosen17 dosen2 = new Dosen17("D002", "Budi", false, 2018, "Sistem Informasi");
        dosen2.tampilInformasi();

        System.out.println("\nPercobaan Method:");
        dosen1.setStatusAktif(false);
        dosen1.tampilInformasi();
        dosen1.hitungMasaKerja(2025);
        System.out.println("Masa Kerja Dosen " + dosen1.nama + " adalah " +dosen1.hitungMasaKerja(2025) + " tahun");
        System.out.println();

        dosen2.ubahKeahlian("Teknik Elektro");
        dosen2.setStatusAktif(true);
        dosen2.tampilInformasi();
        dosen2.hitungMasaKerja(2025);
        System.out.println("Masa Kerja Dosen " + dosen2.nama + " adalah " +dosen2.hitungMasaKerja(2025) + " tahun");
    }
}
