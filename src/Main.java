import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "Vinícius Freiy";
        String tipoConta = "Corrente";
        double saldo = 1599.99;

        System.out.println("***********************************");
        System.out.println("Nome do Cliente: " + nome);
        System.out.println("Tipo da Conta: " + tipoConta);
        System.out.println("Saldo Atual: " + saldo);
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
        }
    }
}