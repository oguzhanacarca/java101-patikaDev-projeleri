import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, b;
        int islemSecimi;
        System.out.print("Ýlk Sayýyý giriniz: ");
        a = scan.nextInt();
        System.out.print("Ýkinci Sayýyý giriniz: ");
        b = scan.nextInt();

        System.out.println("1- Toplama\n2- Çýkarma\n3- Çarpma\n4- Bölme");
        System.out.print("Yapmak istediðiniz iþlem numarasýný giriniz: ");
        islemSecimi = scan.nextInt();

        switch (islemSecimi) {
            case 1:
                System.out.println("Toplama iþlem sonucu: " + (a + b));
                break;
            case 2:
                System.out.println("Çýkarma iþlem sonucu: "+(a-b));
                break;
            case 3:
                System.out.print("Çarpma iþlem sonucu: "+(a*b));
                break;
            case 4:
                System.out.println("Bölme iþlem sonucu: "+(a/b));
                break;
            default:
                System.out.print("Hatalý giriþ yaptýnýz. Lütfen seçiminizi 1 ve 4 rakamlarý ile yapýnýz.");
                break;
        }

    }

}
