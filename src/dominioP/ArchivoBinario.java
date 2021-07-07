
package dominioP;



    
    import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ArchivoBinario {
    private ObjectOutputStream salida;//objeto salida para la serializacion
    private FileOutputStream archivo;        
    public void abrir(){       
        try {
            archivo = new FileOutputStream("binario.ser",true);
            salida= new ObjectOutputStream(archivo);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArchivoBinario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ArchivoBinario.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    public void aniadir(){
        Persona per1;
        String nombre;int edad;double estatura;
        Scanner entrada = new Scanner(System.in);
        
            System.out.print("Nombre: ");
            nombre = entrada.nextLine();
            System.out.print("Edad: ");
            edad = entrada.nextInt();
            System.out.print("Estatura: ");
            estatura = entrada.nextDouble();
            //creamos el objeto
            per1 = new Persona(nombre,edad,estatura);
            try {
                salida.writeObject(per1);
            } catch (IOException ex) {
                Logger.getLogger(ArchivoBinario.class.getName()).log(Level.SEVERE, null, ex);
            }
       
    }
    public void cerrar(){
        if(salida !=null){
            try {
                salida.close();
            } catch (IOException ex) {
                Logger.getLogger(ArchivoBinario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

   
}

    
