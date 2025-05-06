import java.util.Scanner;

import vistas.vista;
public class portafolio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        vistas.vista.saludar();
        

    do {
           

            System.out.println("+---------------------+");
            System.out.println("[1]. Suma de dos números");
            System.out.println("[2]. Resta de dos números");
            System.out.println("[3]. Multiplicación de dos números");
            System.out.println("[4]. División de dos números");
            System.out.println("[5]. Módulo (Residuo de una división)");
            System.out.println("[6]. promedio de tres números");
            System.out.println("[7].Número mayor y menor entre dos números");
            System.out.println("[8]. Número mayor y menor entre tres números");
            System.out.println("[9]. Conversión de metros a centímetros");
            System.out.println("[10]. Conversión de kilogramos a gramos");
            System.out.println(" [0]. Salir del programa ");
            System.out.print("[?]. Elige una opción:  ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el primer numero: ");
                    int num1 = scanner.nextInt();
                    System.out.print("Ingrese el segundo numero: ");
                    int num2 = scanner.nextInt();
                    int suma = num1 + num2;
                    System.out.println("La suma es: " + suma);
                    break;
                case 2:
                System.out.print("Ingrese el primer numero: ");
                int num3 = scanner.nextInt();
                System.out.print("Ingrese el segundo numero: ");
                int num4 = scanner.nextInt();
                int suma1 = num3 - num4;
                System.out.println("La suma es: " + suma1);
                    break;
                case 3:
                System.out.print("Ingrese el primer numero: ");
                int num5 = scanner.nextInt();
                System.out.print("Ingrese el segundo numero: ");
                int num6 = scanner.nextInt();
                int suma2 = num5 * num6;
                System.out.println("La suma es: " + suma2);
                    break;
                case 4:
                System.out.print("Ingrese el primer numero: ");
                int num7 = scanner.nextInt();
                System.out.print("Ingrese el segundo numero: ");
                int num8 = scanner.nextInt();
                int suma3 = num7 / num8;
                System.out.println("La suma es: " + suma3);
                    break;
                case 5:
                System.out.println("Número 1:  ");
                double número = scanner.nextDouble();
                System.out.println("Número 2:  ");
                double número1 = scanner.nextDouble();

                double respuesta = número % número1;
             
               
                System.out.println("Respuesta:  "+respuesta);
                
                
                break;
                    
                    case 6:
                    System.out.print("ingrese el primer número:  ");
                    double num9 = scanner.nextInt();
                    System.out.print("Ingrese el segundo numero: ");
                    double num10 = scanner.nextDouble();
                    System.out.print("Ingrese el tercer numero: ");
                    double num11 = scanner.nextDouble();

                    double resultado = (num9 + num10 + num11)/3;
                    System.out.println("Promedio:  "+resultado);

                    break;
                    case 7:
                    int[] numero = {1000,25};
                    int maximo = 0;
                    int minimo = 1000;
                   
                    
                    for (int i = 0; i < numero.length; i++) {
                        if (numero[i] > maximo) {
                            maximo = numero[i];
                        }
                        if (numero[i] < minimo) {
                            minimo = numero[i];
                        }
                        
                    }
                    System.out.println("numero mayor: " + maximo);
                    System.out.println("numero menor: " + minimo);
                    
                    break;
                    case 8:
                    int[] numero1 = {1000,25,10};
                    int maximo1 = 0;
                    int minimo1 = 1000;
                   
                    
                    for (int i = 0; i < numero1.length; i++) {
                        if (numero1[i] > maximo1) {
                            maximo1 = numero1[i];
                        }
                        if (numero1[i] < minimo1) {
                            minimo1 = numero1[i];
                        }
                        
                    }
                    System.out.println("numero mayor: " + maximo1);
                    System.out.println("numero menor: " + minimo1);
                    break;
                    case 9:
                    System.out.print("Metros: ");
                    int nume = scanner.nextInt();
                    double resultado2 = nume * 100;
                    System.out.println("A centimetros:  "+resultado2);

                    break;
                    case 10:
                    System.out.print("Kilogramos: ");
                    double numer = scanner.nextInt();
                    double resultado3 = numer * 1000;
                    System.out.println("A gramos:  "+resultado3);
                    break;
                    case 0:
                    System.out.println("Saliendo del programa............");
                    break;


                    default:
                    break;
            }
            
        }while (opcion != 0) ;
            
        
        
    }
}