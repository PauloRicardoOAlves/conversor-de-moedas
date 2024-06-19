import java.util.Scanner;

public class Main {

    public static double rate;
    public static int option = -1;
    public static String inputCurrency;
    public static String outputCurrency;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conect conect = new Conect();

        String menuLayout = """
                ----------------------------------
                Seja bem vindo(a) ao conversor de moeda!
                            
                Selecione a conversão que você deseja fazer:
                            
                1) Real => Dólar americano;
                2) Dólar americano => Real;
                3) Real => Euro;
                4) Euro => Real;
                5) Real => Iene;
                6) Iene => Real;
                7) Real => Kwanza (Angola)
                8) Kwanza => Real
                            
                Digite 0 para sair!
                """;

        while (option != 0) {
            System.out.println(menuLayout);
            option = scanner.nextInt();

            switch (option) {
                case 0:
                    System.out.println("Conversor finalizando...");
                    break;
                case 1:
                    inputCurrency = "BRL";
                    outputCurrency = "USD";
                    rate = conect.conect("BRL", "USD");
                    break;
                case 2:
                    inputCurrency = "USD";
                    outputCurrency = "BRL";
                    rate = conect.conect("USD", "BRL");
                    break;
                case 3:
                    inputCurrency = "BRL";
                    outputCurrency = "EUR";
                    rate = conect.conect("BRL", "EUR");
                    break;
                case 4:
                    inputCurrency = "EUR";
                    outputCurrency = "BRL";
                    rate = conect.conect("EUR", "BRL");
                    break;
                case 5:
                    inputCurrency = "BRL";
                    outputCurrency = "JPY";
                    rate = conect.conect("BRL", "JPY");
                    break;
                case 6:
                    inputCurrency = "JPY";
                    outputCurrency = "BRL";
                    rate = conect.conect("JPY", "BRL");
                    break;
                case 7:
                    inputCurrency = "BRL";
                    outputCurrency = "AOA";
                    rate = conect.conect("BRL", "AOA");
                    break;
                case 8:
                    inputCurrency = "AOA";
                    outputCurrency = "BRL";
                    rate = conect.conect("AOA", "BRL");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente!");
                    continue;
            }

            if (option != 0) {
                System.out.println("Qual o valor a ser convertido?");

                double qtd = scanner.nextDouble();

                Calculator calculator = new Calculator(rate, qtd, inputCurrency, outputCurrency);
                double result = calculator.convert();
                System.out.println(calculator.toString());
            }
        }
        scanner.close();
    }
}
