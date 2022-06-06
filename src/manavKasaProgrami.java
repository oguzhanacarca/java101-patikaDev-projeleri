import java.util.Scanner;
public class manavKasaProgrami {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double armut, elma, domates, muz, patlican, toplamTutar;

        System.out.print("Kaç kilogram armut? ");
        armut = 2.14 * input.nextDouble();
        System.out.print("Kaç kilogram elma? ");
        elma = 3.67 * input.nextDouble();
        System.out.print("Kaç kilogram domates? ");
        domates = 1.11 * input.nextDouble();
        System.out.print("Kaç kilogram muz? ");
        muz = 0.95 * input.nextDouble();
        System.out.print("Kaç kilogram patlýcan? ");
        patlican = 5.00 * input.nextDouble();

        String tl = " TL";
        toplamTutar = (armut + elma + domates + muz + patlican);
        System.out.print("Ödemeniz gereken toplam tutar: " +toplamTutar+tl);




    }
}
