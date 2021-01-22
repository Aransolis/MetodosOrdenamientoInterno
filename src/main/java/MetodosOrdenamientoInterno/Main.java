/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosOrdenamientoInterno;

/**
 *
 * @author Aran Solis
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] b = {6, 1, 7, 4, 2, 5, 3};
//        System.out.println("Impresion del arreglo antes Burbuja");
//        imprimir(b);
//        burbuja(b);
//        System.out.println("Impresion del arreglo despues Burbuja");
//        imprimir(b);
        System.out.println("Impresion del arreglo antes Quicksort");
        imprimir(b);
        quicksort(b, 0, b.length - 1);
        System.out.println("Impresion del arreglo despues Quicksort");
        imprimir(b);


    }

    public static void imprimir(int[] a) {
        for (int i = 0; i < a.length; i++) { //IMPRIMO 
            System.out.print("[" + a[i] + "]");
        }
        System.out.println("\n");
    }

    public static void quicksort(int[] arreglo, int primero, int ultimo) {
        int i, j, pivote, auxiliar; //ASIGNAMOS VARIABLES
        i = primero;                // I LE ASIGNAMOS LA PRIMERA POSICION DEL ARREGLO
        j = ultimo;                 // J LE ASIGNAMOS LA ULTIMA POSICION DEL ARREGLO

        pivote = arreglo[(primero + ultimo) / 2];  //OBTENEMOS EL PIVOTE
        System.out.println("El pivote es " + pivote); //MOSTRAMOS EL PIVOTE
        do {
            while (arreglo[i] < pivote) {  //RECORREMOS EL ARREGLO, SIEMPRE QUE I SEA MENOR AL PIVOTE. 
                i++;                   // SI NO CUMPLE, SE SALE DEL CICLO Y CONTINUA CON LAS LINEAS
                // DE CODIGO
            }
            while (arreglo[j] > pivote) {  //RECORREMOS EL ARREGLO, SIEMPRE QUE J SEA MAYOR AL PIVOTE. 
                j--;                    // SI NO CUMPLE, SE SALE DEL CICLO Y CONTINUA CON LAS LINEAS

            }

            if (i <= j) {                   //  UNA VEZ OBTENIDO LOS VALORES EN I Y J QUE NO CUMPLEN
                auxiliar = arreglo[i];   // SE HACE EL INTERCAMBIO EN ESTE IF
                arreglo[i] = arreglo[j];
                arreglo[j] = auxiliar;
                i++;
                j--;
            }
            for (int m = 0; m < arreglo.length; m++) { //IMPRIMO 
                System.out.print("[" + arreglo[m] + "]");
            }
            System.out.println("\n");
            
        } while (i <= j);  // EL CICLO SE REPITE SIEMPRE QUE I SEA MENOR O IGUAL A J
        if (primero < j) {                      //QUIZAS LAS LINEAS MAS IMPORTANTES, HACEMOS USO DE LA RECURSIVIDAD
            quicksort(arreglo, primero, j); //PARA QUE LAS SUBLISTAS TAMBIEN ESTEN ORDENADAS.
        }
        if (i < ultimo) {
            quicksort(arreglo, i, ultimo);
        }

    }

    public static void burbuja(int[] A) {
        int tmp = 0;
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = 0; j < A.length - 1; j++) {
                if (A[j] > A[j + 1]) { //SI NUMERO ACTUAL > NUMERO SIGUIENTE
                    tmp = A[j]; // ASIGNO AL AUXILIAR tmp, EL NUMERO ACTUAL 
                    A[j] = A[j + 1]; //ASIGNO AL NUMERO (Ó POSICION) ACTUAL EL NUMERO SIGUIENTE
                    A[j + 1] = tmp; //AL NUMERO (Ó POSICION) SIGUIENTE LE ASIGNO tmp
                }   //DE ESTA MANERA SE LOGRA INVERTIR AMBOS VALORES DE POSICION
            }
        }
        
    }

}
