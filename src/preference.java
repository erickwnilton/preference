import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

class Person {
    String name;
    static int age;
    String hometown;

public Person(String name, int age, String hometown) {
    this.name = name;
    this.age = age;
    this.hometown = hometown;
 }
}

public class preference {
        public static void main(String[] args) {
            Queue<String> row = new LinkedList<>();
            Scanner Data = new Scanner(System.in);

            while (true) {
                System.out.println("1. Adicionar novo cliente");
                System.out.println("2. Listar clientes preferenciais");
                System.out.println("3. Atualizar cliente");
                System.out.println("4. Remover cliente");
                System.out.println("0. Sair");

                int readOption = Data.nextInt();

                switch (readOption) {
                    case 1 -> {

                        break;
                    }
                    case 2 -> {

                        break;
                    }
                    case 3 -> {

                        break;
                    }
                    case 4 -> {

                        break;
                    }
                    case 0 -> {
                        Data.close();
                        System.exit(0);
                    }
                    default -> {
                        System.out.println("Opção inválida.");
                        System.out.println("Digite uma das opções abaixo:");
                        break;
                    }
                }
            }
        }
}