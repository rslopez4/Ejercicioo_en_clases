
package testP;
import java.io.File;

public class FileDemo {


    File nombre = new File("D:\\PRACTICAS C++\\prueba2.cpp");
    public static void main(String[] args) {
        FileDemo ob1 = new FileDemo();
        if(ob1.nombre.exists()){
            System.out.println("El archivo se encuentra");
        }
        else{
            System.out.println("El archivo no se encuentra");
        }
      }
    
}
    
    

