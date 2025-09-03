//Proyecto 3 Alejandre Domínguez ALan José 7CV2
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
public class graficaBarras extends JFrame {

    private JPanel contentPane;
    private JLabel jlblNumero;
    private ArrayList<String> lectura;
    private Archivo a;
    private int noCiudadanos;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    graficaBarras frame = new graficaBarras();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public graficaBarras() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 600);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        a = new Archivo();
        a.crearArchivo();
        lectura = a.leer();
        noCiudadanos = lectura.size();
        JLabel jlblAnuncio = new JLabel("Total de ciudadanos: ");
        jlblAnuncio.setBounds(46, 420, 200, 14);
        contentPane.add(jlblAnuncio);

        jlblNumero = new JLabel(""+noCiudadanos);
        jlblNumero.setBounds(246, 420, 61, 14);
        contentPane.add(jlblNumero);

        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.scheduleAtFixedRate(() -> {
            repaint();
        },0, 3, TimeUnit.SECONDS);
    }
    
    
    public void paint(Graphics g)
    {
        super.paint(g);
            int preescolar=0,primaria=0,secundaria=0,preparatoria=0,universidad=0,maestria=0, doctorado=0, max;
            lectura = a.leer();
            noCiudadanos = lectura.size();
            jlblNumero.setText("");
            jlblNumero.setText(""+noCiudadanos);
            Iterator<String> iterador = lectura.iterator();
            while(iterador.hasNext()){
                String cadena = iterador.next();
                String subcadena = cadena.substring(30);
                switch (subcadena) {
                    case "PREESCOLAR":
                        preescolar++;
                        break;
                    case "PRIMARIA":
                        primaria++;
                        break;
                    case "SECUNDARIA":
                        secundaria++;
                        break;
                    case "PREPARATORIA":
                        preparatoria++;
                        break;
                    case "UNIVERSIDAD":
                        universidad++;
                        break;
                    case "MAESTRIA":
                        maestria++;
                        break;
                    case "DOCTORADO":
                        doctorado++;
                        break;
                    default:
                        break;
                }
            }
            max = mayor(preescolar, primaria, secundaria, preparatoria,universidad,maestria, doctorado);

            g.setColor(new Color(231,76,60));
            g.fillRect(150,50,preescolar*500/max,40);
            g.setColor(new Color(0,0,0));
            g.drawString("PREESCOLAR: "+preescolar, 20, 70);  

            g.setColor(new Color(142,68,173));
            g.fillRect(150,100,primaria*500/max,40);
            g.setColor(new Color(0,0,0));
            g.drawString("PRIMARIA: "+primaria, 20, 120);            

            g.setColor(new Color(52,152,219));
            g.fillRect(150,150,secundaria*500/max,40);
            g.setColor(new Color(0,0,0));
            g.drawString("SECUNDARIA: "+secundaria, 20, 170);            

            g.setColor(new Color(22,160,133));
            g.fillRect(150,200,preparatoria*500/max,40);
            g.setColor(new Color(0,0,0));
            g.drawString("PREPARATORIA: "+preparatoria, 20, 220); 

            g.setColor(new Color(241,196,15));
            g.fillRect(150,250,universidad*500/max,40);
            g.setColor(new Color(0,0,0));
            g.drawString("UNIVERSIDAD: "+universidad, 20, 270);            

            g.setColor(new Color(211,84,0));
            g.fillRect(150,300,maestria*500/max,40);
            g.setColor(new Color(0,0,0));
            g.drawString("MAESTRIA: "+maestria, 20, 320);            

            g.setColor(new Color(127,140,141));
            g.fillRect(150,350,doctorado*500/max,40);
            g.setColor(new Color(0,0,0));
            g.drawString("DOCTORADO: "+doctorado, 20, 370);            
    }
    
    private int mayor(int a,int b,int c,int d,int e,int f,int g)
    {   
        int mayor = a;
        if(b > mayor)
            mayor = b;
        if(c>mayor)
            mayor = c;
        if(d>mayor)
            mayor = d;
        if(e>mayor)
            mayor = e;
        if(f>mayor)
            mayor = f;
        if(g>mayor)
            mayor = g;
        return mayor;
    }
       
}
