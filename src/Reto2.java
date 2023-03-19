import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args) {

        int competidores = 10;
        double distancia = 200;

        Scanner competencia_n = new Scanner(System.in);

        String nom_competidores[] = new String [competidores];
        String ape_competidores[] = new String [competidores];
        String nacionalidad[] = new String [competidores];
        int puesto[] = new int [competidores];
        int puntos[] = new int [competidores];
        double tiempo_obtenido[] = new double [competidores];
        


        System.out.println("COMPETICION DE NATACION");
        System.out.println("ingresa la distancia que nadaran los participantes (las distancias son de 50,100,200 y 400 escribe de cuantos metros es)");
        distancia=competencia_n.nextDouble();

        System.out.println("participara la cantidad de " + competidores + " nadadores");
        for (int i = 1; i <competidores; i++) {

            System.out.println("esta es la clasificacion de los 10 nadadores");
            System.out.println("Ingrese el puesto del 1 al 10 de clasificacion");
            puesto[i] = competencia_n.nextInt(11);

            System.out.println("Ingresa el primer nombre del nadador");
            nom_competidores[i] = competencia_n.next();

            System.out.println("Ingresa el primer apellido del nadador");
            ape_competidores[i] = competencia_n.next();

            System.out.println("ingresa la nacionalidad del nadador");
            nacionalidad[i] = competencia_n.next();

            System.out.println("Ingresa el tiempo que recorrio el participante");
            tiempo_obtenido[i] = competencia_n.nextDouble();

            System.out.println("Ingrese la cantidad de puntos que obtuvo el participante: ");
            puntos[i] = competencia_n.nextInt();

            
        } for (int i = 0; i <competidores; i++) {
            
            System.out.println("puesto de clasificacion "+ puesto[i] + " : " + nom_competidores[i] + " " + ape_competidores[i]);
            System.out.println("de nacionalidad " + nacionalidad[i] + " realizo un tiempo de " + tiempo_obtenido[i] + " minutos");
            System.out.println("la distancia que nadaron los participantes es de "+distancia);
            System.out.println("Puntos obtenidos de la Modalidad: " + puntos[i]);

        }
        competencia_n.close();
    }
}
