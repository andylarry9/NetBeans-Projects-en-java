/*
 * Click  to change this license
 * Click  edit this template
 */
package operaciones_numeros_mdpv02;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ana mancilla
 */
public class Operaciones_Numeros_MDPV02 {
  private static Scanner input;  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException  {
        // TODO code application logic here
        input = new Scanner(System.in); // permite definir el objeto input encargado de leer datos de consola
    
        /*Implementar un proyecto de consola en Java que permita:
            1. Calcular el area de un triangulo.
            2. Calcular el area de un cuadrado.
            3. Calcular el area de un circulo.
            y muestre en pantalla el area de las respectivas figuras.
        
        */
        
        //Esquema general de ejecucion de un algoritmo
        //1.Declaracion de las variables
              //Datos de entrada
              float base, altura; //triangulo
              float lado_cuadrado; //cuadrado
              float radio_circulo; //circulo
              int opc_menu;
              //Datos de salida
              double area_triangulo, area_cuadrado, area_circulo; 
                 
              //datos auxiliares
            // double PI = 3.1415;
            
            do
            {
                opc_menu = menuPrincipal();
                switch(opc_menu)
                {
                    
case 1:   
               
    //2. Entrada de los datos
         System.out.println("Digite los datos del Triangulo:");
         System.out.print("\t Ingrese la Base:");
         base = input.nextFloat(); //leer el dato de la base del triangulo
         System.out.print("\t Ingrese la Altura:");
         altura = input.nextFloat(); //leer el dato de altura del triangulo
         //3. Procesamiento de los datos
         area_triangulo = base * altura / 2;
         //4. Mostrar la salida de resultados.
         System.out.println("El area del triangulo es: " + area_triangulo);
                    break;
         
case 2:
           //2. Entrada de los datos
         System.out.println("Digite los datos del cuadrado:");
         System.out.print("\t Ingrese el Lado:");
         lado_cuadrado = input.nextFloat(); //leer el dato del lado del cuadrado
         //3. Procesamiento de los datos
          area_cuadrado =  Math.pow(lado_cuadrado, 2);//lado_cuadrado * lado_cuadrado;                      
         //4. Mostrar la salida de resultados.
         System.out.println("El area del cuadrado es: " + area_cuadrado);
          break;
                      
case 3:
           //2. Entrada de los datos
         System.out.println("Digite los datos del circulo:");
         System.out.print("\t Ingrese el Radio:");
         radio_circulo = input.nextFloat(); //leer el dato del radio del circulo
          //3. Procesamiento de los datos 
         area_circulo = Math.PI * Math.pow (radio_circulo, 2);// PI * radio * radio; 
         //4. Mostrar la salida de resultados.
         System.out.println("El area del circulo es: " + Math.round(area_circulo * 100.0)/100.0);
         break; 
                 
case 4:
         System.exit(0);//Cerrar la aplicacion Java.
                }
                System.in.read(); //pausa
            }while(true);
}
            
                public static int menuPrincipal() 
    {
        int opc;
        do
        {
        System.out.println("------------Menu Principal------------"); 
        System.out.println("\t 1. Calcular el area de un triangulo.");
        System.out.println("\t 2. Calcular el area de un cuadrado.");
        System.out.println("\t 3. Calcular el area de un circulo.");
        System.out.println("\t 4. Salir del programa.");
        System.out.print("Digite la opcion (1-4) deseada:");
        opc = input.nextInt(); 
        }while(opc < 1 || opc > 4);
        
        return opc;
    }
 public static double calcularAreaTriangulo(double p_base, double p_altura)                 
 {
double area;
 area = p_base * p_altura / 2;
return area;
 }
  public static double calcularAreaCuadrado(double p_lado)                 
 {
double area;
 area = Math.pow(p_lado, 2);
return area;
}
 public static double calcularAreaCirculo(double p_radio)                 
 {
double area;
 area = Math.PI * Math.pow(p_radio, 2) ;
return area;
    
 }
}

    

