import java.util.Scanner;

public class HargaBayar25 {
    public static void main (String[] args) {
        Scanner input =new Scanner(System.in);

        String MerkBuku;
        int harga, jumlah, jmlHmlBuku;
        double dis, total, bayar, jmlDis;

        System.out.println("Masukkan Merk Buku");
        MerkBuku=input.nextLine();
        System.out.println("Masukkan Jumlah Halaman Buku");
        jmlHmlBuku=input.nextInt();
        System.out.println("Masukkan Harga Barang Yang Dibeli");
        harga=input.nextInt();
        System.out.println("Masukkan Jumlah jumlah barang yang dibeli");
        jumlah=input.nextInt();
        System.out.println("Masukkan Besaran Diskon");
        dis = input.nextDouble();

        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;
        System.out.println("Diskon yang anda dapatkan adalah\t\t" +jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah\t\t" +bayar);
    }
}
