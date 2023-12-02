public class Cat extends Animal{

    public Cat(String name, int age, int weight, String color) {
        Animal.name = name;
        Animal.age = age;
        Animal.weight = weight;
        Animal.color = color;
    }


    @Override
    public void say() {
        System.out.println("Я говорю Мяу");
    }
}
