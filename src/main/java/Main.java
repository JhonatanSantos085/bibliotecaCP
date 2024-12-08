import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Usuario usuario = new Usuario();
        BancoDeDados db = new BancoDeDados();

        byte opcao1;
        byte opcao2;
        byte opcao3;

        do {
            System.out.print("Escolha uma opção abaixo\n" +
                    "[1] - Cadastrar funcionário\n" +
                    "[2] - Cadastrar usuário\n" +
                    "[3] - Cadastrar livro\n" +
                    "[4] - Mostrar todos os dados do cadastro\n" +
                    "[5] - Ir para locação \n" +
                    "[0] - Sair\n" +
                    "Digite aqui a opção: ");
            opcao1 = scanner.nextByte();
            switch (opcao1) {

                case 1:
                    System.out.println("Cadastrando funcionario");
                    Funcionario funcionario = new Funcionario();
                    funcionario.cadastrarFuncionario();
                    break;
                case 2:
                    System.out.println("Cadastrando usuario");
                    usuario.cadastrarUsuario();

                    break;
                case 3:
                    System.out.println("Cadastrando livro");
                    Livro livro = new Livro();
                    livro.cadastrarLivro();
                    db.postBook(livro);
                    break;
                case 4:
                    System.out.println("Mostrando os dados cadastrados");
                    do{
                        System.out.println("Escolha uma opção abaixo\n" +
                                "[1] - ExibirInfo funcionário\n" +
                                "[2] - ExibirInfo usuário\n" +
                                "[3] - ExibirInfo livro\n" +
                                "[0] - Voltar ao menu principal\n");
                        opcao2 = scanner.nextByte();
                        switch (opcao2){
                            case 1:
                                System.out.println("Exibindo informacoes do funcionario");
                                break;
                            case 2:
                                System.out.println("Exibindo informacoes do usuario");

                                break;
                            case 3:
                                System.out.println("Exibindo informacoes do livro");
                                db.getBook();
                                break;
                            case 0:
                                System.out.println("Voltando ao menu principal");
                                break;
                            default:
                                System.out.println("Digite uma opcao valida.");

                        }


                    }while(opcao2 != 0);
                    break;
                case 5:
                    System.out.println("Abrindo menu de locacao");
                    do {
                        System.out.println("Escolha uma opção abaixo\n" +
                                "[0] - Voltar para menu princial\n" +
                                "[1] - Locar Livro\n" +
                                "[2] - Devolucao\n" );
                        opcao3 = scanner.nextByte();

                        switch (opcao3) {
                            case 0:
                                System.out.println("Voltando para o menu principal, só um minuto...");
                                break;
                            case 1:
                                System.out.println("Você selecionou a opção de um alugar um livro.");
                                break;
                            case 2:
                                System.out.println("Você escolheu devolver um livro.");
                                break;
                            default:
                                System.out.println("Opção inválida! Tente novamente.");
                        }

                    } while (opcao3 != 0);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Digite uma opcao valida");


            }

        } while (opcao1 != 0);


    }
}
