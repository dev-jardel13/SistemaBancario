package MenuBanco;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        String titular = JOptionPane.showInputDialog("Nome do titular:");

        int numero = Integer.parseInt(
                JOptionPane.showInputDialog("Número da conta:")
        );

        int tipo = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Tipo de conta\n1 - Corrente\n2 - Poupança"
                )
        );

        Conta conta;

        if(tipo == 1){
            conta = new ContaCorrente(titular, numero);
        }else{
            conta = new ContaPoupanca(titular, numero);
        }

        int opcao;

        do{

            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "MENU\n\n" +
                            "1 - Depositar\n" +
                            "2 - Sacar\n" +
                            "3 - Ver dados\n" +
                            "4 - Sair"
            ));

            switch(opcao){

                case 1:

                    double deposito = Double.parseDouble(
                            JOptionPane.showInputDialog("Valor do depósito:")
                    );

                    conta.depositar(deposito);

                    break;

                case 2:

                    double saque = Double.parseDouble(
                            JOptionPane.showInputDialog("Valor do saque:")
                    );

                    if(!conta.sacar(saque)){
                        JOptionPane.showMessageDialog(null,"Saldo insuficiente");
                    }

                    break;

                case 3:

                    JOptionPane.showMessageDialog(null, conta.getDados());

                    break;

            }

        }while(opcao != 4);
    }
}