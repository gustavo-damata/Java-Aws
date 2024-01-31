// Facade.java
public class Facade {
    private Subsystem1 subsystem1;
    private Subsystem2 subsystem2;

    public Facade() {
        this.subsystem1 = new Subsystem1();
        this.subsystem2 = new Subsystem2();
    }

    public void operation() {
        subsystem1.operation1();
        subsystem2.operation2();
    }
}

// Subsystem1.java
class Subsystem1 {
    public void operation1() {
        System.out.println("Operação 1 realizada pelo Subsistema 1");
    }
}

// Subsystem2.java
class Subsystem2 {
    public void operation2() {
        System.out.println("Operação 2 realizada pelo Subsistema 2");
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.operation();
    }
}