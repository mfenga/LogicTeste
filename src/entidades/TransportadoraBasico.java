package entidades;

public abstract class TransportadoraBasico implements Transportadoras {
	public Double distancia;
	public String transporte;
	public String prioridade;


public Double distancia() {
	return distancia;
}

public String transporte() {
	return transporte;
}

public String prioridade() {
	return prioridade;
}
}