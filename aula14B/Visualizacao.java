package aula14B;

public class Visualizacao {
	private Gafanhoto espectador;
	private Video filme;
	public Visualizacao(Gafanhoto espectador, Video filme) {
		this.espectador = espectador;
		this.filme = filme;
		this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
		this.filme.setViwes(this.filme.getViwes() + 1);
		
	}
	//METODOS
	public void avaliacao() {
		this.filme.setAvaliacao(5);
	}
	public void avaliacao(int nota) {
		this.filme.setAvaliacao(nota);
	}
	
	public void avaliacao(float porc) {
		int tot = 0;
		if(porc >= 0 && porc <= 20) {
			tot = 3;
		}
		else if(porc > 20 && porc < 50){
			 tot = 5;
		}
		else {
			tot = 10;
		}
		this.filme.setAvaliacao(tot);
	}
	
	public Gafanhoto getEspectador() {
		return espectador;
	}
	public void setEspectador(Gafanhoto espectador) {
		this.espectador = espectador;
	}
	public Video getFilme() {
		return filme;
	}
	public void setFilme(Video filme) {
		this.filme = filme;
	}

	@Override
	public String toString() {
		return "Visualizacao [espectador=" + espectador + ", filme=" + filme + "]";
	}
	

	
	

}
