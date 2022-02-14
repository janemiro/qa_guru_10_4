public class Bird {
    private final String name;
    private final int age;
    private final boolean isHelpNeeded;
    private final String note;

    public Bird(String name, int age, boolean isHelpNeeded, String note) {
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

    public boolean isHelpNeeded() {
        return isHelpNeeded;
    }

    public String getNote() {
        return note;
    }

    @Override
    public String toString() {
        return "Птица " +
                this.name + ", " +
                "возраст " + this.age + ". " +
                "Нуждается в особом уходе: " + this.isHelpNeeded + ", " +
                "Обратите внимание, что " + this.note + "!";
    }
}