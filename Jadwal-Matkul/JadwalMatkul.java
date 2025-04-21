public class JadwalMatkul {
    Jadwal[] jadwal = new Jadwal[7];
    int idx;

    void sortingbyday() {
        Jadwal temp;
        for (int i = 0; i < jadwal.length - 1; i++) {
            for (int j = i + 1; j < jadwal.length; j++) {
                if (jadwal[i] != null && jadwal[j] != null && jadwal[i].hari.compareTo(jadwal[j].hari) > 0) {
                    temp = jadwal[i];
                    jadwal[i] = jadwal[j];
                    jadwal[j] = temp;
                }
            }
        }
    }

    void tambahJadwal(Jadwal j) {
        if (idx < jadwal.length) {
            jadwal[idx] = j;
            idx++;
        } else {
            System.out.println("Array jadwal sudah penuh!");
        }
    }

    void tampilkanJadwal() {
        for (int i = 0; i < idx; i++) {
            if (jadwal[i] != null) {
                jadwal[i].tampilDataJadwal();
            }
        }
    }
}