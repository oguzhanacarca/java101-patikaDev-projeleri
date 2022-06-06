import java.util.Scanner;

public class taksimetreProgrami {
    public static void main(String[] args){
        int km, minTutar = 20, acilisUcreti =10;
        double perKm = 2.20, odenecekTutar;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi KM cinsinden giriniz: ");
        km = input.nextInt();

        odenecekTutar = (acilisUcreti + (km * perKm));
        System.out.println("Açılış Ücreti: " +acilisUcreti);
        System.out.println("KM Başına Ödemeniz Gereken Ücret: " +perKm);

        if (odenecekTutar < 20){
            odenecekTutar = 20;
            System.out.println("Minimum Ödemeniz Gereken Ücret: 20TL'dir.");

        }
        System.out.println("Ödemeniz Gereken Ücret: " +odenecekTutar);







    }
}
