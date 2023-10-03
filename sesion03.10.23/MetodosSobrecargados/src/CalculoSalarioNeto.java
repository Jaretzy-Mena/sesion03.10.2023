import java.util.Scanner;

public class CalculoSalarioNeto {
    static Scanner lector = new Scanner(System.in);
    public static void Inicio(){
        System.out.println("Ingrese salario bruto C$ ");
        double salarioB= lector.nextDouble();
        Datos(salarioB);
        //---------------
    }

    public static void aber(double salarioB){
        System.out.println("Ingrese salario bruto C$ ");
        salarioB= lector.nextDouble();
    }

    public static void Datos(double salarioB){
    //---------------
    double INSS=7, Ir=15.6, Sindicato=1, antigüedad=15, INSSpatronal=22.5;
    double TtDeduc,MontAnt, MontSind, IngTotal, MontINSS, MontIR, MontDd, MontINSSp, IngNeto;
    MontAnt= salarioB*(antigüedad/100);
    MontSind=salarioB*(Sindicato/100);
    IngTotal=salarioB+MontAnt;
    MontINSS=IngTotal*(Ir/100);
    MontIR=IngTotal*(Ir/100);
    TtDeduc=MontINSS+MontIR+MontSind;
    MontINSSp=IngTotal-TtDeduc;
    }

    public static void Formulas(double salarioB){

    }
}
