package MenuBanco;

public class ContaCorrente extends Conta {

    private double taxa = 2.0;

    public ContaCorrente(String titular, int numero) {
        super(titular, numero);
    }

    @Override
    public boolean sacar(double valor){

        double total = valor + taxa;

        if(saldo >= total){
            saldo -= total;
            return true;
        }

        return false;
    }
}