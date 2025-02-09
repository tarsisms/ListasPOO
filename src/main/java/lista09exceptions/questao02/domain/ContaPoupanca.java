package lista09exceptions.questao02.domain;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(String numeroConta, String cpfCliente, double saldo, double taxa, String banco) {
        super(numeroConta, cpfCliente, saldo, taxa, banco);
    }

    @Override
    public void atualizar() {
        double valor = super.getSaldo() * super.getTaxa();
        super.deposito(valor);
    }
}
