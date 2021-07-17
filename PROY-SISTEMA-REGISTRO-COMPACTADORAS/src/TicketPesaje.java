import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class TicketPesaje<E> {
	private int numero;
	LocalDateTime FechaHora;
	private Double PesoIngreso;
	private Double PesoSalida;
	Compactadora compactadora;
	Conductor conductor;
	Operario operario;
	public TicketPesaje(int numero, Double pesoIngreso, Double pesoSalida, Compactadora compactadora,
			Conductor conductor, Operario operario) {
		super();
		this.numero = numero;
		PesoIngreso = pesoIngreso;
		PesoSalida = pesoSalida;
		this.compactadora = compactadora;
		this.conductor = conductor;
		this.operario = operario;}
	public int getNumero() {return numero;}
	public void setNumero(int numero) {this.numero = numero;}
	public Double getPesoIngreso() {return PesoIngreso;}
	public void setPesoIngreso(Double pesoIngreso) {PesoIngreso = pesoIngreso;}
	public Double getPesoSalida() {return PesoSalida;}
	public void setPesoSalida(Double pesoSalida) {PesoSalida = pesoSalida;}
	public double PesoNeto (Double pesoIngreso2, Double pesoSalida2) {
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
	public String toString() {
		return " \nHora / Fecha: "+ FechaHora() +"\n\tTICKET DE PESAJE"+"\nNumero\t\t\t= " + numero 
				+ " \nPesoIngreso\t\t= " + PesoIngreso
				+ " \nPesoSalida\t\t= " + PesoSalida + "\nPeso Neto\t\t= "
				+ PesoNeto(PesoIngreso,PesoSalida) +" \n\t  COMPACTADORA" + compactadora 
				+ " \n\t   CONDUCTOR" + conductor
				+ " \n\t   OPERARIO" 
				+ " \nOperario\t\t= " + operario ;
	}}
