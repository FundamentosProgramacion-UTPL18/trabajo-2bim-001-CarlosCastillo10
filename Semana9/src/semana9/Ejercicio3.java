/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
/*
    Programa que permite calcular el promedio de varios estudiantez 

 */
package semana9;

/**
 *
 * @author Carlos
 */
public class Ejercicio3 {
    public static void main(String[] args){
            //Arreglos Globales
            double [ ] calificaciones_progr = {18,19,15,16,17,10};
            double [ ] calificaciones_bd = {10,12,13,20,17,20};
            double [ ] promedios = new double[6];
            //Variables globales
            double suma;        
            double promedio;
            int contador_estudiantes = 0;
            String cadena ;
            
            //Valor inicial de la variable cadena
            cadena = String.format("%-26s%-25s%-25s%s\n\n", "Estudiantes","Nota Programacion","Nota Base de Datos","Promedio");
            
            //Ciclo que permite llenar el arreglo 'promedios'
            for (int contador = 0; contador < calificaciones_progr.length; contador ++){
                       //Calculos
                       suma = calificaciones_progr[contador] + calificaciones_bd[contador];
                       promedio = suma / 2;
                       //Ingreso del promedio al arreglo 'promedios'
                       promedios[contador] = promedio;
            }
           //Ciclo que permite concantenar la variable 'cadena'  
           for (int contador = 0; contador < calificaciones_bd.length; contador ++){
                       contador_estudiantes = contador_estudiantes + 1;//Controla la cantidad de estudiantes
                       //Concatenacion final de la variable 'cadena'
                       cadena = String.format(("%s%s %-15d%-25.2f%-25.2f%.2f\n"),cadena,"Estudiante",contador_estudiantes,calificaciones_progr
                               [contador], calificaciones_bd[contador],promedios[contador] );
           }
           
           System.out.println(cadena); //Presentamos en pantalla lo que tiene la variable cadena.
                
    }
    
}
