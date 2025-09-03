//Proyecto 3 Alejandre Domínguez ALan José 7CV2
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Archivo {
            File a;
            FileWriter w;
            BufferedWriter bw;
            PrintWriter ea;
            FileReader fr;
            BufferedReader br;
    public void crearArchivo(){
        try {
            a = new File("Registros.txt");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error: " + e);
        }
    }

    public void escribir(String cadena) {

        try {
            w = new FileWriter(a, true);
            bw = new BufferedWriter(w);
            ea = new PrintWriter(bw);
            ea.append(cadena + "\n");
            ea.close();
            bw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error: " + e);
        }
    }
    public ArrayList<String> leer(){
        ArrayList<String> lectura = new ArrayList<>();
        try{
        fr = new FileReader(a);
        br = new BufferedReader(fr);
        String elemento;
        while ((elemento=br.readLine())!=null) {
            lectura.add(elemento);
        }
        return lectura;
        }
        catch (Exception e){
        JOptionPane.showMessageDialog(null, "Ha ocurrido un error: " + e);
            lectura.add("Error");
            return lectura;
        }
    }
}
