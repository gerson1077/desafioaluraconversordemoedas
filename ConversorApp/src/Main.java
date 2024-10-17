import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();
        menu.opcoesDeMoedas();

        Scanner leitura = new Scanner(System.in);
        Referencias referencias = new Referencias();

        boolean opcaoValida = false;
        while (!opcaoValida){
            int opcao1 = leitura.nextInt();
            if (opcao1 >=1 && opcao1 <=6){
                switch (opcao1){
                    case 1:
                        referencias.setConverterDe("ARS");
                        break;

                    case 2:
                        referencias.setConverterDe("BOB");
                        break;
                    case 3:
                        referencias.setConverterDe("BRL");
                        break;
                    case 4:
                        referencias.setConverterDe("CLP");
                        break;
                    case 5:
                        referencias.setConverterDe("COP");
                        break;
                    case 6:
                        referencias.setConverterDe("USD");
                        break;
                    default:
                        System.out.println("Digite um número valido entre 1 a 6");
                        break;
                }
                opcaoValida = true;
            } else {
                System.out.println("Digite um número valido entre 1 a 6");
            }
        }
        System.out.println("Escolha selecionada: " + referencias.getConverterDe());
        System.out.println("Selecione agora a moeda para a qual a conversão deve ser realizada");
        menu.opcoesDeMoedas();

        opcaoValida = false;
        while (!opcaoValida){
            int opcao2 = leitura.nextInt();
            if (opcao2 >=1 && opcao2 <=6){
                switch (opcao2){
                    case 1:
                        referencias.setConverterPara("ARS");
                        break;

                    case 2:
                        referencias.setConverterPara("BOB");
                        break;
                    case 3:
                        referencias.setConverterPara("BRL");
                        break;
                    case 4:
                        referencias.setConverterPara("CLP");
                        break;
                    case 5:
                        referencias.setConverterPara("COP");
                        break;
                    case 6:
                        referencias.setConverterPara("USD");
                        break;
                    default:
                        System.out.println("Digite um número valido entre 1 a 6");
                        break;
                }
                opcaoValida = true;
            } else {
                System.out.println("Digite um número valido entre 1 a 6");
            }
        }

        System.out.println("A opção selecionada foi a conversão de " + referencias.getConverterDe() + " para "
                + referencias.getConverterPara());

        System.out.println("Digite o valor em " + referencias.getConverterDe() + " para a conversão em "
                + referencias.getConverterPara());

        boolean valorValido = false;
        while (!valorValido){
            try {
                String valor = leitura.next().replace(',', '.');
                referencias.setQuantia(Double.parseDouble(valor));
                valorValido = true;
            } catch (NumberFormatException e){
                System.out.println("Digite um valor válido");
                valorValido = false;
            }
        }

        ApiParaConversao.Moeda(referencias);




    }
}