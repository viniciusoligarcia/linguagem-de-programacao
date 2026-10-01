public class Cesta {

    public static void main(String[] args) {

        Item[] itens = {
            new Item("Chocotone"),
            new Item("Cookies"),
            new Item("Bolo"),
            new Item("Refrigerante")
        };

        for (Item item : itens) {
            System.out.println(item.nome);
        }
    }
}