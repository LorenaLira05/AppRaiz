package AplicativoSemente;

public class Armazem {
	private int id;
	private String nome;
	private int endereco_id;
	private int municipio_id;
	
	public Armazem() {
	}
	
	public Armazem(int id, String nome, int endereco_id, int municipio_id) {
		this.id = id;
		this.nome = nome;
		this.endereco_id = endereco_id;
		this.municipio_id = municipio_id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getEndereco_id() {
		return this.endereco_id;
	}
	
	public void setEndereco_id(int endereco_id) {
		this.endereco_id = endereco_id;
	}
	
	public int getMunicipio_id() {
		return this.municipio_id;
	}
	
	public void setMunicipio_id(int municipio_id) {
		this.municipio_id = municipio_id;
	}

}

