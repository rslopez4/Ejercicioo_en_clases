
package dominioP;



    import java.io.File;
public class MetodosFile {
    public void analizaMetodos(String ruta){
        File nombre = new File(ruta);
        if(nombre.exists()){
            System.out.println(nombre.getName()+" si existe");  
            if(nombre.isFile()){
                System.out.println("Es un archivo");
            }else if(nombre.isDirectory()){
                System.out.println("Es un Directorio");
            }
            if(nombre.isAbsolute()){
                System.out.println("Es una ruta absoluta");
            }else{
                System.out.println("Es una ruta relativa");
            }
            System.out.println("La ultima modificacion fue: "+nombre.lastModified());
            System.out.println("Tamaño del archivo : "+nombre.length());
            System.out.println("Su ruta es "+nombre.getPath());
            System.out.println("Su ruta absolunta es "+nombre.getAbsolutePath());
            if(nombre.isDirectory()){
                String[] directorio = nombre.list();
                System.out.println("El contenido del directori es ");
                for(String dir:directorio){
                    System.out.println(dir);
                }
            }
        } 
        else{
            System.out.println(ruta + "No existe");
     }
    }
}

    

