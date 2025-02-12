public class Desafio {
    public static void main(String[] args) {
        double nota1 = 4.7;
        double nota2 = 8.8;
        double media = (nota1 + nota2) /2;
        int mediaCasting = (int) media;
        char caractere = 'a';
        String palavra = "Terra";
        String concatenado = caractere + palavra;
        int quantidade = 5;
        double precoProduto = 20 * quantidade;
        double valorEmDolares  = 35;
        double valorEmReais = valorEmDolares * 4.94;
        double precoOriginal = 23;
        double percentualDesconto = 10;
        double valoFinal = precoOriginal - (precoOriginal * percentualDesconto/100);


        System.out.printf("""
                1. Media: %.2f
                2. Media casting Int: %d
                3. Concatenado caractere e palavra: %s
                4. Preço do produto: R$%.2f
                5. Valor convertido em Reais: R$%.2f
                6. Valor com desconto: R$%.2f
                %n""", media, mediaCasting, concatenado, precoProduto, valorEmReais, valoFinal);


    }
}
