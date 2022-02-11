public class Cats {
    private final String name;
    private final int age;
    private final boolean needsHelp;
    private final String note;

    public Cats(String name, int age, boolean needsHelp, String note) {
        this.name = name;
        this.age = age;
        this.needsHelp = needsHelp;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean getNeedsHelp() {
        return needsHelp;
    }

    public String getNote() {
        return note;
    }

    public String toString() {
        return "Кошка " +
                this.name + ", " +
                "возраст " + this.age + ". " +
                "Нуждается в особом уходе: " + this.needsHelp + ", " +
                "Обратите внимание, что " + this.note + "!";
    }
}