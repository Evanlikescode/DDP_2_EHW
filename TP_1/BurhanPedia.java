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
        
        UserInput();
    }

    public static void UserInput(){
        Scanner inpStokAwal = new Scanner(System.in);
        System.out.print("Masukkan stok awal: ");
        String valStokAwal = inpStokAwal.nextLine();


        Scanner inpHargaBarang = new Scanner(System.in);
        System.out.print("Masukkan harga barang: ");
        String valHargaBarang = inpHargaBarang.nextLine();

        Scanner inpSaldoAwal = new Scanner(System.in);
        System.out.print("Masukkan saldo awal: ");
        String valSaldoAwal = inpSaldoAwal.nextLine();


        

    }



}