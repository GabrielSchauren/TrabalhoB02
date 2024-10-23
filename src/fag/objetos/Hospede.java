package fag.objetos;

public class Hospede {
	
	private String nome;
	private Integer data;
	private Integer Reservados;
	private String tipoReservado;
	
	
	
	
	public Hospede() {
		
	}
	
public Hospede(String nome, Integer data, Integer Reservados, String tipoReservado) {
	this.nome = nome;	
	this.data = data;
	this.Reservados = Reservados;
	this.tipoReservado = tipoReservado;
	}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public Integer getData() {
	return data;
}

public void setData(Integer data) {
	this.data = data;
}

public Integer getReservados() {
	return Reservados;
}

public void setReservados(Integer reservados) {
	this.Reservados = reservados;
}

public String getTipoReservado() {
	return tipoReservado;
}

public void setTipoReservado(String tipoReservado) {
	this.tipoReservado = tipoReservado;
}

@Override
public String toString() {
	return "Hospede [nome=" + nome + ", data=" + data + ", Reservados=" + Reservados + ", tipoReservado="
			+ tipoReservado + "]";
}





	
	

}
