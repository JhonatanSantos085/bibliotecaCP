import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        byte op;

        do {
            System.out.print("Escolha uma opção abaixo\n" +
                    "[1] - Cadastrar funcionário\n" +
                    "[2] - Cadastrar usuário\n" +
                    "[3] - Cadastrar livro\n" +
                    "[4] - Mostrar todos os dados do cadastro\n" +
                    "[5] - Ir para locação \n" +
                    "[0] - Sair\n" +
                    "Digite aqui a opção: ");
            op = scanner.nextByte();

        } while (op != 0);


    }
}
