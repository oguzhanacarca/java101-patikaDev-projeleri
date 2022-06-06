import java.util.Scanner;

public class daireAlanHesaplama {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double yariCap, daireAlan, daireCevre, merkezAci, merkezAlan;

        System.out.print("Yarý Çapýný giriniz: ");
        yariCap = input.nextDouble();
        System.out.print("Merkez Açýsýnýn Ölçüsünü Giriniz: ");
        merkezAci = input.nextDouble();


        // Alan Hesaplama pi*r*r
        daireAlan = Math.PI * yariCap * yariCap;
        daireCevre = 2 * Math.PI * yariCap;
        merkezAlan = ((Math.PI * (yariCap*yariCap) * merkezAci) / 360);
        System.out.println("Daire Alaný: " +daireAlan);
        System.out.println("Daire Çevresi: " +daireCevre);
        System.out.println("Merkez Açýsý Verilmiþ Daire Alaný: " +merkezAlan);

    }

}