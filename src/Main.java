import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Produto produto = new Produto();
		produto.ValorProduto();
		produto.ValorPago();
		produto.ValorTroco();
		produto.CalculaTrocoNegatico();
		produto.CalculaTrocoPositivo();
	}
}