import java.util.Scanner;

public class Gaji25 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        int jmlMasuk, JmlTdkMasuk, TotGaji;
        int gaji=40000;
        int potGaji=25000;

        System.out.println("Masukkan Besaran Gaji Anda");
        gaji = input.nextInt();
        System.out.println("Masukkan Besaran Potongan Gaji Anda");
        potGaji = input.nextInt();
        System.out.println("Masukkan Jumlah Hari Masuk Kerja Anda");
        jmlMasuk=input.nextInt();
        System.out.println("Masukkan Jumlah Hari Tidak Masuk Kerja Anda");
        JmlTdkMasuk=input.nextInt();

        TotGaji=(jmlMasuk*gaji)-(JmlTdkMasuk*potGaji);
        System.out.println("Gaji Yang Anda Terima Adalah" +TotGaji);

    }
}
