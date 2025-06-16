package petShop;

import java.util.Scanner;

public class AtendimentoPetshop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FachadaPetshop fachada = new FachadaPetshop();

        boolean repetir = true;
        int codigoServico = 1;

        while (repetir) {
            final String MENU_PRINCIPAL = """
    ===========| Bem-vindo(a) ao atendimento do PetShop! |===========
    Informe o serviço que deseja acessar:
    [1] Banho
    [2] Hotelzinho
    [3] Tosa
    [4] Fechar loja
    [0] Sair
    """;

            System.out.println(MENU_PRINCIPAL);
            int escolha = -1;
            boolean entradaValida = false;

            while (!entradaValida) {
                String entrada = sc.nextLine();
                try {
                    escolha = Integer.parseInt(entrada);
                    if (escolha >= 0 && escolha <= 4) {
                        entradaValida = true;
                    } else {
                        System.err.println("Escolha inválida. Digite um número entre 0 e 4.");
                    }
                } catch (NumberFormatException e) {
                    System.err.println("Erro: escolha aceita apenas números inteiros.");
                }
            }

            switch (escolha) {
                case 0:
                    System.out.println("Saindo do sistema...");
                    repetir = false;
                    break;

                case 1: // Banho
                    System.out.println("Informe o tamanho do animal (PEQUENO, MEDIO, GRANDE):");
                    TamanhoDoAnimal tamanhoAnimalBanho = lerTamanhoAnimal(sc);
                    System.out.println("Informe o tamanho do pelo (CURTO, MEDIO, LONGO):");
                    TamanhoPelo tamanhoPelo = lerTamanhoPelo(sc);

                    Banho banho = fachada.addBanho(codigoServico++, tamanhoAnimalBanho, tamanhoPelo);
                    System.out.printf("Banho cadastrado com sucesso! Valor: R$ %.2f%n%n", banho.calculaPreco());
                    break;

                case 2:
                    System.out.println("Informe o tamanho do animal (PEQUENO, MEDIO, GRANDE):");
                    TamanhoDoAnimal tamanhoAnimalHotel = lerTamanhoAnimal(sc);

                    int horas = -1;
                    while (horas < 0) {
                        System.out.println("Informe a quantidade de horas de permanência (número inteiro):");
                        try {
                            horas = Integer.parseInt(sc.nextLine());
                            if (horas < 0) {
                                System.err.println("Informe um valor positivo para horas.");
                            }
                        } catch (NumberFormatException e) {
                            System.err.println("Erro: informe um número inteiro válido.");
                        }
                    }

                    Hotelzinho hotelzinho = fachada.addHotelzinho(codigoServico++, tamanhoAnimalHotel, horas);
                    System.out.printf("Hotelzinho cadastrado com sucesso! Valor: R$ %.2f%n%n", hotelzinho.calculaPreco());
                    break;

                case 3:
                    System.out.println("Informe o tamanho do animal (PEQUENO, MEDIO, GRANDE):");
                    TamanhoDoAnimal tamanhoAnimalTosa = lerTamanhoAnimal(sc);

                    Tosa tosa = fachada.addTosa(codigoServico++, tamanhoAnimalTosa);
                    System.out.printf("Tosa cadastrada com sucesso! Valor: R$ %.2f%n%n", tosa.calculaPreco());
                    break;

                case 4:
                    System.out.println("Inventário dos serviços realizados:");
                    System.out.println(fachada.listaServicos());
                    System.out.printf("Valor total arrecadado: R$ %.2f\n", fachada.calculaServico());
                    System.out.println("Loja fechada. Obrigado!");
                    repetir = false;
                    break;
            }
        }

        sc.close();
    }

    private static TamanhoDoAnimal lerTamanhoAnimal(Scanner sc) {
        while (true) {
            String input = sc.nextLine().trim().toUpperCase();
            try {
                return TamanhoDoAnimal.valueOf(input);
            } catch (IllegalArgumentException e) {
                System.err.println("Tamanho inválido. Informe PEQUENO, MEDIO ou GRANDE:");
            }
        }
    }

    private static TamanhoPelo lerTamanhoPelo(Scanner sc) {
        while (true) {
            String input = sc.nextLine().trim().toUpperCase();
            try {
                return TamanhoPelo.valueOf(input);
            } catch (IllegalArgumentException e) {
                System.err.println("Tamanho do pelo inválido. Informe CURTO, MEDIO ou LONGO:");
            }
        }
    }
}