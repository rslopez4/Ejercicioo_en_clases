
package dominioP;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LeerArchivoBinario {
    
    ObjectInputStream entrada;
    FileInputStream archivo;

    public void abrir() {
        try {
            archivo = new FileInputStream("binario.ser");
            entrada = new ObjectInputStream(archivo);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LeerArchivoBinario.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error no existe archivo");
        } catch (IOException ex) {
            Logger.getLogger(LeerArchivoBinario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void leer() {

        Persona per = null;
        String nombre;
        int edad;
        double estatura;

        try {

            per = (Persona) entrada.readObject();
            nombre = per.getNombre();
            edad = per.getEdad();
            estatura = per.getEstatura();
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
            System.out.println("Estatura: " + estatura);


        } catch (IOException ex) {
            Logger.getLogger(LeerArchivoBinario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LeerArchivoBinario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void cerrar() {
        if (entrada != null) {
            try {
                entrada.close();
            } catch (IOException ex) {
                Logger.getLogger(LeerArchivoBinario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void aniadir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    

