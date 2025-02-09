package lista09exceptions.questao02.domain;


import lista09exceptions.questao02.exceptions.SaldoInsuficienteException;
import lista09exceptions.questao02.exceptions.ValorNegativoException;

public abstract class Conta {
    private String numeroConta;
    private String cpfCliente;
    private double saldo;
    private double taxa;
    private String banco;

    public Conta(String numeroConta, String cpfCliente, double saldo, double taxa, String banco) {
        this.numeroConta = numeroConta;
        this.cpfCliente = cpfCliente;
        this.saldo = saldo;
        this.taxa = taxa;
        this.banco = banco;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public void atualizar() {
        this.saldo = this.saldo - this.taxa;
    }

    public void deposito(double valor) throws ValorNegativoException {
        if (valor <= 0) {
            throw new ValorNegativoException("Valor de depósito deve ser maior que zero.");
        }

        this.saldo += valor;
    }

    public void saque(double valor) throws ValorNegativoException, SaldoInsuficienteException {
        if (valor <= 0) {
            throw new ValorNegativoException("Valor de saque deve ser maior que zero.");
        }
        if (this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo insuficiente para o saque.");
        }

        this.saldo -= valor;
    }
}
