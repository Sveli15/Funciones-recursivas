package funciones.recursivas.dos;

import java.util.Arrays;

public class FuncionesRecursivasDos {
    public static void main(String[] args) {
       
        //*PRUEBAS 
        int fib = fibonacci(8);
        System.out.println(fib);

        int lol = MCD(18, 12);
        System.out.println("MCD: "+lol);
        
        Object datos[] = {5, 2, 5, 8, 5, 9};
        int resultado = count(datos, datos.length, 5);
        System.out.println("El numero aparece: " + resultado + " veces");
        
        Object datoss[] = {1, 2, 3, 4, 5};
        //*de la lista datos, inicio es en posicion 0 y fin mira cuantos datos hay en la lista
        //* y le resta una posicion para contarlo como debe ser en las posiciones de 0 a infinito dependiendo
        reverse(datoss, 0, datoss.length - 1);
        System.out.println(Arrays.toString(datoss));
        
        //*PETICIONES DEL EJERCICIO
        
        int fibb = fibonacci(5);
        System.out.println(fibb);
        
        int fibbb = fibonacci(40);
        System.out.println(fibbb);
        
        //*MAXIIMO COMUN DIVISOR
        int jij = MCD(45, 75);
        System.out.println("MCD: "+jij);
        
        int ou = MCD(47, 91);
        System.out.println("MCD: "+ou);
        
        //*numero de vecees que se repite los numeros
        
        Object datos1[] = {1, 2, 3, 3, 2, 1};
        int res = count(datos1, datos1.length, 3);
        System.out.println("El numero aparece: " + res + " veces");
        
        Object datos2[] = {1, 2, 3, 3, 2, 1};
        int ress = count(datos2, datos2.length, 1);
        System.out.println("El numero aparece: " + ress + " veces");
        
        Object datos3[] = {"A","B","C","B","A","B","D"};
        int letras = count(datos3, datos3.length, "C");
        System.out.println("la letra aparece: " + letras + " veces");
        
        Object datos4[] = {"A","B","C","B","A","B","D"};
        int letrass = count(datos4, datos4.length, "E");
        System.out.println("la letra aparece: " + letrass + " veces");
        
        //*INVERTIR ARREGLO
        
        Object datoss1[] = {1, 2, 3, 4, 5};
        reverse(datoss1, 0, datoss1.length - 1);
        System.out.println(Arrays.toString(datoss1));
        
        Object datoss2[] = {"A","B","C","D"};
        reverse(datoss2, 0, datoss2.length - 1);
        System.out.println(Arrays.toString(datoss2));
        
    }
    
     public static int fibonacci(int n){
            
           if(n == 0){
               return 0;
           }
           if(n == 1){
           return 1;
           }
           return fibonacci(n -1) + fibonacci(n -2);
        }
     
     //* MAXIMO COMUN DIVISOR
     
     public static int MCD(int a, int b){
           
    System.out.println("a = " + a + " | b = " + b);

    if (b == 0) {
        return a;
    }

    //* % simbolo -> para obtener el residuo de la division
    return MCD(b, a % b);
     }
     
     public static int count(Object datos[], int n, Object o){
         
        if(n == 0){
            return 0;
        }
        
        if(datos[n-1].equals(o)){
            //*Recorre la lista de los datos para ver si o se repite
            //*si si es igual a el num o entonces suma 1
            
            return 1 + count(datos, n-1,o);
            
        }
        
         return count(datos, n-1,o); 
         
     }
     
     public static void reverse(Object datoss[],int inicio, int fin){
             
           if (inicio >= fin) {
               return;
           }
           
          //*guardar en por mientras el primero num de la lista 
          //*lista [1,2,3,4,5]
         Object pormientras = datoss[inicio];
         //*ahora intercambiar, el numero que esta primerito se cambia por el del final
         datoss[inicio] = datoss[fin];
         //*el numerito q ahora esta al final se cambia por el que habiamos guardado antes
         datoss[fin] = pormientras;
         //* :D inicio + 1 avanza al siguiente num
         //*lista [5,2,3,4,1]
         reverse(datoss, inicio + 1, fin - 1);
         //*lista [5,4,3,2,1]
         //*EN LA ULTIMA Inicio es igual a fin 3 == 3 entonces ahi ya termina
         
         
     }

}
