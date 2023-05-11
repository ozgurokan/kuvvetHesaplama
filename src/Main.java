import java.util.Scanner;

// Üslü Sayıları hesaplayan program
public class Main {
    public static void main(String[] args) {
        int base,power,result=1;

        Scanner input = new Scanner(System.in);
        // Taban ve Kuvvet değerleri kullanıcıdan alınır
        System.out.print("Taban Sayısı: ");
        base = input.nextInt();

        System.out.print("Kuvvet: ");
        power = input.nextInt();
        // sonucu hesaplayan for döngüsü yazılır.
        // i sayısı power değerine gelene kadar i bir artırılır ve döngü sayısı kadar base değeri kedni ile çarpılır resul değerine verilir
        for(int i = 1; i <= power; i++){
            result *=base;
        }

        System.out.println(base +" sayısının" + power + ". kuvveti = " +result);
    }
}