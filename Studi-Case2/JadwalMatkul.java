public class JadwalMatkul {
    Jadwal[] jadwal = new Jadwal[7];

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


}