/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasbasicas;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class EstructurasBasicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // declaramos una varible
      String mensajefinal = ""; 
      String nombre;
      String apellido ;
      String profesion ;
      int contador = 1; 
      //
       mensajefinal = String.format("%s%s\n\n",mensajefinal,"Informe de la "
               + "cuidad de Loja:");
       
       mensajefinal = String.format("%s%s\n\n",mensajefinal,"Lista de personas"
               + ":");//"\n\nLista de peronas" tambien se puede colocar en la misma linea 
       
       
      //Se inicia el ciclo 
      while(contador<5){ //Ingrese una vez independiente de lo que pase y el DoWhile solo analisa el final 
      //System.out.printf("Persona %d; %s %s - %s\n", contador, nombre, apellido, profesion);
      System.out.println("Ingrese su nombre");
      nombre = entrada.nextLine();
      System.out.println("Ingrese su Apellido");
      apellido = entrada.nextLine();
      System.out.println("Ingrese su Profecion");
      profesion = entrada.nextLine();
      mensajefinal = String.format("%sPersona%d: %s %s - %s\n",
              
              mensajefinal,contador, nombre, apellido, profesion);
        contador = contador+1;// como en spint el contador se le suma una por cada print para que llegue a 5    
      }
    System.out.printf("%s", mensajefinal);  
    }
    
}
