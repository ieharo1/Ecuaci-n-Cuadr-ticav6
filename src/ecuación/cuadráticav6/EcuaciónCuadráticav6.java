/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecuación.cuadráticav6;
import libreriacomun.EcuaciónCuadráticaJar;
import java.util.Scanner;

/**
 *
 * @author Scrappy Doo Coco
 */
public class EcuaciónCuadráticav6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        while(true){
            int a,b,c;
            Scanner sc= new Scanner(System.in);
            System.out.println("Ingrese su Ecuación Cuadrática ax^2+bx+c");
            System.out.println("Ingrese a");
            a=sc.nextInt();
            System.out.println("Ingrese b");
            b=sc.nextInt();
            System.out.println("Ingrese c");
            c=sc.nextInt();
            EcuaciónCuadráticaJar ec= new EcuaciónCuadráticaJar();
            ec.setEcuaciónCuadráticaJar(a, b, c);
            System.out.println("X1= "+ec.x1(ec.Raiz(a, b, c), a, b));
            System.out.println("X2= " +ec.x2(ec.Raiz(a, b, c), a, b));
            if(Math.pow(b, 2)-(4*a*c)<0){
            System.out.println("Su raíz es imaginaria, FIN DEL PROGRAMA, compile nuevamente para hacer");
            break;
            }
        }
    }
    
}
