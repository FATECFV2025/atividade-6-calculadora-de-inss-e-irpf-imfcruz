public class PrestadorServico extends Contribuinte {

    public PrestadorServico(String nome, String cpf, double salarioBruto) {
        super(nome, cpf, salarioBruto);
    }

    public String getTipo() {
        return "Prestador de Serviço";
    }

    public double calcularINSS() {
        return 0.0;
    }

    public double calcularIRPF() {
        return getSalarioBruto() * 0.20;
    }

    public double calcularSalarioLiquido() {
        return getSalarioBruto() - calcularIRPF();
    }
}
