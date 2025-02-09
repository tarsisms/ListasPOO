package lista09exceptions.questao02.exceptions;

public class SaldoInsuficienteException extends IllegalArgumentException {
    public SaldoInsuficienteException(String message) {
        super(message);
    }
}

