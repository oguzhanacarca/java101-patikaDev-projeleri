import java.util.Scanner;

public class pratikEtkinlikOnerme {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sicaklik;

        System.out.print("Sýcaklýk deðerini giriniz: ");
        sicaklik = scan.nextInt();

        if (sicaklik < 5) {
            System.out.print("Kayak yapmanýzý tavsiye ediyoruz.");
        } else if (6 <= sicaklik && sicaklik <=15) {
            System.out.print("Sinema'ya gitmeye ne dersiniz :)");
        } else if (15 < sicaklik && sicaklik <= 25) {
            System.out.print("Bu sýcaklarda piknik en güzeli olur. ^_^");
        } else if (25 < sicaklik) {
            System.out.print("UV ýþýný çok fazla. Hemen yüzmeye gitmelisin!");
        }


    }
}
