package com.company;
import java.util.Scanner;

public class Menu {
    boolean salir = false;
    Scanner sc = new Scanner(System.in);
    
    public Menu(){
        System.out.println("Este programa entregara soluciones particulares x, y. \n" +
                " Para la solucion al problema gcd(a,b)= ax+by. Donde a y b seran entregados por el usuario");

        while(!salir){
            System.out.println("\nMenu  " +
                    "\n  1. Encontrar una solución al problema" +
                    "\n  2. Encontrar multiples soluciones al problema" +
                    "\n  3. Salir.");
            System.out.println("\n Ingrese la opcion deseada: ");
            int opcion =  sc.nextInt();
            switch (opcion){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("\nHasta luego");
                    salir = true;
                    break;
                default:
                    break;
            }

        }
    }

    public int gcd(int a, int b){
        if ( !(a == 0 || b==0)){
            int r = a%b;
            int dividendo = Math.max(a,b);
            int divisor = Math.min(a,b);

            while(!(r == 0)){
                r = dividendo%divisor;
                dividendo = divisor;
                divisor = r;
            }
            return divisor;
        }else{
            return Math.max(a, b);
        }
    }
}
