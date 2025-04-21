public class Jadwal {
    Dosen dosen = new Dosen();
    Matakuliah matkul = new Matakuliah();
    String hari;


    Jadwal(){}

    Jadwal(Dosen dosen, Matakuliah matkul, String hari) {
        this.dosen = dosen;
        this.matkul = matkul;
        this.hari = hari;
    }

    int hitungMenit(){
        return matkul.sks * 50;
    }

    void tampilData(){
        
    }
}
