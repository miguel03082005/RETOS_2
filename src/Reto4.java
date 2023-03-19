import java.util.Random;
import java.util.Scanner;

public class Reto4 {
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        int n,x,sumaFila,sumaColumna; 

        System.out.println("ingrese le tamaño del sudoku");
        n=leer.nextInt();
        
        x=9;

        int [][] sudoku=new int [n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Random generator = new Random();
                int a = generator.nextInt(x);
                
                sudoku[i][j]=a;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(sudoku [i][j]+"\t");
            }
            System.out.println(" ");
        }

        for (int i = 0; i < n; i++) {
            sumaFila = 0;
            sumaColumna = 0;
            for (int j = 0; j < n; j++) {

                sumaFila += sudoku[i][j];
                sumaColumna += sudoku[j][i];
            }

            System.out.println("La suma de la fila " + (i+1) + " es: " + sumaFila);
            System.out.println("La suma de la columna " + (i+1) + " es: " + sumaColumna);
        }
        leer.close();
    }
}
