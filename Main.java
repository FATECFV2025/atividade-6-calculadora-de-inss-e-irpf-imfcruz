import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("CPF: ");
        String cpf = sc.nextLine();

        System.out.print("Salário Bruto: ");
        double salario = sc.nextDouble();

        System.out.println("1 - CLT");
        System.out.println("2 - Estagiário");
        System.out.println("3 - Prestador de Serviço");
        System.out.print("Escolha: ");
        int tipo = sc.nextInt();

        Contribuinte c;

        if (tipo == 1) {
            c = new FuncionarioCLT(nome, cpf, salario);
        } else if (tipo == 2) {
            c = new Estagiario(nome, cpf, salario);
        } else if (tipo == 3) {
            c = new PrestadorServico(nome, cpf, salario);
        } else {
            System.out.println("Opção inválida.");
            sc.close();
            return;
        }

        c.exibirResumo();

        sc.close();
    }
}
