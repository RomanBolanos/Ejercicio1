
package primerproyecto;

import java.util.Scanner;

public class EjemploSwitch {
    public static void main(String[] args) {
        int op;
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu Áreas");
        System.out.println("1. Rectangulo");
        System.out.println("2. triangulo");
        System.out.println("3. circulo");
        System.out.println("4. trapecio");
        System.out.println("5. salir");
        System.out.println("Seleccione una opción: ");
        op = sc.nextInt();
        
        switch(op){
            case 1:
                System.out.println("Opción área rectángulo");
                int lado1,lado2;
                System.out.print("Ingrese en valor de un lado: ");
                lado1=sc.nextInt();
                System.out.print("Ingrese en valor del otro lado: ");
                lado2=sc.nextInt();
                
                int area=lado1*lado2;
                System.out.println("El área del rectángulo es: "+area);
                break;
            case 2:
                System.out.println("Opción área triángulo");
                int longitud, altura;
                System.out.println("Ingrese la longitud de el triangulo");
                longitud = sc.nextInt();
                System.out.println("Ingrese el valor de la altura del triangulo");
               altura=sc.nextInt();
               
               int areaT = (longitud*altura)/2;
                System.out.println("el ara de el triangulo es: " + areaT);
                break;
            case 3:
                System.out.println("Opción área círculo");
                float radio;
                System.out.println("Ingrese el radio del circulo: ");
                radio = sc.nextFloat();
              
               float radioCuadrado = radio*radio;
                       
              float areaC = (float) Math.PI*radioCuadrado; 
                System.out.println("El area del circulo es: "+ areaC);
                      

                break;
            case 4:
                System.out.println("Opción área trapecio");
               
                break;
            case 5:
                System.out.println("Salida...");
                break;
            default:
                System.out.println("Opción equivocada!");
        }
       
    }
            
        }
           
    

