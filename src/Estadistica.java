import java.util.Scanner;

public class Estadistica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] tablaOriginal = new int [1];

        tablaOriginal = introducirNumeros(tablaOriginal, sc);

        int[] tablaConIndices = crearTablaConIndices(tablaOriginal);

        System.out.println("Tabla original:");
        for (int i = 0; i < tablaOriginal.length; i++){
            System.out.print(tablaOriginal[i] + " ");
        }
        System.out.println();

        System.out.println("Tabla con índices");
        for (int i = 0; i < tablaConIndices.length; i++){
            System.out.print(tablaConIndices[i] + " ");
        }
    }
    public static int[] introducirNumeros(int[] tabla, Scanner sc){

        int numero;
        int contador = 0;

        System.out.println("Introduce otro número (-1 para finalizar)");
        numero = sc.nextInt();

        while (numero !=-1){
            if (contador == tabla.length){
                tabla = ampliarArray(tabla);
            }
            tabla[contador] = numero;
            contador ++;

            System.out.println("Introduce otro número (-1 para finalizar)");
            numero = sc.nextInt();
        }
        return tabla;
    }
    public static int[] ampliarArray(int[] tabla){

        int[] nuevoArray = new int[tabla.length + 1];

        for (int i = 0; i < tabla.length; i++){
            nuevoArray[i] = tabla[i];
        }
        return nuevoArray;
    }
    public static int []crearTablaConIndices(int[] tablaOriginal){

        int[] tablaConIndices = new int[tablaOriginal.length];

        for (int i = 0; i < tablaConIndices.length; i++){
            tablaConIndices[i]= i;
        }
        int orden;

        for (int i = 0; i < tablaConIndices.length -1; i++){
            for (int j = i +1; j < tablaConIndices.length; j++){
                if (tablaOriginal[tablaConIndices[i]] > tablaOriginal[tablaConIndices[j]]){
                    orden = tablaConIndices[i];
                    tablaConIndices[i] = tablaConIndices[j];
                    tablaConIndices[j]= orden;
                }
            }
        }
        return tablaConIndices;
    }
}
