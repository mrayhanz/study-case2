public class JadwalMatkul {
    Jadwal[] jadwal = new Jadwal[7];
    int idx;

    void sortingbyday() {
        Jadwal temp = new Jadwal();
        for (int i = 0; i < jadwal.length - 1; i++) {
            for (int j = i + 1; j < jadwal.length; j++) {
                if (jadwal[i].hari.compareTo(jadwal[j].hari) > 0) {
                    temp = jadwal[i];
                    jadwal[i] = jadwal[j];
                    jadwal[j] = temp;
                }
            }
        }
    }
}