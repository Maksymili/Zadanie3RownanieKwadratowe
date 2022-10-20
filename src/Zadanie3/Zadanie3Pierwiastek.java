package Zadanie3;

import java.util.Scanner;

public class Zadanie3Pierwiastek {

    public static void main(String[] args) {

        Scanner a= new Scanner(System.in);

        System.out.println("Podaj wartosc a: ");

        float pierwsza = a.nextFloat();

        while (pierwsza == 0) {
            System.out.println("Zmienna a nie moze mieć wartosci 0");


        }


        Scanner b= new Scanner(System.in);

        System.out.println("Podaj wartosc b: ");

        float druga = b.nextFloat();


        Scanner c= new Scanner(System.in);

        System.out.println("Podaj wartosc c: ");

        float trzecia = a.nextFloat();





        double delta = druga*druga - 4*pierwsza*trzecia;

        System.out.print("Delta wynosi: " + delta);



        if(delta < 0){
            System.out.println(" Nie ma miejsc zerowych");
        }else if(delta == 0){
            double x1  = ((-1*druga)/pierwsza*2);
            System.out.println(" Istnieje jedno miejsce zerowe ktore wynosi:" + x1);
        }else if(delta > 0){
            delta = Math.sqrt(delta);
            double x1  = ((-1*druga)-delta/pierwsza*2);
            double x2  = ((-1*druga)+delta/pierwsza*2);
            System.out.println(" Istnieją dwa miejsce zerowe ktore wynoszą:" + x1 + x2);
        }


    }

}
