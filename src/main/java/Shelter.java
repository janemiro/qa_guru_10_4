public class Shelter {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Клава", 10, true, "необходимы перевязки ещё месяц");
        System.out.println(cat1);

        Cat cat2 = new Cat("Рыжик", 3, false, "Рыжик - наглая пушистая задница");
        System.out.println(cat2);

        Dog dog1 = new Dog("Лаки", 5, false, "она любит играть в мячик");
        System.out.println(dog1);

        Dog dog2 = new Dog("Юля", 1, false, "это супер-собака");
        System.out.println(dog2);

        Bird bird1 = new Bird("Джонатан Ливингстон", 50, true, "сломано крыло");
        System.out.println(bird1);
    }

}