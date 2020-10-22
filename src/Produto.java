import java.util.Scanner;

public class Produto {
	public Scanner Ler = new Scanner(System.in);
	public double Produto;
	public double Pago;
	public double Troco;

	public void ValorProduto() {
		System.out.printf("Informe o Valor do produto: ");
		Produto = Ler.nextDouble();
	}

	public void ValorPago() {
		System.out.printf("Informe o Valor do pagamento: ");
		Pago = Ler.nextDouble();
	}

	public void ValorTroco() {
		Troco = (Pago - Produto);
	}

	public void CalculaTrocoNegatico() {
		while (Troco < 0) {
			System.out.println("!!ACEITO APENAS PAGAMENTO ACIMA OU IGUAL AO VALOR DO PRODUTO!!");
			System.out.printf("Informe o Valor do produto: ");
			Produto = Ler.nextDouble();

			System.out.printf("Informe o Valor do pagamento: ");
			Pago = Ler.nextDouble();

			Troco = (Pago - Produto);
		}
	}

	public void CalculaTrocoPositivo() {
		if (Troco == 0) {
			System.out.println("Fim da transação. Não há troco");
		} else {
			System.out.println("Fim da transação. Seu troco: R$" + Troco);
		}

	}
}