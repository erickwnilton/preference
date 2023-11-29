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
                        if(row.isEmpty()) {
                            System.out.println("Não há clientes para atualizar.");
                        } else {
                            System.out.println("Digite o index para atualizar os dados do cliente: ");
                            int UpdateIndex = Data.nextInt();

                            if(UpdateIndex >= 0 && UpdateIndex < row.size()) {
                                System.out.println("Digite seu nome: ");
                                String newName = Data.next();

                                System.out.println("Digite sua idade: ");
                                int newAge = Data.nextInt();

                                if(newAge >= 65) {
                                    System.out.println("Digite sua cidade: ");
                                    String newHometown = Data.next();

                                    Person updatePerson = new Person(newName, newAge, newHometown);
                                    row.set(UpdateIndex, updatePerson.toString());

                                    System.out.println("Dados do cliente atualizado com sucesso.");
                                } else {
                                    System.out.println("Apenas clientes com 65 anos ou mais são aceitos.");
                                }
                            } else {
                                System.out.println("Índice inválido. Não foi possível atualizar os dados do cliente");
                            }
                        }
                        break;
                    }
                    case 4 -> {
                        if (row.isEmpty()) {
                            System.out.println("Não há clientes para remover.");
                        } else {
                            System.out.println("Digite o index para remover os dados do cliente: ");
                            int RemoveIndex = Data.nextInt();

                            row.remove(RemoveIndex);
                            System.out.println("Cliente removido com sucesso.");
                        }
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