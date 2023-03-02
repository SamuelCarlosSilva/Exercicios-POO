public class App {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("calabresa");
        pizza.adcionarIngredientes(8);
        System.out.println(pizza.imprimirNotaFiscal());
    }
}
