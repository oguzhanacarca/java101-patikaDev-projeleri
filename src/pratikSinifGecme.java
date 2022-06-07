import java.util.Scanner;
public class pratikSinifGecme {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int matematik, fizik, turkce, kimya, muzik, hesaplanacakNot = 0, toplamDersSayisi = 0;
        double ortalama;

        System.out.print("Matematik Notunuz: ");
        matematik = scan.nextInt();
        if(!(matematik<=0 || matematik>100)){
            hesaplanacakNot +=matematik;
            toplamDersSayisi++;
        }
        System.out.print("Fizik Notunuz: ");
        fizik = scan.nextInt();
        if(!(fizik<=0 || fizik>100)){
            hesaplanacakNot +=fizik;
            toplamDersSayisi++;
        }
        System.out.print("Türkçe Notunuz: ");
        turkce = scan.nextInt();
        if(!(turkce<=0 || turkce>100)){
            hesaplanacakNot +=turkce;
            toplamDersSayisi++;
        }
        System.out.print("Kimya Notunuz: ");
        kimya = scan.nextInt();
        if(!(kimya<=0 || kimya>100)){
            hesaplanacakNot +=kimya;
            toplamDersSayisi++;
        }
        System.out.print("Müzik Notunuz: ");
        muzik = scan.nextInt();
        if(!(muzik<=0 || muzik>100)){
            hesaplanacakNot +=muzik;
            toplamDersSayisi++;
        }


        ortalama = hesaplanacakNot / toplamDersSayisi;

        if (ortalama < 55) {
            System.out.print("Sýnýfý geçemediniz. Ortalamanýz: " +ortalama+ " ve 55'in altýnda.");
        } else {
            System.out.print("Sýnýfý baþarýyla geçtiniz. Ortalamanýz: "+ortalama);
        }



    }
}
