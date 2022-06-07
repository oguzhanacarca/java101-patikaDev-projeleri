import java.util.Scanner;
import java.lang.String;

public class kullaniciGiris {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userName, password, sifirlama, newPassword;
        System.out.print("Kullanıcı Adınız: ");
        userName = scan.next();
        // burda nextLine yerine next kullanmalısınız cunku yaptıgınız plana göre kullanıcı bir isimli oldugu icin iki isim olsa bile ilk ismi alır sadece next()
        System.out.print("Şifreniz: ");
        password = scan.next();
        // burdada next() olmalıdır cunku şifre boşluk icermez.
        /*
         orneğin nexxtLine() olsaydı "1234 567" gibi şeyleri kabul ederdi
         ama next() olursa size "1234 567" yazsanız bile next() sadece "1234" alacaktır.
         */


        if (userName.equals("oguzhan") && password.equals("1234")) {
            System.out.print("Başarıyla giriş yaptınız.");
        } else if (!(userName.equals("oguzhan") && password.equals("1234"))) {
            /*
            burdada password kısmına equalsIgnoreCase kullanırsanız passwordde buyuk kucuk harf olmasına dikkat etmez ama
            şifrelerde karkterlerin ozelliği sabit kalmalıdır bu yuzden
            equals() kullanmanız daha dogru olucaktır  , yani genel bir projede giriş sayafasında herşeykarekterlere dikkat eder
             */
            System.out.println("Kullanıcı adınız veya şifreniz hatalı.");

            System.out.print("Şifrenizi sıfırlamak ister misiniz? (E/H):");
            sifirlama = scan.nextLine();
            if (sifirlama.equals("H")) {
                System.out.print("Lütfen tekrar giriş yapmak için sayfayı yenileyiniz.");
            } else if (sifirlama.equals("E")) {
                System.out.print("Yeni şifrenizi giriniz: ");
                newPassword = scan.nextLine();

                while (newPassword.equals("1234") || newPassword.equals(password)) {
                    System.out.print("Şifreniz oluşturulamadı. Farklı bir şifre ile tekrar deneyin: ");
                    newPassword = scan.nextLine();
                }
                System.out.print("Şifreniz başarıyla oluşturuldu.\nYeniden Giriş yapabilirsiniz.\nKullanıcı Adınız: ");
                userName = scan.nextLine();
                System.out.print("Şifreniz: ");
                password = scan.nextLine();

                if (userName.equals("oguzhan") && password.equals(newPassword)) {
                    System.out.print("Başarıyla giriş yaptınız.");
                } else {
                    System.out.println("Kullanıcı adınız veya şifreniz hatalı.");
                }

            }


        }


        /*
        daha duzenli ve guzelleride vardır ama şuanlık bunları bildiğiniz için ilerlediğinizde daha sade ve güzel komutlar yazmaaya başlarsınız
         */



    }
}

    
