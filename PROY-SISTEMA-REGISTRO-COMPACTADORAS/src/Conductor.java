
public class Conductor extends Persona{
	private String RazonSocial;
	public Conductor(String DNI,String Nombre,String Apellido,String RazonSocial) {
		super(DNI,Nombre,Apellido);
		this.RazonSocial=RazonSocial;
	}
	public String getRazonSocial() {return RazonSocial;}
	public void setRazonSocial(String razonSocial) {RazonSocial = razonSocial;}
	@Override
	public String toString() {
		return "\nDNI Conductor \t\t= "+this.DNI+
				"\nConductor \t\t= "+this.Nombre+" "+this.Apellido+
				"\nRazon Social \t\t= "+this.RazonSocial;
	}}
