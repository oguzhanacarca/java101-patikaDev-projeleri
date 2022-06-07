import java.util.Scanner;
import java.lang.String;

public class kullaniciGiris {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userName, password, sifirlama, newPassword;
        System.out.print("Kullanýcý Adýnýz: ");
        userName = scan.nextLine();
        System.out.print("Þifreniz: ");
        password = scan.nextLine();

        if (userName.equals("oguzhan") && password.equals("1234")) {
            System.out.print("Baþarýyla giriþ yaptýnýz.");
        } else if (!(userName.equals("oguzhan") && password.equalsIgnoreCase(""))) {
            System.out.println("Kullanýcý adýnýz veya þifreniz hatalý.");
            System.out.print("Þifrenizi sýfýrlamak ister misiniz? (E/H):");
            sifirlama = scan.nextLine();
            if (sifirlama.equals("H")) {
                System.out.print("Lütfen tekrar giriþ yapmak için sayfayý yenileyiniz.");
            } else if (sifirlama.equals("E")) {
                System.out.print("Yeni þifrenizi giriniz: ");
                newPassword = scan.nextLine();

                while (newPassword.equals("1234") || newPassword.equals(password)) {
                    System.out.print("Þifreniz oluþturulamadý. Farklý bir þifre ile tekrar deneyin: ");
                    newPassword = scan.nextLine();
                }
                System.out.print("Þifreniz baþarýyla oluþturuldu.\nYeniden Giriþ yapabilirsiniz.\nKullanýcý Adýnýz: ");
                userName = scan.nextLine();
                System.out.print("Þifreniz: ");
                password = scan.nextLine();

                if (userName.equals("oguzhan") && password.equals(newPassword)) {
                    System.out.print("Baþarýyla giriþ yaptýnýz.");
                } else {
                    System.out.println("Kullanýcý adýnýz veya þifreniz hatalý.");
                }

            }


        }

    }
}
