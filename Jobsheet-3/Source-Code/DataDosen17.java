public class DataDosen17 {
    Dosen17[] dosen;
    String[] gender;
    int dosenPria = 0;
    int dosenWanita = 0;
    DataDosen17 (Dosen17[] dosen){
        this.dosen = dosen;
        this.gender = new String[dosen.length];
    }
    void dataSemuaDosen(Dosen17[] arrayOfDosen) {
        int i = 0;
        for (Dosen17 dosen : arrayOfDosen) {
            System.out.println("Data Dosen Ke-" + (i + 1));
            System.out.println("Kode           : " + dosen.kode);
            System.out.println("Nama           : " + dosen.nama);
            this.gender[i] = dosen.jenisKelamin ? "Pria" : "Wanita";
            System.out.println("Jenis Kelamin  : " + this.gender[i]);
            System.out.println("Usia           : " + dosen.usia);
            System.out.println("----------------------------");
            i++;
        }
    }

    void jumlahDosenPerJenisKelamin(Dosen17[] arrayOfDosen){
        for(int i = 0; i < arrayOfDosen.length; i++){
            if (arrayOfDosen[i].jenisKelamin == true) {
                this.dosenPria++;
            }else{
                this.dosenWanita++;
            }
        }
        if (dosenPria == 0) {
            System.out.println("Jumlah Dosen Pria : 0");
        }else{
            System.out.println("Jumlah Dosen Pria   : " + dosenPria);
        }
        if (dosenWanita == 0) {
            System.out.println("Jumlah Dosen Wanita : 0");
        }else{
            System.out.println("Jumlah Dosen Wanita : " + dosenWanita);
        }
    }

    void rerataUsiaDosenPerJenisKelamin(Dosen17[] arrayOfDosen){
        int totalPria = 0;
        int totalWanita = 0;
        int jumlahPria = 0;
        int jumlahWanita = 0;
        for(int i = 0; i < arrayOfDosen.length; i++){
            if(arrayOfDosen[i].jenisKelamin == true){
                totalPria += arrayOfDosen[i].usia;
                jumlahPria++;
            }else{
                totalWanita += arrayOfDosen[i].usia;
                jumlahWanita++;
            }
        }
        double rerataPria = (double)totalPria/jumlahPria;
        double rerataWanita = (double)totalWanita/jumlahWanita;
        if (rerataPria == 0) {
            System.out.println("Rerata Usia Dosen Pria   : 0");
        }else{
            System.out.println("Rerata Usia Dosen Pria   : " + rerataPria);
        }
        if (rerataWanita == 0) {
            System.out.println("Rerata Usia Dosen Wanita   : 0");
        }else{
            System.out.println("Rerata Usia Dosen Wanita : " + rerataWanita);

        }
    }

    void infoDosenPalingTua(Dosen17[] arrayOfDosen) {
        int usiaPalingTua = 0;
    
        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia > usiaPalingTua) {
                usiaPalingTua = arrayOfDosen[i].usia;
            }
        }

        System.out.println("Data Dosen Paling Tua:");
        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia == usiaPalingTua) {
                System.out.println("Kode           : " + arrayOfDosen[i].kode);
                System.out.println("Nama           : " + arrayOfDosen[i].nama);
                System.out.println("Jenis Kelamin  : " + (arrayOfDosen[i].jenisKelamin ? "Pria" : "Wanita"));
                System.out.println("Usia           : " + arrayOfDosen[i].usia);
                System.out.println("----------------------------");
            }
        }
    }
    

    void infoDosenPalingMuda(Dosen17[] arrayOfDosen){
        int usiaPalingMuda = Integer.MAX_VALUE;

        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia < usiaPalingMuda) {
                usiaPalingMuda = arrayOfDosen[i].usia;
            }
        }

        System.out.println("Data Dosen Paling Muda:");
        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia == usiaPalingMuda) {
                System.out.println("Kode           : " + arrayOfDosen[i].kode);
                System.out.println("Nama           : " + arrayOfDosen[i].nama);
                System.out.println("Jenis Kelamin  : " + (arrayOfDosen[i].jenisKelamin ? "Pria" : "Wanita"));
                System.out.println("Usia           : " + arrayOfDosen[i].usia);
                System.out.println("----------------------------");
            }
        }
    }
}
