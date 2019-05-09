/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejosswitch;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class UsoSwitch5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        // variables 
        String nombre;
        
        //ingrese de valores 
        System.out.print("Ingrese datos de la placa");
        nombre = entrada.nextLine();
        
        char valor = nombre.charAt(0);// siempre empieza en posicion 0   
        switch(valor){
            case 'E':
            case'e':
                System.out.printf("Su placa pertenece a la costa: %s de %s\n", 
                        valor, nombre.toUpperCase());
                break;
            case 'M':
            case 'm':
                System.out.printf("Nombre con inicial %s de %s\n", 
                        valor, nombre.toLowerCase());
                break;
                
            case 'J':
            case 'j':
                System.out.printf("Nombre con inicial %s de %s\n", 
                        valor, nombre.toLowerCase());
                break;
                
            case 'R':
            case 'r':
                System.out.printf("Nombre con inicial %s de %s\n", 
                        valor, nombre.toLowerCase());
                break; 
            case 'Y':
            case 'y':
                System.out.printf("Nombre con inicial %s de %s\n", 
                        valor, nombre.toLowerCase());
                break;
            case 'O':
            case 'o':
                System.out.printf("Nombre con inicial %s de %s\n", 
                        valor, nombre.toLowerCase());
                break; 
            case 'G':
            case 'g':
                System.out.printf("Nombre con inicial %s de %s\n", 
                        valor, nombre.toLowerCase());
                break;     
            default:
                System.out.println("ninguna de las anteriores");
                
        }
        
    }
}
