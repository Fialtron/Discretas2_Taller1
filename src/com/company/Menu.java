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
                    try{
                        System.out.println("Ingrese el primer valor ");
                        int a = sc.nextInt();
                        System.out.println("Ingrese el segundo valor ");
                        int b = sc.nextInt();
                        euclides(Math.abs(Math.max(a,b)),Math.abs(Math.min(a,b)));
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }

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
                dividendo = divisor;
                divisor = r;
                r = dividendo%divisor;
            }
            return divisor;
        }else{
            return Math.max(a, b);
        }
    }

    public int[] euclides(int a,int b){
        int x= 0;
        int y = 0;
        int[] respuesta = new int[1];

        System.out.println("gcd"+ gcd(a,b));


        respuesta[0]= x;
        respuesta[1] = y;
        return respuesta;
    }
}
