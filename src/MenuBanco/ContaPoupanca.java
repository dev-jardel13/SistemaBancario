package MenuBanco;

public class ContaPoupanca extends Conta {

    private double juros = 0.05;

    public ContaPoupanca(String titular, int numero) {
        super(titular, numero);
    }

    public void aplicarJuros(){
        saldo += saldo * juros;
    }
}