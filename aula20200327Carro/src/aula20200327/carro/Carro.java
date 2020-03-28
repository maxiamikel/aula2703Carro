package aula20200327.carro;

public class Carro {
	public double combustivel = 0.00;
	public boolean ligado = false;
	
	public Carro() {
		this.combustivel = 0.00;
		this.ligado = false;
	}
	
	public void abastecer (double volumeEmLitros) {
		combustivel = volumeEmLitros;
	}
	
	public void ligar() {
		if(this.combustivel >= 0.250) {
			combustivel = combustivel - 0.250;
			ligado = true;
		}
	}
	
	public void desligar() {
		ligado = false;
	}
	
	public void acelerar() {
		if(this.combustivel >= 0.250) {
			combustivel = combustivel - 0.250;
		} else {
			ligado = false;
		}
	}

	public boolean isLigado() {
		return (ligado == true);
	}
	
	public boolean isDesligado() {
		return (ligado == false);
	}
}
