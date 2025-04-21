public class Dosen{
    String nidn;
    String namaDosen;


    Dosen(){}

    Dosen(String nidn, String namaDosen){
        this.nidn = nidn;
        this.namaDosen = namaDosen;
    }

    void tampilDataDosen(){
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama Mata Kuliah: " + namaMK);
        System.out.println("SKS: " + sks);
    }
}
