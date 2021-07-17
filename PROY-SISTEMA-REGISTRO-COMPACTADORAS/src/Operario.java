
public class Operario extends Persona{
	private String Apodo;
	public Operario(String DNI,String Nombre,String Apellido) {
		super(DNI,Nombre,Apellido);
		Apodo=Nombre+Apellido.charAt(0);
	}
	public String getApodo() {return Apodo;}
	public void setApodo(String apodo) {Apodo = apodo;}
	@Override
	public String toString() {
		return getApodo() ;
	}}
