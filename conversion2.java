import java.util.*;
public class conversion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.println("Selanat datang!");
            System.out.println("Ada yang bisa kami bantu?");
            System.out.println("1. Biner ke Desimal");
            System.out.println("2. Desimal ke Biner");
            System.out.println("3. Biner ke Heksadesimal");
            System.out.println("4. Heksadesimal ke Biner");
            System.out.println("5. Desimal ke Heksadesimal");
            System.out.println("6. Heksadesimal ke Desimal");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Anda: ");
            n = sc.nextInt();
            sc.nextLine();
            String input;
            switch (n) {
                case 1:
                    System.out.print("Masukkan bilangan biner: ");
                    input = sc.nextLine();
                    int decimal = Integer.parseInt(input, 2);
                    System.out.println("Hasil konversi: " + decimal);
                    break;
                case 2:
                    System.out.print("Masukkan bilangan desimal: ");
                    int number = sc.nextInt();
                    input = Integer.toBinaryString(number);
                    System.out.println("Hasil konversi: " + input);
                    break;
                case 3:
                    System.out.print("Masukkan bilangan biner: ");
                    input = sc.nextLine();
                    int hex = Integer.parseInt(input, 2);
                    String hexString = Integer.toHexString(hex);
                    System.out.println("Hasil konversi: " + hexString.toUpperCase());
                    break;
                case 4:
                    System.out.print("Masukkan bilangan heksadesimal: ");
                    input = sc.nextLine();
                    int binary = Integer.parseInt(input, 16);
                    String binaryString = Integer.toBinaryString(binary);
                    System.out.println("Hasil konversi: " + binaryString);
                    break;
                case 5:
                    System.out.print("Masukkan bilangan desimal: ");
                    int dec = sc.nextInt();
                    String hexResult = Integer.toHexString(dec);
                    System.out.println("Hasil konversi: " + hexResult.toUpperCase());
                    break;
                case 6:
                    System.out.print("Masukkan bilangan heksadesimal: ");
                    input = sc.nextLine();
                    int decimalResult = Integer.parseInt(input, 16);
                    System.out.println("Hasil konversi: " + decimalResult);
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia.");
            }
        }while(n != 0);
    }
}

