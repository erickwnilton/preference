import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

class Person {
    String name;
    int age;
    String hometown;

    @Override
    public String toString() {
        return "Nome: " + name + ", idade: " + age + ", cidade: " + hometown;
    }

public Person(String name, int age, String hometown) {
    this.name = name;
    this.age = age;
    this.hometown = hometown;
 }
}

public class preference {
        public static void main(String[] args) {
            LinkedList<String> row = new LinkedList<>();
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
                        System.out.println("Qual seu nome:");
                        String name = Data.next();

                        System.out.println("Qual sua idade: ");
                        int age = Data.nextInt();

                        if(age >= 65) {
                            System.out.println("Qual sua cidade: ");
                            String hometown = Data.next();

                            Person person = new Person(name, age, hometown);
                            row.add(person.toString());

                            System.out.println("Você se tornou preferencial.");

                        } else {
                            System.out.println("Apenas clientes com 65 anos ou mais são aceitos.");
                        }
                        break;
                    }
                    case 2 -> {
                        if (row.isEmpty()) {
                            System.out.println("Não há clientes preferenciais na lista.");
                        } else {
                            System.out.println("Lista de preferenciais:");
                            for(String preferredName : row) {
                                System.out.println(preferredName);
                            }
                        }
                        break;
                    }
                    case 3 -> {

                        break;
                    }
                    case 4 -> {
                        System.out.println("Digite o index para remover os dados do cliente:");
                        int RemoveIndex = Data.nextInt();

                        row.remove(RemoveIndex);
                        System.out.println("Cliente removido com sucesso.");
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