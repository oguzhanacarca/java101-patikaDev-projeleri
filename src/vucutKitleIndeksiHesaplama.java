import java.util.Scanner;

public class vucutKitleIndeksiHesaplama {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double kilo, boy, vucutKitleIndeks;

        System.out.print("Lütfen Kilonuzu giriniz: ");
        kilo = input.nextDouble();
        System.out.print("Lütfen Boyunuzu (metre cinsinden) giriniz: ");
        boy = input.nextDouble();

        vucutKitleIndeks = ( kilo / ( boy* boy ));
        System.out.print("Vücut Kitle Ýndeksiniz: " +vucutKitleIndeks);




    }


}
