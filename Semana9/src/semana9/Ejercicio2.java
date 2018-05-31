/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana9;

/**
 *
 * @author Carlos
 */
public class Ejercicio2 {
    public static void main(String[] args){
        
            int [ ] arreglo = {1,2,3,4,5,6,7};
            int multiplicacion;
            
            for (int contador = 0; contador < arreglo.length; contador ++){
                       if (arreglo[contador] % 2 == 0){
                                   System.out.printf("\n\n%s %d %s\n","La tabla de multiplicar del numero",arreglo[contador],"es:");
                                   for (int tabla = 1; tabla <=12; tabla++){
                                            multiplicacion = arreglo[contador] * tabla;    
                                            System.out.printf("%d %s %d %s %d\n",arreglo[contador],"*",tabla,"=",multiplicacion);
                                   }
                       }
            }

    }

}
