package MenuBanco;
public class Conta {

    private String titular;
    private int numero;
    protected double saldo;

    public Conta(String titular, int numero) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = 0;
    }

    public void depositar(double valor) {
        if(valor > 0){
            saldo += valor;
        }
    }

    public boolean sacar(double valor) {
        if(valor <= saldo){
            saldo -= valor;
            return true;
        }
        return false;
    }

    public void transferir(Conta destino, double valor){
        if(sacar(valor)){
            destino.depositar(valor);
        }
    }

    public String getDados(){
        return "Titular: " + titular +
                "\nConta: " + numero +
                "\nSaldo: " + saldo;
    }
}