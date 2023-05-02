import java.util.Scanner;

public class PegadaDeCarbono {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tentativas = 0;
        String nome;
        int idade;
        double peso;
        double altura;
        int carneVermelha;
        int frangoPeixe;
        int transportePublico;
        int carroParticular;
        
        do {
            System.out.println("Informe o seu nome: ");
            nome = scanner.nextLine();
            System.out.println("Informe a sua idade: ");
            idade = scanner.nextInt();
            System.out.println("Informe o seu peso (em kg): ");
            peso = scanner.nextDouble();
            System.out.println("Informe a sua altura (em cm): ");
            altura = scanner.nextDouble();
            System.out.println("Quantas vezes por semana você come carne vermelha? ");
            carneVermelha = scanner.nextInt();
            System.out.println("Quantas vezes por semana você come frango ou peixe? ");
            frangoPeixe = scanner.nextInt();
            System.out.println("Quantas vezes por semana você utiliza transporte público? ");
            transportePublico = scanner.nextInt();
            System.out.println("Quantas vezes por semana você utiliza um carro particular? ");
            carroParticular = scanner.nextInt();
            scanner.nextLine(); // consumir o \n do buffer
            tentativas++;
            
            if (tentativas >= 3) {
                System.out.println("Não foi possível realizar o cálculo da pegada de carbono.");
                System.out.println("Por favor, verifique suas respostas e tente novamente.");
                System.exit(0);
            }
        } while (peso <= 0 || altura <= 0 || idade <= 0 || carneVermelha <= 0 || frangoPeixe <= 0 || transportePublico <= 0 || carroParticular <= 0);
        
        Double pegadaCarbono = (peso * altura * idade) / (carneVermelha + frangoPeixe + transportePublico + carroParticular);
        
        System.out.println("Informações coletadas:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
        System.out.println("Quantidade de carne vermelha: " + carneVermelha);
        System.out.println("Quantidade de frango ou peixe: " + frangoPeixe);
        System.out.println("Quantidade de vezes que utiliza transporte público: " + transportePublico);
        System.out.println("Quantidade de vezes que utiliza um carro particular: " + carroParticular);
        System.out.println("Pegada de carbono calculada: " + pegadaCarbono/100);
        
        if (pegadaCarbono < 10) {
            System.out.println("Você está fazendo um bom trabalho em reduzir sua pegada de carbono! Continue assim!");
        } else if (pegadaCarbono >= 10 && pegadaCarbono <= 20) {
            System.out.println("Sua pegada de carbono é razoável, mas há espaço para melhorias. Considere reduzir a quantidade de carne que consome e tente utilizar mais transporte público.");
        
        }
    }
}
