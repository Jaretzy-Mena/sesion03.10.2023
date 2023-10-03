import java.util.Scanner;

public class App {
    static Scanner lector=new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        //Metodos
        //Que no requieren datos de entrada pero no devuelven datos de salida
        //Que no requieren datos de entrada pero devuelven datos de salida
        //Requiere datos de entrada pero no devuelve datos de salida
        //Requiere datos de entrada y devuelve datos de salida
        //-----------------------------------
        //Metodos sobrecargados (sobrecarga de metodos)
        //Conciste en reutilizar el nombre de un metodo pero con distintas listas
        //De parametros de entrada
        MostrarHora();
        MostrarHora(2, 15, 36);
        MostrarHora(2, 0);
    }
    //Declaracion de metodos
    public static void MostrarHora(){
        System.out.print("Horas: ");
        int Hr =lector.nextInt();
        System.out.print("Minutos: ");
        int Mn =lector.nextInt();
        System.out.print("Segundos: ");
        int Sg =lector.nextInt();
        System.out.println("La hora es "+Hr+":"+Mn+":"+Sg);
    }

    public static void MostrarHora(int Hr, int Mn, int Sg){
        System.out.println("La hora es "+Hr+":"+Mn+":"+Sg);
    }

    public static void MostrarHora(int Hr, int Mn){
        int Sg=46;
        System.out.println("La hora es "+Hr+":"+Mn+":"+Sg);
    }
}
