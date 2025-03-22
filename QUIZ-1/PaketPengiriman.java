public class PaketPengiriman {

    PaketPengiriman[] paket;
    public String nomorResi;
    public double berat;
    public double ongkosDasar;

    double totalOngkos() {
        double total = ongkosDasar * berat;
        if (total >= 100000) {
            total *= 0.9;
        }
        return total;
    }
    

    void persentase(PaketPengiriman[] arrayOfpaket){
        int totalLebih10 = 0;
        for (int i = 0; i < arrayOfpaket.length;i++){
            if (arrayOfpaket[i].berat > 10) {
                totalLebih10++;
            }
        }
        double persentase = (double)totalLebih10 / arrayOfpaket.length;
        System.out.println("Persentase Barang Lebih dari 10KG : " + persentase + "%");
    }

    void printData(){
        System.out.println("Nomor Resi         :" + nomorResi);
        System.out.println("Berat Paket        :" + berat + "kg");
        System.out.println("Ongkos Dasar Paket :" + ongkosDasar);
        System.out.println("----------------------------------------");
    }
}