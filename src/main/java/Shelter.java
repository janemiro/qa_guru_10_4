public class Shelter {

    public static void main(String[] args) {

        Cats cat1 = new Cats("Клава", 10, true, "необходимы перевязки ещё месяц");
        System.out.println(cat1);

        Cats cat2 = new Cats("Рыжик", 3, false, "Рыжик - наглая пушистая задница");
        System.out.println(cat2);

        Dogs dog1 = new Dogs("Лаки", 5, false, "она любит играть в мячик");
        System.out.println(dog1);

        Dogs dog2 = new Dogs("Юля", 1, false, "это супер-собака");
        System.out.println(dog2);

        Birds bird1 = new Birds("Джонатан Ливингстон", 50, true, "сломано крыло");
        System.out.println(bird1);
    }

}