import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> Animals = new ArrayList<>();
        String inpWord = "";

        while (!inpWord.equals("exit")) {
            System.out.println("Меню");
            System.out.println("Введите add/list/exit");
            inpWord = scanner.next().trim().toLowerCase();

            Commands word = Commands.fetchValue(inpWord);
            if (word != null) {
                switch (word) {
                    case ADD:
                        System.out.println("Введите вид животного (cat/dog/duck) ");
                        String type = scanner.next().trim().toLowerCase();
                        switch (type) {
                            case "cat":
                                input(scanner);
                                Animal cat = new Cat(Animal.name, Animal.age, Animal.weight, Animal.color);
                                Animals.add(cat.toString());
                                cat.say();
                                break;
                            case "dog":
                                input(scanner);
                                Animal dog = new Dog(Animal.name, Animal.age, Animal.weight, Animal.color);
                                Animals.add(dog.toString());
                                dog.say();
                                break;
                            case "duck":
                                input(scanner);
                                Animal duck = new Duck(Animal.name, Animal.age, Animal.weight, Animal.color);
                                Animals.add(duck.toString());
                                duck.say();
                                break;
                            default:
                                System.out.println("Введено некорректное значение, введите заново");
                        }
                        break;
                    case LIST:
                        for (String animal : Animals) {
                            System.out.println(animal);
                        }
                        System.out.println(" ");
                        break;
                    case EXIT:
                        System.out.println("Выход из меню");
                        break;
                    default:
                        System.out.println("Введено некорректное значение, введите заново");
                }

            } else {
                System.out.println("Введено некорректное значение, введите заново");
            }

        }
    }

    private static void input(Scanner scanner) {
        System.out.println("Введите имя животного");
        Animal.name = scanner.next();

        scanner.nextLine();

        System.out.println("Введите возраст животного");
        while(true) {
            if (scanner.hasNextInt()) {
                Animal.age = Integer.parseInt(scanner.nextLine());
                break;
            } else {
                System.out.println("Вы ввели некорректные данные, попробуйте снова");
                scanner.nextLine();
            }
        }

        System.out.println("Введите вес животного");
        while(true) {
            if (scanner.hasNextInt()) {
                Animal.weight = Integer.parseInt(scanner.nextLine());
                break;
            } else {
                System.out.println("Вы ввели некорректные данные, попробуйте снова");
                scanner.nextLine();
            }
        }

        System.out.println("Введите цвет животного");
        Animal.color = scanner.next();
    }
}