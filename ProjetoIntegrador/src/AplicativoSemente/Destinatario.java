package AplicativoSemente;

public class Destinatario {
	private int id;
	private int endereco_id;
	private int usuario_id;
	
	public Destinatario() {
	}
	
	public Destinatario(int id, int endereco_id, int usuario_id) {
		this.id = id;
		this.endereco_id = endereco_id;
		this.usuario_id = usuario_id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getEndereco_id() {
		return this.endereco_id;
	}
	
	public void setEndereco_id(int endereco_id) {
		this.endereco_id = endereco_id;
	}
	
	public int getUsuario_id() {
		return this.usuario_id;
	}
	
	public void setUsuario_id(int usuario_id) {
		this.usuario_id = usuario_id;
	}

}

