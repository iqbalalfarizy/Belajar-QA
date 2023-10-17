package firstProgram;

import static firstProgram.FirstProgram.nama;

public class fungsi {
    public static void  main(String[] args){
        int x = 6;
        int y = 12;
        int z = 16;

        nama("iqbal");
        jumlah (x, y);
        jumlah (y, z);
        jumlah (x, z);
    }


    public static int jumlah (int a, int b){
        int hasil = a + b;
        System.out.println("Hasil penjumlahan "+a+" dan "+b+" adalah " + hasil);
        return hasil;
    }
}
