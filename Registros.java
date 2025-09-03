//Proyecto 3 Alejandre Domínguez ALan José 7CV2
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Registros {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        Archivo a = new Archivo();
        a.crearArchivo();
        while (true) {
            try {

                for (int i = 0; i < num; i++) {
                    generarCadena(a);
                }
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }
    }

    static void generarCadena(Archivo a) {
        String Letra = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Numero = "0123456789";
        String Sexo = "HM";
        String Entidad[] = { "AS", "BC", "BS", "CC", "CS", "CH", "CL", "CM", "DF", "DG", "GT", "GR", "HG", "JC", "MC",
                "MN", "MS", "NT", "NL", "OC", "PL", "QT", "QR", "SP", "SL", "SR", "TC", "TL", "TS", "VZ", "YN", "ZS" };
        String Nivel[] = { "PREESCOLAR", "PRIMARIA", "SECUNDARIA", "PREPARATORIA", "UNIVERSIDAD", "MAESTRIA",
                "DOCTORADO" };
        int indice;
        Random rand = new Random();
        StringBuilder sb = new StringBuilder(42);
        sb.append(Numero.charAt(5));
        indice = rand.nextInt(2) + 5;
        ;
        sb.append(Numero.charAt(indice));
        for (int i = 0; i < 8; i++) {
            indice = (int) (Numero.length() * Math.random());
            sb.append(Numero.charAt(indice));
        }
        sb.append('|');
        for (int i = 1; i < 5; i++) {
            indice = (int) (Letra.length() * Math.random());
            sb.append(Letra.charAt(indice));
        }
        for (int i = 5; i < 11; i++) {
            indice = (int) (Numero.length() * Math.random());
            sb.append(Numero.charAt(indice));
            if(i==9){
                if(indice==0){
                    sb.append(""+rand.nextInt(6));
                    i = 11;
                }

            }
        }
        indice = (int) (Sexo.length() * Math.random());
        sb.append(Sexo.charAt(indice));
        sb.append(Entidad[(int) (Math.random() * 32)]);
        for (int i = 14; i < 17; i++) {
            indice = (int) (Letra.length() * Math.random());
            sb.append(Letra.charAt(indice));
        }
        for (int i = 17; i < 19; i++) {
            indice = (int) (Numero.length() * Math.random());
            sb.append(Numero.charAt(indice));
        }
        sb.append('|');
        sb.append(Nivel[(int) (Math.random() * 7)]);
        System.out.println(sb);
        String cadena;
        cadena = sb.toString();
        a.escribir(cadena);
    }
}
