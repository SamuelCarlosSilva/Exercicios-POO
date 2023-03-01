public class App {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("calabresa");
        pizza.adcionarIngredientes(7);
        System.out.println(pizza.gerarNotaFiscal());
    }
}
