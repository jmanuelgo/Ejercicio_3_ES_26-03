//hacer una multiplicacion por sumas sucesivas
import java.util.Scanner;
public class Sumasuma {
    public static void main (String [] args){
        Scanner read = new Scanner (System.in);
        int a,b,i=0,r = 0;
        System.out.println("Ingrese el numero a");
        a=read.nextInt();
        System.out.println("Ingrese el numero b");
        b=read.nextInt();
        while (i < b){
            r=r+a;
            i++;
        }
        System.out.println("El resultado es: "+r);

    }
}
