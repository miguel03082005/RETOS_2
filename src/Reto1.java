import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        
        int n;
        double total,promedio;

        System.out.print("Ingrese la cantidad de notas: ");
        n = leer.nextInt();

        double[] notas = new double[n];
        total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la nota numero " + (i+1) + ": ");
            notas[i] = leer.nextDouble();
            total += notas[i];
        }

        promedio = total / n;
        System.out.println("El promedio de notas es: " + promedio);
        
        if (promedio <= 3) {
            System.out.println("el estudiente a reprobado");
        } else if (promedio >= 3.1 && promedio <= 4){
            System.out.println("el estudiante a aprovado raspando");
        } else if (promedio >= 4.1 && promedio <= 5) {
            System.out.println("el estudiante a aprovado con buena calificacion");
        }

      leer.close();


    }
}
