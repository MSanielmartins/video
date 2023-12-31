package aula14B;

public abstract class Pessoa {
	private String nome;
	private int idade;
	private String sexo;
	private int experiencia;
	
	//CONSTRUTOR
	
	public Pessoa(String nome, int idade, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		experiencia = 0;
	}
	//METODOS DA CLASSE
	
	public void ganharExperiencia() {
		
	}
	//GET E SET

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade= " + idade + ", sexo= " + sexo + ", experiencia= " + experiencia + "]";
	}
	
	
	
	
	

}
