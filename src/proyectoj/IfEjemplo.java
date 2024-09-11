/* 
se pide una calificacion entre 0 y 5 y el programa debe devolver:
mensaje de error: si la nota no esta en el rango requerido
insuficiente: si la nota es mayor que cero y menor que 3
suficiente: la nota esta entre 3 y 4
superior: si la nota es superior a 4 
*/
package primerproyecto;

import java.util.Scanner;
public class IfEjemplo {
    public static void main(String[] args) {
        
        float nota;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su calificación: ");
        nota = sc.nextFloat();
        
        if (nota<0){
            System.out.println("Error, no procesa notas negativas.");
        }
        else if (nota<3){
            System.out.println("Nota insuficiente");
        }
        else if (nota<=4)
            System.out.println("Nota suficiente");
        else if (nota<=5)
            System.out.println("Nota superior");
        else 
            System.out.println("Error su nota es mayor a 5");
            
        
    }
    
}
