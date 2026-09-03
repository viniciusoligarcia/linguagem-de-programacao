public class Main {
    public static void main(String[] args) {
        String[] produtos = {
            "Arroz",
            "Feijão",
            "Macarrão",
            "Leite",
            "Café"
        };
        System.out.println("Produtos usando foreach:");

        for (String produto : produtos) {
            System.out.println(produto);
        }
        System.out.println("\nProdutos usando for:");

        for (int i = 0; i < produtos.length; i++) {
            System.out.println(produtos[i]);
        }
    }
}