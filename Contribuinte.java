public class Contribuinte implements CalculadoraTributo {

    private String nome;
    private String cpf;
    private double salarioBruto;

    public Contribuinte(String nome, String cpf, double salarioBruto) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBruto = salarioBruto;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public String getTipo() {
        return "Contribuinte";
    }

    public double calcularINSS() {
        return 0.0;
    }

    public double calcularIRPF() {
        return 0.0;
    }

    public double calcularSalarioLiquido() {
        return salarioBruto - calcularINSS() - calcularIRPF();
    }

    public void exibirResumo() {
        System.out.println("Tipo: " + getTipo());
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Salário Bruto: " + salarioBruto);
        System.out.println("INSS: " + calcularINSS());
        System.out.println("IRPF: " + calcularIRPF());
        System.out.println("Salário Líquido: " + calcularSalarioLiquido());
    }
}
