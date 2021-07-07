
package testP;

  import dominioP.LeerArchivoBinario;
import java.util.Scanner;
public class PruebaLeerBinario {
    

    public static void main(String[] args) {
        Scanner datos=new Scanner(System.in);
        LeerArchivoBinario leer = new LeerArchivoBinario();
        
        System.out.println("Cuantas veces desea leer el archivo?: ");
        int t= 0 ;
        int aux=1;
        t=datos.nextInt();
        while (t<= aux) {
            aux++;
            leer.abrir();
            leer.leer();
            System.out.println("-----------------------------------");   
        }
        leer.cerrar();
    }
}

    

