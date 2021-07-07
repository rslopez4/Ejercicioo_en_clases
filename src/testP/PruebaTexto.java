
package testP;

    import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PruebaTexto {
    
    public static void main(String[] args)  {
        String cadena;
        Scanner datos = new Scanner(System.in);
        FileWriter archivo= null;
        PrintWriter salida= null;
        try {
            archivo = new FileWriter("D:\\archivos de texto en java\\texto.txt");
//            archivo = new FileWriter("prueba.txt",true);
            salida = new PrintWriter(archivo);
            System.out.println("Ingrese una cadena o salir para terminar");
            cadena = datos.nextLine();
            while(!cadena.equals("salir")){
                salida.println(cadena);
                cadena = datos.nextLine();
            }
            salida.flush();//graba el texto en el archivo
        } catch (IOException ex) {
            System.out.println("No se puede acceder");
           // Logger.getLogger(PruebaTexto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
    
    

