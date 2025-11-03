import java.util.Scanner;

public class Principal {
    
    private static final int CAPACIDADE_PADRAO = 5;

    public static void main(String[] args) {
        
        Lista lista = new Lista();
        pilha2 pilha = new pilha2(CAPACIDADE_PADRAO);
        fila3 fila = new fila3();
        
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;
        
        System.out.println("--- Sistema de Teste de Estruturas de Dados (TDA) ---");

        
        while (opcao != 0) {
            
            
            System.out.println("\n==============================================");
            System.out.println("Escolha uma Estrutura para Testar:");
            System.out.println("1. Lista (inserir)");
            System.out.println("2. Pilha (empilhar/desempilhar)");
            System.out.println("3. Fila (enfileirar/desenfileirar)");
            System.out.println("0. Sair");
            System.out.print("Opção: ");

            try {
               
                if (scanner.hasNextInt()) {
                    opcao = scanner.nextInt();
                } else {
                    throw new java.util.InputMismatchException();
                }
                
                switch (opcao) {
                    case 1:
                        menuLista(scanner, lista);
                        break;
                    case 2:
                        menupilha2(scanner, pilha);
                        break;
                    case 3:
                        menufila3(scanner, fila);
                        break;
                    case 0:
                        System.out.println("Encerrando o sistema. Até logo!");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.nextLine(); 
                opcao = -1;
            }
        }
        
        scanner.close();
    }
    
   
    private static void menuLista(Scanner scanner, Lista lista) {
        int opcaoLista = -1;
        while (opcaoLista != 0) {
            System.out.println("\n--- TESTE DE LISTA ---");
            lista.mostrar(); 
            System.out.println("1. Inserir elemento (Fim da lista)");
            System.out.println("0. Voltar ao Menu Principal");
            System.out.print("Opção: ");
            
            try {
                if (scanner.hasNextInt()) {
                    opcaoLista = scanner.nextInt();
                } else {
                    throw new java.util.InputMismatchException();
                }
                
                if (opcaoLista == 1) {
                    System.out.print("Digite o valor inteiro para inserir: ");
                    if (scanner.hasNextInt()) {
                        int valor = scanner.nextInt();
                        lista.inserir(valor);
                    } else {
                        System.out.println("Valor inválido.");
                        scanner.nextLine();
                    }
                } else if (opcaoLista != 0) {
                    System.out.println("Opção inválida.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.nextLine();
                opcaoLista = -1;
            }
        }
    }
    
    private static void menupilha2(Scanner scanner, pilha2 pilha) {
        int opcaoPilha = -1;
        while (opcaoPilha != 0) {
            System.out.println("\n--- TESTE DE PILHA ---");
            pilha.mostrar(); 
            System.out.println("1. Empilhar (Push)");
            System.out.println("2. Desempilhar (Pop)");
            System.out.println("0. Voltar ao Menu Principal");
            System.out.print("Opção: ");
            
            try {
                 if (scanner.hasNextInt()) {
                    opcaoPilha = scanner.nextInt();
                } else {
                    throw new java.util.InputMismatchException();
                }

                if (opcaoPilha == 1) {
                    System.out.print("Digite o valor inteiro para empilhar: ");
                    if (scanner.hasNextInt()) {
                        int valor = scanner.nextInt();
                        pilha.empilhar(valor);
                    } else {
                        System.out.println("Valor inválido.");
                        scanner.nextLine();
                    }
                } else if (opcaoPilha == 2) {
                    pilha.desempilhar();
                } else if (opcaoPilha != 0) {
                    System.out.println("Opção inválida.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.nextLine();
                opcaoPilha = -1;
            }
        }
    }
    
    private static void menufila3(Scanner scanner, fila3 fila) {
        int opcaoFila = -1;
        while (opcaoFila != 0) {
            System.out.println("\n--- TESTE DE FILA ---");
            fila.mostrar();
            System.out.println("1. Enfileirar (Enqueue)");
            System.out.println("2. Desenfileirar (Dequeue)");
            System.out.println("0. Voltar ao Menu Principal");
            System.out.print("Opção: ");
            
            try {
                if (scanner.hasNextInt()) {
                    opcaoFila = scanner.nextInt();
                } else {
                    throw new java.util.InputMismatchException();
                }

                if (opcaoFila == 1) {
                    System.out.print("Digite o valor inteiro para enfileirar: ");
                    if (scanner.hasNextInt()) {
                        int valor = scanner.nextInt();
                        fila.enfileirar(valor);
                    } else {
                        System.out.println("Valor inválido.");
                        scanner.nextLine();
                    }
                } else if (opcaoFila == 2) {
                    fila.desenfileirar();
                } else if (opcaoFila != 0) {
                    System.out.println("Opção inválida.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.nextLine();
                opcaoFila = -1;
            }
        }
    }
}