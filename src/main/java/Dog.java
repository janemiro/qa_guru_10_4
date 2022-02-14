public class Dog {
    private final String name;
    private final int age;
    private final boolean isHelpNeeded;
    private final String note;

    public Dog(String name, int age, boolean isHelpNeeded, String note) {
        this.name = name;
        this.age = age;
        this.isHelpNeeded = isHelpNeeded;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean getIsHelpNeeded() {
        return isHelpNeeded;
    }

    public String getNote() {
        return note;
    }

    public String toString() {
        return "Собака " +
                this.name + ", " +
                "возраст " + this.age + ". " +
                "Нуждается в особом уходе: " + this.isHelpNeeded + ", " +
                "Обратите внимание, что " + this.note + "!";
    }
}