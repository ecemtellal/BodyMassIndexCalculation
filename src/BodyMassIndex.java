import java.util.Scanner;
public class BodyMassIndex {
    public static void main(String[] args) {
        double height,bmi;
        int weight;

        Scanner input=new Scanner(System.in);
        System.out.println("Ağırlığınızı (kg cinsinden) giriniz: ");
        weight=input.nextInt();
        //weight ağırlık demek
        System.out.println("Boyunuzu (metre cinsinden) giriniz: ");
        height=input.nextDouble();
        //height boy demek

        bmi= weight / (height*height) ;
        //body mass index acılımı vücut kitle indeksi demek
        System.out.println("Vücut kitle indeksiniz: "+ bmi);

    }
}
