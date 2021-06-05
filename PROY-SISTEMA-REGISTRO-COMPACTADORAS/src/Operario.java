
public class Operario extends Persona{
	private String Apodo;
	//constructor no deber�a tener el par�metro Apodo:implementar m�todo para Apodo
	public Operario(String DNI,String Nombre,String Apellido,String Apodo) {
		super(DNI,Nombre,Apellido);
		this.Apodo=Apodo;
	}
	public String getApodo() {return Apodo;}
	public void setApodo(String apodo) {Apodo = apodo;}
	@Override
	public String toString() {
		//mostrar nombre y primer caracter de apellido en un solo STRING
		return "\n"+Nombre+" "+Apellido.charAt(0)+"\nApodo: " + Apodo ;
	}
	

}
