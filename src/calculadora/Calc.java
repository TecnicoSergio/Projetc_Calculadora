package calculadora;

public class Calc {

    public int numero1;
    public int numero2;
    public int res;
    public int opcao;
    public int entrada;

    public Calc(int entrada) {
        this.entrada = entrada;
    }

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }

    @Override
    public String toString() {
        return "Calc{" +
                "entrada=" + entrada +
                '}';
    }

    public Calc(int numero1, int numero2, int res, int opcao) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.res = res;
        this.opcao = opcao;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }

    public int getOpcao() {
        return opcao;
    }

    public void setOpcao(int opcao) {
        this.opcao = opcao;
    }

}
