package aula14B;

public class Video implements AcoesVideos{
	private String titulo;
	private int avaliacao;
	private int viwes;
	private int curtidas;
	private boolean reproduzindo;
	
	public Video(String titulo) {
		this.titulo = titulo;
		avaliacao = 1;
		viwes = 0;
		curtidas = 0;
		reproduzindo = false;
	}
	
	@Override
	public void play() {
		this.reproduzindo = true;
	}

	@Override
	public void pause() {
		this.reproduzindo = false;
	}

	@Override
	public void like() {
		this.curtidas++;
	}
	
	
	//GET E SET
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(int avaliacao) {
		int media = 0;
		media = (int) this.avaliacao + avaliacao / this.viwes;
		this.avaliacao = media;
	}
	public int getViwes() {
		return viwes;
	}
	public void setViwes(int viwes) {
		this.viwes = viwes;
	}
	public int getCurtidas() {
		return curtidas;
	}
	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}
	public boolean isReproduzindo() {
		return reproduzindo;
	}
	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}

	@Override
	public String toString() {
		return "Video [titulo= " + titulo + ", avaliacao= " + avaliacao + ", viwes= " + viwes + ", curtidas= " + curtidas
				+ ", reproduzindo= " + reproduzindo + "]";
	}
	


	

}
