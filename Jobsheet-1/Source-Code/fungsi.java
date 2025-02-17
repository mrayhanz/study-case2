public class fungsi {
    static int[][] stock ={
        {10, 6, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9}
    };

    static int[]harga = {75000, 50000, 60000, 10000};
    public static void main(String[] args) {
        pendapatan();
        stokCabang4();
        kurangiStokCabang4();
        tampilStokCabang4();
    }

    static void pendapatan(){
        System.out.println("Pendapatan Tiap Cabang Jika Semua Bunga Terjual");
        for(int i = 0 ; i<stock.length ; i++){
            int pendapatan = 0;
            for(int j = 0 ; j<stock[i].length ; j++){
                pendapatan += stock[i][j]*harga[j];
            }
            System.out.println("Pendapatan Cabang "+( i + 1 )+" = "+pendapatan);
        }
    }

    public static void stokCabang4() {
        System.out.println("\nStok di RoyalGarden 4:");
        System.out.println("Aglonema: " + stock[3][0]);
        System.out.println("Keladi: " + stock[3][1]);
        System.out.println("Alocasia: " + stock[3][2]);
        System.out.println("Mawar: " + stock[3][3]);
    }

    public static void kurangiStokCabang4() {
        stock[3][0] -= 1;
        stock[3][1] -= 2;
        stock[3][2] -= 0;
        stock[3][3] -= 5;
    }

    public static void tampilStokCabang4() {
        System.out.println("\nStok di RoyalGarden 4:");
        System.out.println("Aglonema: " + stock[3][0]);
        System.out.println("Keladi: " + stock[3][1]);
        System.out.println("Alocasia: " + stock[3][2]);
        System.out.println("Mawar: " + stock[3][3]);
    }
}
