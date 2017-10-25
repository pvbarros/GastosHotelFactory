package factory.method;

public class Cerveja implements Gastos{

	@Override
	public void exibirInfo() {
		System.out.println("Gasto: Cerveja\nTipo de gasto: Consumo");
	}

}
