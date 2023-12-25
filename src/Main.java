import java.util.Scanner;
import calculadora.Calc;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Calc calc1 = new Calc(12,25, 0, 1);

        System.out.println("================");
        System.out.println("Calculadora Simples: ");
        System.out.println("================");

        System.out.println("[1] - Soma: ");
        System.out.println("[2] - Multiplicação: ");
        System.out.println("[3] - Divisão: ");
        System.out.println("[4] - Subtração: ");


        System.out.println("================================");
        System.out.println("Escolha a opção:   ");
        calc1.opcao = calc1.entrada;
        System.out.println("=================================== ");

        switch (calc1.getOpcao()){
            case 1:
                System.out.println("Digite o primeiro numero: ");
                calc1.numero1 = calc1.entrada;
                System.out.println("Digite o segundo numero: ");
                calc1.numero2 = calc1.entrada;
                calc1.res = calc1.numero1 + calc1.numero2;
                System.out.println("Resultado da Soma é : " + calc1.res);
                break;

            case 2:
                System.out.println("Digite o primeiro numero: ");
                calc1.numero1 = calc1.entrada;
                System.out.println("Digite o segundo numero: ");
                calc1.numero2 = calc1.entrada;
                calc1.res = calc1.numero1 * calc1.numero2;
                System.out.println("Resultado da Multiplicação é : " + calc1.res);
                break;

            case 3:
                System.out.println("Digite o primeiro numero: ");
                calc1.numero1 = calc1.entrada;
                System.out.println("Digite o segundo numero: ");
                calc1.numero2 = calc1.entrada;
                calc1.res = calc1.numero1 / calc1.numero2;
                System.out.println("Resultado da Divisão é : " + calc1.res);
                break;

            case 4:
                System.out.println("Digite o primeiro numero: ");
                calc1.numero1 = calc1.entrada;
                System.out.println("Digite o segundo numero: ");
                calc1.numero2 = calc1.entrada;
                calc1.res = calc1.numero1 - calc1.numero2;
                System.out.println("Resultado da Subtração é : " + calc1.res);
                break;
            default:
                System.out.println("Opção Invalida: ");
                break;
        }
        System.out.println("Deseja fazer nova Operação? [S/N]: ");
        int Nova = calc1.entrada;
        if (calc1.opcao == 'S'){


        }
        else {
            System.out.println("Fim da Operação ");

        }
        do {
            System.out.println("Deseja fazer nova Operação? [S/N]: ");
            //char Nova;
            Nova = (char)calc1.entrada;
            if (Nova == 'N'){
                System.out.println("Fim da OPeração ");
                break;

            }
        }while (true);




    }
}