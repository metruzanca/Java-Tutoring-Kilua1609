class HelloWorld {

    public static void log(String str) {
        System.out.println(str);
    }

    public static void main(String[] argv) {
        Gatto g = new Gatto("Garfield", 2, false);
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

    public Gatto(String name, Integer age) {
        this.name = name;
        this.age = age;
        this.alive = true;
    }

    public String isAlive() {
        if (alive) {
            return "I'm name " + name + ". im " + age + " old";
        } else {
            return "I'm dead";
        }
        // TODO Ternary operator
    }
}