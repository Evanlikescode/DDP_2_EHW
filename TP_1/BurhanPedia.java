import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class BurhanPedia{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=============================================================");
        System.out.println("\n  ____             _                 _____         _ _       \r\n" +
                " |  _ \\           | |               |  __ \\       | (_)      \r\n" +
                " | |_) |_   _ _ __| |__   __ _ _ __ | |__) |__  __| |_  __ _ \r\n" +
                " |  _ <| | | | '__| '_ \\ / _` | '_ \\|  ___/ _ \\/ _` | |/ _` |\r\n" +
                " | |_) | |_| | |  | | | | (_| | | | | |  |  __/ (_| | | (_| |\r\n" +
                " |____/ \\__,_|_|  |_| |_|\\__,_|_| |_|_|   \\___|\\__,_|_|\\__,_|\r\n" +
                "                                                             \r\n" +
                "                                                             ");
        System.out.println("=============================================================");
        System.out.println("============== Selamat datang di Burhanpedia! ===============");
        System.out.println("=============================================================");
        
        try{
            Scanner inpStokAwal = new Scanner(System.in);
            System.out.print("Masukkan stok awal: ");
            Integer valStokAwal = inpStokAwal.nextInt();
    
            Scanner inpHargaBarang = new Scanner(System.in);
            System.out.print("Masukkan harga barang: ");
            Integer valHargaBarang = inpHargaBarang.nextInt();
    
            Scanner inpSaldoAwal = new Scanner(System.in);
            System.out.print("Masukkan saldo awal: ");
            Integer valSaldoAwal = inpSaldoAwal.nextInt();

            System.out.print('\n');
            System.out.print("Pilih menu \n");
            System.out.print("1. Penjual \n");
            System.out.print("2. Pembeli \n");
            System.out.print("3. Hari Selanjutnya \n");
            System.out.print("4. Keluar \n");

        }catch(Exception e){
            System.out.println("Please check your input once again ");
        }

    }



}