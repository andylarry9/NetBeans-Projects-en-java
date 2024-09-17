/*
 * Click  to change this license
 * Click  to edit this template
 */
package calculo_areas_figuras;

import java.util.Scanner;

/**
 *
 * @author ana mancilla
 */
public class Calculo_areas_figuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); // permite definir el objeto input encargado de leer datos de consola
        //Implementar un proyecto de consola en Java que permita:
            //1. Calcular el area de un triangulo.
            //2. Calcular el area de un cuadrado.
            //3. Calcular el area de un circulo.
            // y muestre en pantalla el area de las respectivas figuras.
        
        
        
        //Esquema general de ejecucion de un algoritmo
        //1.Declaracion de las variables
              //Datos de entrada
              double base, altura; //triangulo
              double lado_cuadrado; //cuadrado
              double radio; //circulo
    
              //Datos de salida
              double area_triangulo, area_cuadrado, area_circulo; 
                 
              //datos auxiliares
            final double PI = 3.1415;
    
    //2. Entrada de los datos
         System.out.println("Digite los datos del triangulo:");
         System.out.print("\t Base:");
         base = input.nextDouble(); //leer el dato de la base del triangulo
         System.out.print("\t Altura:");
         altura = input.nextDouble(); //leer el dato de altura del triangulo
         
         System.out.println("Digite los datos del cuadrado:");
         System.out.print("\t Lado:");
         lado_cuadrado = input.nextDouble(); //leer el dato del lado del cuadrado
         
         System.out.println("Digite los datos del circulo:");
         System.out.print("\t Radio:");
         radio = input.nextDouble(); //leer el dato del radio del circulo
         
    //3. Procesamiento de los datos
         area_triangulo = base * altura / 2;
         area_cuadrado =  Math.pow(lado_cuadrado, 2);//lado_cuadrado * lado_cuadrado;
         area_circulo = Math.PI * Math.pow (radio, 2);// PI * radio * radio;
         
        
    //4. Mostrar la salida de resultados.
         System.out.println("El area del triangulo es: " + area_triangulo);
         System.out.println("El area del cuadrado es: " + area_cuadrado);
         System.out.println("El area del circulo es: " + Math.round(area_circulo * 100.0)/100.0);
} 
}
    
