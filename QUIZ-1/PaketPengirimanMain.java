public class PaketPengirimanMain {
    public static void main(String[] args) {
        PaketPengiriman[] arrayOfPaket = new PaketPengiriman[3];
        arrayOfPaket[0] = new PaketPengiriman();
        arrayOfPaket[0].nomorResi = "N123";
        arrayOfPaket[0].berat = 8;
        arrayOfPaket[0].ongkosDasar = 50000;
        arrayOfPaket[1] = new PaketPengiriman();
        arrayOfPaket[1].nomorResi = "P1234";
        arrayOfPaket[1].berat = 12;
        arrayOfPaket[1].ongkosDasar = 40000;
        arrayOfPaket[2] = new PaketPengiriman();
        arrayOfPaket[2].nomorResi = "R1234";
        arrayOfPaket[2].berat = 15;
        arrayOfPaket[2].ongkosDasar = 20000;

        arrayOfPaket[0].printData();
        arrayOfPaket[1].printData();
        arrayOfPaket[2].printData();

        int beratLebih = 0;
        double ongkos10 = 0;
        double totalOngkosKirim = 0;
        for(int i = 0; i < arrayOfPaket.length;i++){
            double ongkos = arrayOfPaket[i].totalOngkos();
            totalOngkosKirim += ongkos;
            if (arrayOfPaket[i].berat > 10) {
                beratLebih++;
                beratLebih += ongkos;
            }
        }
        System.out.println("Total Ongkos Kirim : " + totalOngkosKirim);
        System.out.println("Total Ongkos Kirim Lebih dari 10Kg : " + beratLebih);
    }
}
