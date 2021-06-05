import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

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
	//Implementar un m�todo que retorne la diferencia entre peso de ingreso y peso de salida
	//Implementar un m�todo que almacene tickets de pesaje en una lista enlazada
	//Implementar un m�todo que retorne los tickets insertados en la lista enlazada
	public double DiferenciaPeso (Double pesoIngreso2, Double pesoSalida2) {
		double num = pesoIngreso2 - pesoSalida2;
		return Math.round(num *100.0)/100.0;}
	
	public String FechaHora()
	{
		Date objDate = new Date();
		String strDateFormat = "HH:mm:ss yyyy/MM/dd";
		SimpleDateFormat  objSDF = new SimpleDateFormat(strDateFormat);
		return objSDF.format(objDate);
	}
	@Override
	public String toString() {//FALTA OPTIMIZAR TOSTRING Y MEJORAR EL DISE�O DE SALIDA
		return " \nHora / Fecha: "+ FechaHora() +"\nTicketPesaje \nNumero        = " + numero + " \nPesoIngreso   = " + PesoIngreso
				+ " \nPesoSalida    = " + PesoSalida + "\nDiferencia    = "+ DiferenciaPeso(PesoIngreso,PesoSalida) +" \nCompactadora=" + compactadora + ", \nconductor=" + conductor
				+ " \nOperario" + operario ;
	}
	

}
