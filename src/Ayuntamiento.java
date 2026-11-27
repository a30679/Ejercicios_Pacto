import java.util.Scanner;

public class Ayuntamiento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] sueldos = new double[1];

        sueldos = introducirSueldos(sueldos, sc);

        sueldos = ordenarMaxtoMin(sueldos);

        System.out.println("Los sueldos con los que vamos a trabajar son: ");
        for (int i = 0; i < sueldos.length; i++){
            System.out.print(sueldos [i] + "  ");
        }
        System.out.println();
        System.out.println("El sueldo máximo es: " + calcularMaximo(sueldos));
        System.out.println("El sueldo mínimo es: " + calcularMinimo(sueldos));
        System.out.println("La media de los sueldos es: " + calcularMedia(sueldos));
    }
    public static double [] introducirSueldos(double[] sueldos, Scanner sc){
        double sueldo;
        int contador = 0;
        System.out.println("Introduce el sueldo del encuestado (-1 para terminar)");
        sueldo = sc.nextDouble();

        while (sueldo != -1){
            if (contador == sueldos.length){
                sueldos = ampliarArray(sueldos);
            }
            sueldos [contador] = sueldo;
            contador ++;

            System.out.println("Introduce el sueldo del encuestado (-1 para terminar)");
            sueldo = sc.nextDouble();
        }
        return sueldos;
    }
    public static double [] ampliarArray(double[]sueldos){
        double[] nuevoArray = new double [sueldos.length +1];

        for (int i = 0; i < sueldos.length; i++) {
            nuevoArray[i] = sueldos[i];
        }
        return nuevoArray;
    }
    public static double [] ordenarMaxtoMin(double[] sueldos){
        double orden;

        for (int i = 0; i < sueldos.length; i++){
            for (int j = i +1; j < sueldos.length; j++){
                if (sueldos[j] > sueldos[i]){
                    orden = sueldos [i];
                    sueldos[i] = sueldos [j];
                    sueldos [j] = orden;
                }
            }
        }
        return sueldos;
    }
    public static double calcularMaximo (double [] sueldos){
        double maximo = sueldos [0];

        for (int i = 0; i < sueldos.length; i++){
            if (sueldos [i] > maximo) {
                maximo = sueldos [i];
            }
        }
        return maximo;
    }
    public static double calcularMinimo (double [] sueldos){
        double minimo = sueldos [0];

        for (int i = 0; i < sueldos.length; i++){
            if (sueldos [i] < minimo) {
                minimo = sueldos [i];
            }
        }
        return minimo;
    }

    public static double calcularMedia (double[] sueldos){
        double suma = 0;
        for (int i = 0; i < sueldos.length; i++){
            suma += sueldos[i];
        }
        double media = suma / sueldos.length;
        return media;
    }
}
