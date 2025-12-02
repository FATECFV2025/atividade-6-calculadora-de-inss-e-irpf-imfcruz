public class Estagiario extends Contribuinte {

    public Estagiario(String nome, String cpf, double salarioBruto) {
        super(nome, cpf, salarioBruto);
    }

    public String getTipo() {
        return "Estagiário";
    }

    public double calcularINSS() {
        return 0.0;
    }

    public double calcularIRPF() {
        return 0.0;
    }

    public double calcularSalarioLiquido() {
        return getSalarioBruto();
    }
}

