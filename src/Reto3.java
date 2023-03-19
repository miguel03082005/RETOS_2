import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);

        String teclado[][] ={{"esc","f1","f2","f3","f4","f5","f6","f7","f8","f9","f10","f11","f12","ins","imp pnt","supr"},{"°|¬","1","2","3","4","5","6","7","8","9","0","?","¿","<-¬","","inicio"},{"tabulador","Q","W","E","R","T","Y","U","I","O","P","´","+","[}`","repág",""},{"bloq mayus","A","S","D","F","G","H","J","K","L","Ñ","[{^","enter","","avpag",""},{"shif","","Z","X","C","V","B","N","M",",;",".:","-_","","shif","","fin"},{"ctrl","fn","windows","-","-","barra","","espaciadora","-","-","alt gr","<>","<-","^","->",""},{"","","","","","","","","","","","","","","v","","",}};
        int filas=8;
        int colomnas=16;


        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < colomnas; j++) {
                System.out.print(teclado [i][j]+"\t");
            }
            System.out.println("");
        }
        leer.close();
    }
}
