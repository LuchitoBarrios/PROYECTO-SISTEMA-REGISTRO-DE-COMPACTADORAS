
public class Compactadora extends Vehiculo{
	private String RazonSocial;
	private String Producto;
	private String GuiaRemision;
	//constructor
	public Compactadora(String PlacaVehicular,String RazonSocial,String Producto,
			String GuiaRemision) {
		super(PlacaVehicular);
		this.RazonSocial=RazonSocial;
		this.Producto=Producto;
		this.GuiaRemision=GuiaRemision;
	}
	public String getRazonSocial() {return RazonSocial;}
	public void setRazonSocial(String razonSocial) {RazonSocial = razonSocial;}
	public String getProducto() {return Producto;}
	public void setProducto(String producto) {Producto = producto;}
	public String getGuiaRemision() {return GuiaRemision;}
	public void setGuiaRemision(String guiaRemision) {GuiaRemision = guiaRemision;}
	@Override
	public String toString() {
		return "\nPlaca Vehicular \t= "+PlacaVehicular+
				"\nRazon Social \t\t= "+ RazonSocial + 
				"\nProducto \t\t= " + Producto + 
				"\nGuia de Remision \t= " + GuiaRemision;
	}
}
