
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Probando compactadoras");
		Compactadora c1 = new Compactadora("ABC-123","MPA","Residuos Sólidos","001-23232");
		System.out.println(c1);
		System.out.println("//");
		System.out.println("//");
		System.out.println("Probando conductores");
		Conductor cond1 = new Conductor("47299871","Luis","Barrios","MPA");
		System.out.println(cond1);
		System.out.println("//");
		System.out.println("//");
		System.out.println("Probando operarios");
		Operario oper1 = new Operario ("2017240911","Renzo","Vera","RenzoV");
		System.out.println(oper1);
		System.out.println("//");
		System.out.println("//");
		System.out.println("Probando TicketPesaje");
		TicketPesaje ticket1 = new TicketPesaje("001",200.23,150.12,new Compactadora("ABC-321","MPA","Escombros","001-23232"),
				new Conductor("47299871","Luis","Barrios","MPA"),new Operario("4567771","Renzo","Vera","RenzoV"));
		System.out.println(ticket1);
	}

}
