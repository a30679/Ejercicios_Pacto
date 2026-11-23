import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        do {
            System.out.println("Dime un número entero para calcular el cuadrado latino");
            n = sc.nextInt();
        } while (n <= 0);

        int[][] matriz = new int[n][n];

        mOriginal(matriz, 0, 0);


/*   comprobación de que funciona la primera función (mOriginal)
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
*/
        cuadradoLatino(matriz, 0, 0);
    }

    public static void mOriginal(int[][] matriz, int fila, int columna) {

        if (fila == matriz.length) {
            return;
        }

        matriz[fila][columna] = columna + 1;

        if (columna < matriz.length - 1) {
            mOriginal(matriz, fila, columna + 1);
        } else {
            mOriginal(matriz, fila + 1, 0);
        }
    }
    public static void cuadradoLatino(int[][] matriz, int fila, int columna){

        if (fila == matriz.length) {
            return;
        }
        int numero = columna - fila + 1;

        if (numero <= 0){
            numero = numero + matriz.length;
        }
        System.out.print(numero + " ");

        if (columna < matriz.length - 1) {
            cuadradoLatino(matriz, fila, columna + 1);
        } else {
            System.out.println();
            cuadradoLatino(matriz, fila + 1, 0);
        }
    }
}