public class FuncionarioCLT extends Contribuinte {

    public FuncionarioCLT(String nome, String cpf, double salarioBruto) {
        super(nome, cpf, salarioBruto);
    }

    public String getTipo() {
        return "Funcionário CLT";
    }

    public double calcularINSS() {
        return getSalarioBruto() * 0.10;
    }

    public double calcularIRPF() {
        return getSalarioBruto() * 0.15;
    }

    public double calcularSalarioLiquido() {
        return getSalarioBruto() - calcularINSS() - calcularIRPF();
    }
}
