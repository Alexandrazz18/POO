/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto2;

/**
 *
 * @author xochi
 */
//Importa la libreria para ingresar el nomnbre
import java.util.Scanner;
public class Proyecto2 {

    public static void main(String[] args) {
        //Utiliza la clase scanner para solicitar al usuario que ingrese su nombre
        try (Scanner scanner = new Scanner(System.in)) {
            // Parte 1: Strings y estructuras de selección
            System.out.print("Por favor, ingresa tu nombre: ");
            String nombreIngresado = scanner.nextLine().trim();
            String nombreEspecifico = "Alexandra";
            //Compara el nombre ingresado con el nombre especifico sin diferenciar entre mayusculas y minusculas
            if (nombreIngresado.equalsIgnoreCase(nombreEspecifico)) {
                //Si el nombre ingresado es el especifico se muestra el mensaje predeterminado
                System.out.println("¡Hola, Alexandra! Bienvenida de nuevo.");
            } else {
                //Si el nombre ingresado no es el especifico se muestra el mensaje
                System.out.println("Hola, " + nombreIngresado + ". ¡Encantado de conocerte!");
            }
            
            // Parte 2: Estructuras de repetición y arreglos
            int[] numerosPares = new int[50]; // 50 números pares del 2 al 100
            int index = 0;
            //Se usa la variable index para controlar la posición donde se almacenarán los valores en el arreglo
            for (int i = 2; i <= 100; i += 2) {
                //Se utiliza un bucle for que inicia en 2 y se incrementa en 2 en cada iteración
                numerosPares[index] = i;
                //En cada iteración, el número actual (i) se almacena en la posición index del arreglo
                index++;
            }
            
            System.out.println("Números pares del 2 al 100:");
            //Se usa un bucle for-each para recorrer el arreglo numerosPares
            for (int numero : numerosPares) {
                //En cada iteración, se extrae un número del arreglo y se imprime en la misma línea con un espacio entre cada número
                System.out.print(numero + " ");
            }
        }
    }
}
