package fag.objetos;

public class Cadastro_Quartos {
	
	private Integer NumeroDoQuarto;
	private String TipoDeQuarto;
	private Double PreçoDiario;
	private String Disponibilidade;
	
	
	public Cadastro_Quartos(){
		
	}
	
public Cadastro_Quartos(Integer NumeroDoQuarto, String TipoDeQuarto, Double PreçoDiario, String Disponibilidade){
		
	
	this.NumeroDoQuarto = NumeroDoQuarto;
	this.TipoDeQuarto = TipoDeQuarto;
	this.PreçoDiario = PreçoDiario;
	this.Disponibilidade = Disponibilidade;
	
	
	}

public Integer getNumeroDoQuarto() {
	return NumeroDoQuarto;
}

public void setNumeroDoQuarto(Integer numeroDoQuarto) {
	this.NumeroDoQuarto = numeroDoQuarto;
}

public String getTipoDeQuarto() {
	return TipoDeQuarto;
}

public void setTipoDeQuarto(String tipoDeQuarto) {
	this.TipoDeQuarto = tipoDeQuarto;
}

public Double getPreçoDiario() {
	return PreçoDiario;
}

public void setPreçoDiario(Double preçoDiario) {
	this.PreçoDiario = preçoDiario;
}

public String getDisponibilidade() {
	return Disponibilidade;
}

public void setDisponibilidade(String disponibilidade) {
	this.Disponibilidade = disponibilidade;
}

@Override
public String toString() {
	return "Cadastro_Quartos [NumeroDoQuarto=" + NumeroDoQuarto + ", TipoDeQuarto=" + TipoDeQuarto + ", PreçoDiario="
			+ PreçoDiario + ", Disponibilidade=" + Disponibilidade + "]";
}





	
	

}
