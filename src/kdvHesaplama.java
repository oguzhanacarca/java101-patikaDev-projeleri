import java.util.Scanner;
public class kdvHesaplama {
    public static void main(String[] args) {

        // Deðiþken deðerimiz KDV sayýlarý olacak
        double sayi, kdvOrani18= 0.18, kdvOrani8= 0.08, kdvliSonuc, hesaplananKdv, hesaplananKdv2, str, str2;

        Scanner input = new Scanner(System.in);

        // Kullanýcýdan KDV deðeri girmesini isteyelim

        System.out.print("KDV'si hesalanacak sayý: ");
        sayi = input.nextDouble();

        /** str açýklama
         * Ýhtimal olarak girilecek sayý 1000'den küçükse hesaplananKdv 'i kullanýyoruz.
         * Deðilse hesaplananKdv2 yi kullanýyor sistem. */

        boolean kdvDusuk = sayi < 1000;
        hesaplananKdv = (sayi * kdvOrani18);
        hesaplananKdv2 = (sayi * kdvOrani8);

        /** str 2 açýklama
         *  kdvDüþük doðru ise kdvOrani18'i kullan
         *  deðilse kdvOrani8'i kullan anlamýna geliyor.
         */
        str = kdvDusuk ? (hesaplananKdv) : (hesaplananKdv2);
        str2 = kdvDusuk ? (kdvOrani18) : (kdvOrani8);


        // Sayýyý KDV'li hale dönüþtürelim ve ekrana nihai çýktýyý alalým.

        kdvliSonuc = ( str + sayi);

        System.out.println("KDV'siz Tutar: "+ sayi);
        System.out.println("KDV Oraný: "+ str2);
        System.out.println("Eklenecek KDV: "+ str);
        System.out.println("KDV'li Tutar: "+ kdvliSonuc);
    }
}