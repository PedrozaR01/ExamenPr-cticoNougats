
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Equipo Nougat
 */
public class DatosAlumno {
    private Scanner Inpt = new Scanner(System.in);//Scanner para captura de datos
    private AluInf data = new AluInf();//Objeto para llamar a los métodos de la otra clase y modificar las variables privadas de dicha clase
    public void Inicio(){
    System.out.println("¡Bienvenido!");
        System.out.println("Introduce los datos que se te pidan, lee cuidadosamente cada instrucción.");
        
        System.out.println("Introduce tu nombre/s: ");
        data.setNombre(Inpt.nextLine());
        System.out.println("Intruduce tus apellidos: ");
        data.setApellido(Inpt.nextLine());
        System.out.println("Introduce tu género; ");
        data.setGender(Inpt.nextLine());
        System.out.println("Introduce tu dirección: ");
        data.setDireccion(Inpt.nextLine());
        System.out.println("Introduce tu E-mail: ");
        data.setEmail(Inpt.nextLine());
        System.out.println("¿Qué carrera estudias? ");
        data.setCarrera(Inpt.nextLine());
        System.out.println("¿En qué semestre de tu carrera vas? Usa carácteres alfabéticos por favor. ");
        data.setSemestre(Inpt.nextLine());
        System.out.println("Introduce el número de tu día de nacimiento: ");
        data.setDiaNa(Inpt.nextInt());
        System.out.println("Introduce el número de tu mes de nacimiento: ");
        data.setMesNa(Inpt.nextInt());
        System.out.println("Introduce el año de nacimiento: ");
        data.setAñoNa(Inpt.nextInt());
        System.out.println("¿Cuál es tu número de control?");
        data.setNCont(Inpt.nextInt());
        System.out.println("Introduce el número de tu casa: ");
        data.setNCasa(Inpt.nextInt()); 
        //A lo largo de esas líneas de código se utilizan los métodos set
        //De cada variable para así asignarles el valor capturado por 
        //El scanner
        
        System.out.println("Tu nombre completo es: " + data.getNombre() + " " + data.getApellido());
        System.out.println("Eres " + data.getGender());
        System.out.println("Tu dirección es " + data.getNCasa() + " " + data.getDireccion());
        System.out.println("Tu E-mail es " + data.getEmail());
        System.out.println("Tu fecha de nacimiento es " + data.getDiaNa() + " de " + data.getMesNa() + " del " + data.getAñoNa());
        System.out.println("Carrera: " + data.getCarrera());
        System.out.println("Semestre: " + data.getSemestre());
        System.out.println("Número de control: " + data.getNCont());
        //En esas líneas de código se llama al método get, p´racticamente sólo
        // devuelve el valor obtenido con el método set
    }
        
    }
class AluInf {
//En esta clase se tienen las variables, todas son privadas
    private String nombre;
    private String apellido;
    private String gender;
    private String direccion;
    private int NCasa;
    private String email;
    private int DiaNa;
    private int MesNa;
    private int AñoNa;
    private String Carrera;
    private String Semestre;
    private int NCont;
//En las siguentes líneas se encuentran pares de métodos get and set de cada variable
    //Los códigos se obtuvieron con la opción insert code de Source
    //Excepto por un método get
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNCasa() {
        return NCasa;
    }

    public void setNCasa(int NCasa) {
        this.NCasa = NCasa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDiaNa() {
        return DiaNa;
    }

    public void setDiaNa(int DiaNa) {
        this.DiaNa = DiaNa;
    }

    public String getMesNa() { //Este método utiliza el valor del set de la misma variable
        String Mes = null;     //Pero en base a esa valor y una estructura if else
        String Enero = ("Enero"); //se le asigna una variable String a otra variable string vacía
        String Febrero = ("Febrero"); //Hay 12 variables con un mes asignado
        String Marzo = ("Marzo"); //Y casa variable se le será asignada al string vacío
        String Abril = ("Abril");//En base al número del método set
        String Mayo = ("Mayo");//Una vez que se asigna un String al string vacío
        String Junio = ("Junio");//Se pone en Return el String con un nuevo
        String Julio = ("Julio");//Valor asignado para así regresar un mes en carácteres
        String Agosto = ("Agosto");//Dependiendo del número que se capturó
        String Septiembre = ("Septiembre");
        String Octubre = ("Octubre");
        String Noviembre = ("Noviembre");
        String Diciembre = ("Diciembre");
        if (MesNa == 1){
            Mes = Enero; }
            else { if(MesNa==2){
                Mes = Febrero;
            } else {
                if(MesNa==3){
                    Mes = Marzo;
                }
                else{
                    if(MesNa==4){
                        Mes = Abril;
                    }
                    else{
                        if(MesNa==5){
                            Mes = Mayo;
                        }
                        else{
                            if(MesNa==6){
                                Mes = Junio;
                            }
                            else{
                                if(MesNa==7){
                                    Mes = Julio;
                                }
                                else{
                                    if(MesNa==8){
                                        Mes = Agosto;
                                    }
                                    else{
                                        if(MesNa==9){
                                         Mes = Septiembre;   
                                        }
                                        else{
                                            if(MesNa==10){
                                                Mes = Octubre;
                                            }
                                            else{
                                                if(MesNa==11){
                                                    Mes = Noviembre;
                                                }
                                                else{
                                                    if(MesNa==12){
                                                        Mes = Diciembre;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
                    
                    } 
        
       return Mes;
        
    }

    public void setMesNa(int MesNa) {
        this.MesNa = MesNa;
    }

    public int getAñoNa() {
        return AñoNa;
    }

    public void setAñoNa(int AñoNa) {
        this.AñoNa = AñoNa;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public String getSemestre() {
        return Semestre;
    }

    public void setSemestre(String Semestre) {
        this.Semestre = Semestre;
    }

    public int getNCont() {
        return NCont;
    }

    public void setNCont(int NCont) {
        this.NCont = NCont;
    }
    
}
