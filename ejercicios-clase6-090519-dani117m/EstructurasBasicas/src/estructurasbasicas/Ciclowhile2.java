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
public class Ciclowhile2 {

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
      String opcion;
      boolean bandera = true;
      int contador = 1; 
      //
       mensajefinal = String.format("%s%s\n\n",mensajefinal,"Informe de la "
               + "cuidad de Loja:");
       
       mensajefinal = String.format("%s%s\n\n",mensajefinal,"Lista de personas"
               + ":");//"\n\nLista de peronas" tambien se puede colocar en la misma linea 
       
       
      //Se inicia el ciclo 
      while(bandera==true){ //una variable bandera donde esta es  True 
        //Ingrese una vez independiente de lo que pase y el DoWhile solo analisa el final 
    
      System.out.println("Ingrese su nombre");
      nombre = entrada.nextLine();
      System.out.println("Ingrese su Apellido");
      apellido = entrada.nextLine();
      System.out.println("Ingrese su Profecion");
      profesion = entrada.nextLine();
      mensajefinal = String.format("%sPersona%d: %s %s - %s\n",
                mensajefinal,contador, nombre, apellido, profesion);
      
        contador = contador+1;// como en spint el contador se le suma una por cada print para que llegue a 5  
        System.out.println("Digita s para seguir o n para salir ");
        opcion = entrada.nextLine();
        
        if(opcion.equals("s")){ //una opcion para salir del ciclo
            bandera = true;
        }else{
            bandera = false; // al ser false el ciclo se detendra 
        }
      }
    System.out.printf("%s", mensajefinal);  
    }
    
}
