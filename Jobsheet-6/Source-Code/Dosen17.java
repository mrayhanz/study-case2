public class Dosen17 {
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia;



    Dosen17(String kd, String name, Boolean jk, int age){
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil(){
        String gender;
        System.out.println("Kode : " + this.kode);
        System.out.println("Nama : " + this.nama);
        
        gender = (this.jenisKelamin == true) ? "Pria" : "Wanita";
        
        System.out.println("Jenis Kelamin : " + gender);
        System.out.println("Usia : " + this.usia);
    }
}
