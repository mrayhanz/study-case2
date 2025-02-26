public class MataKuliah17 {
    String KodeMK;
    String nama;
    int sks;
    int jumlahJam;
    
    MataKuliah17(){
    }

    MataKuliah17(String kodemk, String nm, int sks, int jam){
        KodeMK = kodemk;
        nama = nm;
        this.sks = sks;
        jumlahJam = jam;
    }

    void tampilInformasi(){
        System.out.println("Kode MK: " + KodeMK);
        System.out.println("Nama MK: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }

    void ubahSKS(int sksBaru){
        if (sksBaru < 2 || sksBaru > 6) {
            System.out.println("SKS harus antara 2-6");
        }else{
            sks = sksBaru;
        }
    }

    void tambahJam (int jam){
        jumlahJam += jam;
    }

    void kurangiJam (int jam){
        if (jam > jumlahJam) {
            System.out.println("Jumlah jam tidak dapat di lakukan");
        }else {
            jumlahJam -= jam;
        }
    }
}
