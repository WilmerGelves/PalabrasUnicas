package com.palabrasunicas;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        palabraUnicas();
    }

    public static void palabraUnicas(){
        try {
            Scanner sc = new Scanner(System.in);
            Set<String> palabras = new TreeSet<String>();
            String palabra;
            int cantPalabras,contador = 0;

            System.out.print("\nNúmero de palabras que desea ingresar ->");
            cantPalabras = sc.nextInt();
            sc.nextLine(); //Formateo del buffer. 
            while (true) {

                System.out.print("Palabra N°" + (contador+1) + ": ");
                palabra = sc.nextLine().trim().toLowerCase();
                palabras.add(palabra);
                contador++;

                if (cantPalabras == contador) {
                    break;
                }
            }
            String mensaje = """
                                            ========================
                                            =        Palabras       =
                                            ========================
                                        """;
            System.out.println(mensaje);
            for (String item : palabras) {
                System.out.println( "\t--> " + item);
            }

            System.out.println("Ingrese la palabra que desea buscar: ");
            palabra = sc.nextLine().trim().toLowerCase();
            String busqueda = (palabras.contains(palabra)) ? "La palabra esta en la lista":"La palabra no está en la lista";
            System.out.println(busqueda);
            sc.close();

        } catch (Exception e) {
            System.out.println("Ingresaste datos incorrectos.");
            palabraUnicas();
        }
        
    }
}