import java.util.Scanner;

public class Bank25 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int jml_tabungan_awal, lama_menabung;
        long prosentase_bunga =(long) 0.2, bunga, jml_tabungan_akhir;

        System.out.println ("masukkan jumlah tabungan awal anda");
        jml_tabungan_awal = input.nextInt();
        System.out.println ("masukkan lama menabung anda");
        lama_menabung= input.nextInt();

        bunga= lama_menabung*prosentase_bunga*jml_tabungan_awal;
        jml_tabungan_akhir=bunga+jml_tabungan_awal;

        System.out.println("Jumlah tabungan akhir anda adalah " + jml_tabungan_akhir);
    }
}
