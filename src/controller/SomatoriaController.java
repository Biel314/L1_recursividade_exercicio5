package controller;

public class SomatoriaController {
	double soma = 0;
	
	public SomatoriaController() {
		super();
	}

	public double somatoria(int n) {
		
		//A condicao de parada esta definida para quando o numero chega a 1 para executar a divisao de 1/1, 1/2, 1/3.
		if(n == 1) {
			return 1.0;
		//A condicao de chamada ocorre enquanto n é maior que 1, chamando-a para ser somada com a divisao de 1/n, e com o resultado.
		} else {
			return (1.0/n) + (double) somatoria(n-1);
		}
	}
	
}