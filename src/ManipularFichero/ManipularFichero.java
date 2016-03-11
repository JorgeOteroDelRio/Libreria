package ManipularFichero;



import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ManipularFichero {
    public static void escribirLista(ArrayList l,String ruta){
        PrintWriter escritor=null;
        try {
            escritor = new PrintWriter(new File(ruta));
            for(int i=0;i<l.size();i++){
                escritor.write(l.get(i).toString()+"\n");
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }finally{
            escritor.close();
        }
    }
}
