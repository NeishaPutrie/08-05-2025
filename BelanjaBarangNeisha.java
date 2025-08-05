import java.util.Scanner;
public class BelanjaBarangNeisha {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Nama Barang 1");
        String namaBarang1 = input.next();
        System.out.println("Harga Barang 1");
        double harga1 = input.nextDouble();
        System.out.println("Masukan Nama Barang 2");
        String namaBarang2 = input.next();
        System.out.println("Harga Barang 2");
        double harga2 = input.nextDouble();

        System.out.println("=====Daftar Belanja=====");
        System.out.println("Nama Barang 1: "+namaBarang1);
        System.out.println("Harga Barang 1: "+harga1);
        System.out.println("-------------------");
        System.out.println("Nama Barang 2: "+namaBarang2);
        System.out.println("Harga Barang 2: "+harga2);
        System.out.println("========================");
    }


}
