public class Main {
    public static void main(String[] args) {
        Strategy strategy1 = new StrategyImpl1();
        Strategy strategy2 = new StrategyImpl2();

        // Executando as estratégias
        strategy1.execute();
        strategy2.execute();
    }
}

interface Strategy {
    void execute();
}

class StrategyImpl1 implements Strategy {
    @Override
    public void execute() {
        System.out.println("Comprar ação Petr4");
    }
}

class StrategyImpl2 implements Strategy {
    @Override
    public void execute() {
        System.out.println("Executar a venda da Goll4");
    }
}