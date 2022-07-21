import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       //Degiskenler tanimlandi.
       double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00, tutar, kg;

       //Kullanicidan aldigi urunlerin bilgileri alindi.
        Scanner scan = new Scanner(System.in);
        System.out.println("-----------------------------------------");

        System.out.println("Kusuratli Alim Yaptiysaniz Virgul Kullanarak Yaziniz! ");
        System.out.print("Kac Kilogram Armut Aldiniz : ");
        kg = scan.nextDouble();
        armut = armut * kg;

        System.out.print("Kac Kilogram Elma Aldiniz : ");
        kg = scan.nextDouble();
        elma = elma * kg;

        System.out.print("Kac Kilogram Domates Aldiniz : ");
        kg = scan.nextDouble();
        domates = domates * kg;

        System.out.print("Kac Kilogram Muz Aldiniz : ");
        kg = scan.nextDouble();
        muz = muz * kg;


        System.out.print("Kac Kilogram Patlican Aldiniz : ");
        kg = scan.nextDouble();
        patlican = patlican * kg;

        tutar = armut + elma + domates + muz + patlican;

        System.out.println("-----------------------------------------");
        System.out.println("Aldiginiz Urunlerin Fiyati : \nArmut : " + armut + "\nElma : " + elma +
                "\nDomates : " + domates + "\nMuz : " + muz + "\nPatlican : "
                + patlican +"\n-----------------------------------------" + "\nToplam Ucret : " + tutar + " TL");

    }
}
