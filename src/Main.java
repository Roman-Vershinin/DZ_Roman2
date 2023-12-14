import Animals.Animal;
import Animals.fly.Duck;
import Animals.pets.Cat;
import Animals.pets.Dog;
import data.Commands;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static boolean IS_TRUE = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> Animals = new ArrayList<>();
        String inpWord = "";

        while (true) {
            System.out.println("Меню");
            System.out.println("Введите add/list/exit");
            inpWord = scanner.next().trim().toLowerCase();
            scanner.nextLine();

            Commands word = Commands.valueOf(inpWord.toUpperCase());
            if (word != null) {
                switch (word) {
                    case ADD:
                        System.out.println("Введите вид животного (cat/dog/duck) ");
                        String type;
                        while (IS_TRUE) {
                            type = scanner.next().trim().toLowerCase();
                            switch (type) {
                                case "cat":
                                    input(scanner);
                                    Animal cat = new Cat(Animal.getName(), Animal.getAge(), Animal.getWeight(), Animal.getColor());
                                    Animals.add(cat.toString());
                                    cat.say();
                                    break;
                                case "dog":
                                    input(scanner);
                                    Animal dog = new Dog(Animal.getName(), Animal.getAge(), Animal.getWeight(), Animal.getColor());
                                    Animals.add(dog.toString());
                                    dog.say();
                                    break;
                                case "duck":
                                    input(scanner);
                                    Animal duck = new Duck(Animal.getName(), Animal.getAge(), Animal.getWeight(), Animal.getColor());
                                    Animals.add(duck.toString());
                                    duck.say();
                                    break;
                                default:
                                    System.out.println("Введено некорректное значение, введите заново");
                                    break;
                            }
                        }
                    case LIST:
                        for (String animal : Animals) {
                            System.out.println(animal);
                        }
                        System.out.println(" ");


                    case EXIT:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Введено некорректное значение, введите заново");

                }
            } else {
                System.out.println("Введено некорректное значение, введите заново");
            }
            break;

        }
    }


    private static void input(Scanner scanner) {
        System.out.println("Введите имя животного");
        Animal.setName(scanner.next());

        scanner.nextLine();

        System.out.println("Введите возраст животного");
        asd(scanner, "age");

        System.out.println("Введите вес животного");
        asd(scanner, "weight");


        System.out.println("Введите цвет животного");
        Animal.setColor(scanner.next());
        IS_TRUE = false;
    }

    private static void asd(Scanner scanner, String type) {
        while (true) {
            if (scanner.hasNextInt()) {
                switch (type) {
                    case "age":
                        Animal.setAge(Integer.parseInt(scanner.nextLine()));
                        break;
                    case "weight":
                        Animal.setWeight(Integer.parseInt(scanner.nextLine()));
                        break;
                }
                break;
            } else {
                System.out.println("Вы ввели некорректные данные, попробуйте снова");
                scanner.nextLine();
            }
        }
    }
}