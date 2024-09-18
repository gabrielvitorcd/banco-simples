import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String linha= "================================================";


        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o tipo da sua conta: ");
        String tipoDeConta = scanner.nextLine();

        System.out.println("Digite qual valor inicial");
        double saldo = scanner.nextDouble();


        String mensagemConsulta =
                """
                Nome:                %s
                Tipo de conta:       %s
                Saldo inicial:       %s
                """.formatted(nome,tipoDeConta,saldo);

        String mensagemDeOperacoes =
                """
                Operações
                
                1- Consultar saldos
                2- Receber valores
                3- Transferir valor
                4- Sair
                
                Qual operação deseja?""";


        System.out.println(linha);
        System.out.println(mensagemConsulta);
        System.out.println(linha);

        int resposta = 0;

        while (resposta != 4){
            System.out.println(mensagemDeOperacoes);
            resposta = scanner.nextInt();

            switch (resposta) {
                case 1:
                    System.out.println(linha);
                    System.out.println("CONSULTAR VALORES");
                    System.out.println("Saldo atual: " + saldo);
                    System.out.println(linha);
                    break;
                case 2:
                    System.out.println(linha);
                    System.out.println("RECEBER VALORES");
                    System.out.println("Qual valor deseja depositar?");
                    double valorEntrada = scanner.nextDouble();
                    saldo += valorEntrada;
                    System.out.println("Saldo atual: " + saldo);
                    System.out.println(linha);
                    break;
                case 3:
                    System.out.println(linha);
                    System.out.println("TRANSFERIR VALORES");
                    System.out.println("Qual valor deseja retirar?");
                    double valorSaida = scanner.nextDouble();
                    saldo -= valorSaida;
                    if (valorSaida > saldo) {
                        System.out.println("Saldo Insuficiente");
                        break;
                    }
                    System.out.println("Saldo atual: " + saldo);
                    System.out.println(linha);
                    break;
                default:
                    System.out.println(linha);
                    System.out.println("OPCAO INVALIDA");
                    System.out.println("Digite um numero valido");
                    System.out.println(linha);
            }

        }
        System.out.println("Encerrado!");
    }
}
