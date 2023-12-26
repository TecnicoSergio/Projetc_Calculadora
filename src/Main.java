import java.util.Scanner;
import calculadora.Calc;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Calc calc1 = new Calc();
        Calc calc2 = new Calc();
        Calc res = new Calc();
        String opc = "S";


        while (opc.equals("s") || opc.equals("S")){
            System.out.printf("%nDigite o valor 1: ");
            calc1.setValor(scan.nextInt());
            System.out.printf("%nDigite o valor 2: ");
            calc2.setValor(scan.nextInt());

            res.setValor(calc1.getValor() + calc2.getValor());
            System.out.printf("%nA soma de %d com %d e igual a %d",calc1.getValor(),calc2.getValor(),res.getValor());


            //======================================================================
            res.setValor(calc1.getValor() - calc2.getValor());
            System.out.printf("%nA subtração de %d com %d e igual a %d",calc1.getValor(),calc2.getValor(),res.getValor());


            //=====================================================================
            res.setValor(calc1.getValor() * calc2.getValor());
            System.out.printf("%nA multiplicação de %d com %d e igual a %d",calc1.getValor(),calc2.getValor(),res.getValor());


            //======================================================================
            res.setValor(calc1.getValor() / calc2.getValor());
            System.out.printf("%nA divisão de %d com %d e igual a %d",calc1.getValor(),calc2.getValor(),res.getValor());


            //=======================================================================
            System.out.printf("%nDeseja calcular outro valor?");
            opc=scan.next();
            System.out.printf("%n%n%n%n");



        }















    }
}