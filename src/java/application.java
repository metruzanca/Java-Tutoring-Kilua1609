class HelloWorld {

    public static void log(String str) {
        System.out.println(str);
    }

    public static void main(String[] argv) {
        Gatto g = new Gatto("Garfield", 2, true);
        log(g.isAlive());
    }

}

class Gatto {
    String name;
    Integer age;
    Boolean alive;

    public Gatto(String name, Integer age, Boolean alive) {
        this.name = name;
        this.age = age;
        this.alive = alive;
    }

    // TODO costructor that accepts name and age with alive defaulting to true

    public String isAlive() {
        // TODO if dead say "I'm dead"
        // TODO if alive say "Im name, im age old"
        return "todo";
    }
}