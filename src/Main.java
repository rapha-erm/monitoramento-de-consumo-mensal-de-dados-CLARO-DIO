import java.util.Scanner;

public class Main {

    // Função para converter GB para MB
    public static double gbParaMb(double gb) {
        double conversao = (gb * 1024);
        // TODO: Faça o calculo de conversão GB para MB, sabendo que 1 GB = 1024 MB
        return conversao;
    }

    // Função principal para verificar o limite de dados móveis
    public static void verificarLimiteDeDados(double limiteGb, int consumoTotalMb) {
        // Convertendo o limite de GB para MB
        int limiteMb = (int) gbParaMb(limiteGb);

        // TODO: Verifique se o consumo total excede o limite mensal em MB
        if (consumoTotalMb > limiteMb) {
            System.out.println("Limite de dados excedido. Compre ou renove seu pacote.");
        } else {
            int dadosDisponiveis = limiteMb - consumoTotalMb;
            System.out.println("Voce ainda possui " + dadosDisponiveis + " MB disponiveis.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário o limite mensal de dados em GB
        double limiteGb = scanner.nextDouble();
        scanner.nextLine();  // Consumir a nova linha

        // Solicitando ao usuário o consumo total de dados em MB
        int consumoTotalMb = scanner.nextInt();

        // Verificando o limite de dados móveis
        verificarLimiteDeDados(limiteGb, consumoTotalMb);

        scanner.close();
    }
}