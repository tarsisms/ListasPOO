package lista09exceptions.questao02.domain;

import lista09exceptions.questao02.exceptions.SaldoInsuficienteException;
import lista09exceptions.questao02.exceptions.ValorNegativoException;

public class ContaCorrente extends Conta {

    public ContaCorrente(String numeroConta, String cpfCliente, double saldo, double taxa, String banco) {
        super(numeroConta, cpfCliente, saldo, taxa, banco);
    }

    @Override
    public void saque(double valor) throws ValorNegativoException, SaldoInsuficienteException {
        if (valor <= 0) {
            throw new ValorNegativoException("Valor de saque deve ser maior que zero.");
        }
        if (getSaldo() < valor + 0.30) {
            throw new SaldoInsuficienteException("Saldo insuficiente para o saque com taxa adicional.");
        }

        super.saque(valor - 0.30);
    }
}