//Proyecto 3 Alejandre Domínguez ALan José 7CV2
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
public class interfazTexto{
    static private Archivo a;
    public static void main(String[] args){
        menu();
    }

    static void menu(){
        int opc;
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\t\t***Portal INEGI***\n");
        do{
            System.out.println("1.-Numero total de SMS que se han enviado por sexo\n");
            System.out.println("2.-Numero total de SMS que se han enviado por entidad federativa\n");
            System.out.println("3.-Numero de ciudadanos que tienen cierto nivel de estudios incluyendo sexo\n");
            System.out.println("4.-Edad promedio de los ciudadanos que han concluido un cierto nivel de estudios\n");
            System.out.println("5.-Salir\n");
            System.out.println("Ingrese una opcion (solo el numero): ");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    opcion1();
                    break;

                case 2:
                    opcion2();
                    break;
                    
                case 3:
                    opcion3();
                    break;
                    
                case 4:
                    opcion4();
                    break;
                    
                case 5:
                    opcion5();
                    break;    
            
                default: System.out.println("Opcion no valida :(");
                    break;
            }
        }while(opc!=5);
    }
    static void opcion1(){
        int h=0, m=0;
        int noCiudadanos;
        a = new Archivo();
        a.crearArchivo();
        System.out.printf("\n\n");
        ArrayList<String> lectura =  new ArrayList<>();
        lectura = a.leer();
        Iterator<String> iterador = lectura.iterator();
        while (iterador.hasNext()) {
            String cadena = iterador.next();
            char sexo = cadena.charAt(21);
            if(sexo == 'H')
                h++;
            else
                m++;
        }
        noCiudadanos = lectura.size();
        System.out.println("Registros de Hombres: "+h);
        System.out.println("Registros de Mujeres: "+m);
        System.out.printf("\n\n");
    }
    static void opcion2(){
        int as=0,bc=0,bs=0,cc=0,cs=0,ch=0,cl=0,cm=0,df=0,dg=0,gt=0,gr=0,hg=0,jc=0,mc=0,mn=0,ms=0,nt=0,nl=0,oc=0,pl=0,qt=0,qr=0,sp=0,sl=0,sr=0,tc=0,tl=0,ts=0,vz=0,yn=0,zs=0;
        a = new Archivo();
        a.crearArchivo();
        System.out.printf("\n\n");
        ArrayList<String> lectura =  new ArrayList<>();
        lectura = a.leer();
        Iterator<String> iterador = lectura.iterator();
        while (iterador.hasNext()) {
            String cadena = iterador.next();
            String entidadF = cadena.substring(22,24);
            switch (entidadF) {
                case "AS":
                    as++;
                    break;
                case "BC":
                    bc++;
                    break;
                case "BS":
                    bs++;
                    break;
                case "CC":
                    cc++;
                    break;
                case "CS":
                    cs++;
                    break;
                case "CH":
                    ch++;
                    break;
                case "CL":
                    cl++;
                    break;
                case "CM":
                    cm++;
                    break;
                case "DF":
                    df++;
                    break; 
                case "DG":
                    dg++;
                    break;
                case "GT":
                    gt++;
                    break;
                case "GR":
                    gr++;
                    break;
                case "HG":
                    hg++;
                    break;
                case "JC":
                    jc++;
                    break;
                case "MC":
                    mc++;
                    break;
                case "MN":
                    mn++;
                    break;
                case "MS":
                    ms++;
                    break;
                case "NT":
                    nt++;
                    break;
                case "NL":
                    nl++;
                    break;
                case "OC":
                    oc++;
                    break;
                case "PL":
                    pl++;
                    break;
                case "QT":
                    qt++;
                    break;
                case "QR":
                    qr++;
                    break;
                case "SP":
                    sp++;
                    break;
                case "SL":
                    sl++;
                    break;
                case "SR":
                    sr++;
                    break;
                case "TC":
                    tc++;
                    break;
                case "TL":
                    tl++;
                    break;
                case "TS":
                    ts++;
                    break;
                case "VZ":
                    vz++;
                    break;
                case "YN":
                    yn++;
                    break;
                case "ZS":
                    zs++;
                    break;
                default:
                    break;
            }
        }
        System.out.println("Registros de Aguascalientes: "+as);
        System.out.println("Registros de Baja California: "+bc);
        System.out.println("Registros de Baja California Sur: "+bs);
        System.out.println("Registros de Campeche: "+cc);
        System.out.println("Registros de Chiapas: "+cs);
        System.out.println("Registros de Chihuahua: "+ch);
        System.out.println("Registros de Coahuila: "+cl);
        System.out.println("Registros de Colima: "+cm);
        System.out.println("Registros de Ciudad de Mexico: "+df);
        System.out.println("Registros de Durango: "+dg);
        System.out.println("Registros de Guanajuato: "+gt);
        System.out.println("Registros de Guerrero: "+gr);
        System.out.println("Registros de Hidalgo: "+hg);
        System.out.println("Registros de Jalisco: "+jc);
        System.out.println("Registros de Estado de Mexico: "+mc);
        System.out.println("Registros de Michoacan: "+mn);
        System.out.println("Registros de Morelos: "+ms);
        System.out.println("Registros de Nayarit: "+nt);
        System.out.println("Registros de Nuevo Leon: "+nl);
        System.out.println("Registros de Oaxaca: "+oc);
        System.out.println("Registros de Puebla: "+pl);
        System.out.println("Registros de Queretaro: "+qt);
        System.out.println("Registros de Quintana Roo: "+qr);
        System.out.println("Registros de San Luis Potosi: "+sp);
        System.out.println("Registros de Sinaloa: "+sl);
        System.out.println("Registros de Sonora: "+sr);
        System.out.println("Registros de Tabasco: "+tc);
        System.out.println("Registros de Tlaxcala: "+tl);
        System.out.println("Registros de Tamaulipas: "+ts);
        System.out.println("Registros de Veracruz: "+vz);
        System.out.println("Registros de Yucatan: "+yn);
        System.out.println("Registros de Zacatecas: "+zs);
        System.out.printf("\n\n");

    }
    static void opcion3(){
        int preH=0,preM=0,priH=0,priM=0,secH=0,secM=0,prepH=0,prepM=0,uniH=0,uniM=0,maH=0,maM=0,docH=0,docM=0;
        a = new Archivo();
        a.crearArchivo();
        System.out.printf("\n\n");
        ArrayList<String> lectura =  new ArrayList<>();
        lectura = a.leer();
        Iterator<String> iterador = lectura.iterator();
        while (iterador.hasNext()) {
            String cadena = iterador.next();
            String nivel =cadena.substring(30);
            char sexo = cadena.charAt(21);
            switch (nivel) {
                case "PREESCOLAR":
                    if(sexo=='H')
                        preH++;
                    else
                        preM++;
                    break;
                case "PRIMARIA":
                    if(sexo=='H')
                        priH++;
                    else
                        priM++;
                    break;
                case "SECUNDARIA":
                    if(sexo=='H')
                        secH++;
                    else
                        secM++;
                    break;
                case "PREPARATORIA":
                    if(sexo=='H')
                        prepH++;
                    else
                        prepM++;
                    break;
                case "UNIVERSIDAD":
                    if(sexo=='H')
                        uniH++;
                    else
                        uniM++;
                    break;
                case "MAESTRIA":
                    if(sexo=='H')
                        maH++;
                    else
                        maM++;
                    break;
                case "DOCTORADO":
                    if(sexo=='H')
                        docH++;
                    else
                        docM++;
                    break;
                default:
                    break;
            }
        }
        System.out.println("Registros de Hombres con PREESCOLAR: "+preH);
        System.out.println("Registros de Mujeres con PREESCOLAR: "+preM);
        System.out.println("Registros de Hombres con PRIMARIA: "+priH);
        System.out.println("Registros de Mujeres con PRIMARIA: "+priM);
        System.out.println("Registros de Hombres con SECUNDARIA: "+secH);
        System.out.println("Registros de Mujeres con SECUNDARIA: "+secM);
        System.out.println("Registros de Hombres con PREPARATORIA: "+prepH);
        System.out.println("Registros de Mujeres con PREPARATORIA: "+prepM);
        System.out.println("Registros de Hombres con UNIVERSIDAD: "+uniH);
        System.out.println("Registros de Mujeres con UNIVERSIDAD: "+uniM);
        System.out.println("Registros de Hombres con MAESTRIA: "+maH);
        System.out.println("Registros de Mujeres con MAESTRIA: "+maM);
        System.out.println("Registros de Hombres con DOCTORADO: "+docH);
        System.out.println("Registros de Mujeres con DOCTORADO: "+docM);
        System.out.printf("\n\n");

    }
    static void opcion4(){
        float epre=0, epri=0, esec=0,eprep=0, euni=0, ema=0, edoc=0;
        int year, edad, c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0;
        System.out.printf("\n\n");
        a = new Archivo();
        a.crearArchivo();
        ArrayList<String> lectura = new ArrayList<>();
        lectura = a.leer();
        Iterator<String> iterador =  lectura.iterator();
        while (iterador.hasNext()) {
            String cadena = iterador.next();
            String nivel = cadena.substring(30);
            year = Integer.parseInt(cadena.substring(19,21));
            if(year<6){
                edad = 2023-(2000+year);
            }else{
                edad = 2023-(1900+year);
            }
            switch (nivel) {
                case "PREESCOLAR":
                    epre = epre + edad;
                    c1++;
                    break;
                case "PRIMARIA":
                    epri = epri + edad;
                    c2++;
                    break;
                case "SECUNDARIA":
                    esec = esec + edad;
                    c3++;
                    break;
                case "PREPARATORIA":
                    eprep = eprep + edad;
                    c4++;
                    break;
                case "UNIVERSIDAD":
                    euni = euni + edad;
                    c5++;
                    break;
                case "MAESTRIA":
                    ema = ema+edad;
                    c6++;
                    break;
                case "DOCTORADO":
                    edoc = edoc+edad;
                    c7++;
                    break;
                default:
                    break;
            }
        }
        epre = epre/c1;
        epri = epri/c2;
        esec = esec/c3;
        eprep = eprep/c4;
        euni = euni/c5;
        ema = ema/c6;
        edoc = edoc/c7;
        System.out.printf("Promedio de edad para PREESCOLAR: %.2f\n",epre);
        System.out.printf("Promedio de edad para PRIMARIA: %.2f\n",epri);
        System.out.printf("Promedio de edad para SECUNDARIA: %.2f\n",esec);
        System.out.printf("Promedio de edad para PREPARATORIA: %.2f\n",eprep);
        System.out.printf("Promedio de edad para UNIVERSIDAD: %.2f\n",euni);
        System.out.printf("Promedio de edad para MAESTRIA: %.2f\n",ema);
        System.out.printf("Promedio de edad para DOCTORADO: %.2f\n",edoc);
        System.out.printf("\n\n");

    }
    static void opcion5(){
        System.exit(0);
    }
}
