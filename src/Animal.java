public class Animal {
    public static String name;
    public static int age;
    public static int weight;
    public static String color;
    public static String pet;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void say() {
        System.out.println("Я говорю ");
    }

    public void go() {
        System.out.println("Я иду ");
    }

    public void drink() {
        System.out.println("Я пью ");
    }

    public void eat() {
        System.out.println("Я ем ");
    }

    @Override
    public String toString() {

        if (age == 1) {
            pet = "Привет! Меня зовут " + name + ", мне " + age + " год" + ", я вешу " + weight + " кг, мой цвет - " + color;
        } else if (age == 2 || age == 3 || age == 4) {
            pet = "Привет! Меня зовут " + name + ", мне " + age + " года" + ", я вешу " + weight + " кг, мой цвет - " + color;
        } else {
            pet = "Привет! Меня зовут " + name + ", мне " + age + " лет" + ", я вешу " + weight + " кг, мой цвет - " + color;
        }
        return pet;
    }


}