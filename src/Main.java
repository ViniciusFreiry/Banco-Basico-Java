import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "Vinícius Freiy";
        String tipoConta = "Corrente";
        double saldo = 1599.99;

        System.out.println("***********************************");
        System.out.println("Nome do Cliente: " + nome);
        System.out.println("Tipo da Conta: " + tipoConta);
        System.out.println("Saldo Atual: R$" + saldo);
        System.out.println("***********************************");

        Scanner input = new Scanner(System.in);
        int opcao = -1;
        String menu = """
                ***** Digite sua Opção *****
                1 - Consultar Saldo
                2 - Transferir Valor
                3 - Receber Valor
                4 - Sair
                ****************************
                """;

        while (opcao != 4) {
            System.out.println(menu);
            opcao = input.nextInt();
            double valor = 0;

            switch (opcao) {
                case 1:
                    System.out.println("O saldo atual é: R$" + saldo + "\n");
                break;

                case 2:
                    System.out.println("Quanto você quer transferir?");
                    valor = input.nextDouble();

                    if (valor <= saldo) {
                        saldo -= valor;
                        System.out.println("Novo Saldo: R$" + saldo + "\n");
                    } else {
                        System.out.println("Saldo Insuficiente.\n");
                    }
                break;

                case 3:
                    System.out.println("Quanto você vai receber?");
                    valor = input.nextDouble();

                    saldo += valor;
                    System.out.println("Novo Saldo: R$" + saldo + "\n");
                break;

                default:
                    System.out.println("Opção Inválida!\n");
                break;
            }
        }
    }
}