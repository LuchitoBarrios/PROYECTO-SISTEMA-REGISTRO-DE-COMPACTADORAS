import java.time.LocalDateTime;

public class TicketPesaje<E> {
	private String numero;
	LocalDateTime FechaHora; //darle formato
	private Double PesoIngreso;
	private Double PesoSalida;
	Compactadora compactadora;
	Conductor conductor;
	Operario operario;
	//private ListLinked<E> ListaTickets;
	//constructor
	public TicketPesaje(String numero, Double pesoIngreso, Double pesoSalida, Compactadora compactadora,
			Conductor conductor, Operario operario) {
		super();
		this.numero = numero;
		PesoIngreso = pesoIngreso;
		PesoSalida = pesoSalida;
		this.compactadora = compactadora;
		this.conductor = conductor;
		this.operario = operario;
	}
	public String getNumero() {return numero;}
	public void setNumero(String numero) {this.numero = numero;}
	public Double getPesoIngreso() {return PesoIngreso;}
	public void setPesoIngreso(Double pesoIngreso) {PesoIngreso = pesoIngreso;}
	public Double getPesoSalida() {return PesoSalida;}
	public void setPesoSalida(Double pesoSalida) {PesoSalida = pesoSalida;}
	//Implementar un método que retorne la diferencia entre peso de ingreso y peso de salida
	//Implementar un método que almacene tickets de pesaje en una lista enlazada
	//Implementar un método que retorne los tickets insertados en la lista enlazada
	@Override
	public String toString() {//FALTA OPTIMIZAR TOSTRING Y MEJORAR EL DISEÑO DE SALIDA
		return FechaHora.now()+//LA FECHA DEBE TENER UN FORMATO
				"\nTicketPesaje [\nnumero=" + numero + ", \nFechaHora=" + FechaHora + ", \nPesoIngreso=" + PesoIngreso
				+ ", \nPesoSalida=" + PesoSalida + ", \ncompactadora=" + compactadora + ", \nconductor=" + conductor
				+ ", \noperario=" + operario + "]";
	}
	

}
