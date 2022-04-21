

package copiartexto;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class CopiarTexto2 {

   
    public static void main(String[] args) {
        FileReader in = null;
        FileWriter out = null;
        int c;
        
        try{
            in = new FileReader("texto.txt");
            out = new FileWriter("Copiatexto.txt");
            
            while((c = in.read()) != -1){
                out.write(c);
            }
            
        } catch(IOException ex){
            System.err.println("No fue posible abrir alguno de los ficheros");
        }
        try{
            if(in!=null)
                in.close();
                out = null;
              if(out!=null)
                out.close();
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("Ejemplo de lectura y escritura de Bytes");
    }
    
}
