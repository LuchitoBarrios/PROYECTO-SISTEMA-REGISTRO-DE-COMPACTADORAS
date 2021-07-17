
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
		Operario oper1 = new Operario ("2017240911","Renzo","Vera");
		System.out.println(oper1);
		System.out.println("//");
		System.out.println("//");
		System.out.println("Probando TicketPesaje");
		System.out.println("\n***************PRIMER TICKET***************");
		TicketPesaje<Object> ticket1 = new TicketPesaje<Object>(1,200.23,150.12,new Compactadora("ABC-321","MPA","Escombros","001-23232"),
				new Conductor("47299871","Luis","Barrios","MPA"),new Operario("4567771","Renzo","Vera"));
		System.out.println(ticket1);
		
		System.out.println("\n***************SEGUNDO TICKET***************");
		TicketPesaje<Object> ticket2 = new TicketPesaje<Object>(2,390.32,234.08,new Compactadora("DEF-566","MPA","Escombros","001-23232"),
				new Conductor("46790971","Juan","Peña","MPA"),new Operario("4555620","Roberto","Talavera"));
		System.out.println(ticket2);
		
		System.out.println("\n***************TERCER TICKET***************");
		TicketPesaje<Object> ticket3 = new TicketPesaje<Object>(3,395.32,210.08,new Compactadora("DEF-111","PRIVADA","Radioactivos","001-232131"),
				new Conductor("46790666","Adriana","Linares","PRIVADA"),new Operario("45556663","Luis","Barrios"));
		System.out.println(ticket2);
		
		//Implementar un método que almacene tickets de pesaje en una lista enlazada
		//Implementar un método que retorne los tickets insertados en la lista enlazada
		ListLinked<Object> ListaTickets = new ListLinked<Object>();
		ListaTickets.insertFirst(ticket1);
		ListaTickets.insertFirst(ticket2);
		ListaTickets.insertFirst(ticket3);
		System.out.println("\n***************Tickets***************");
		System.out.println(ListaTickets.toString());
		System.out.println("\n*************************************");
		System.out.println("\n*************************************");
		System.out.println("\n***************HASHING***************");
		
		HashC tickets= new HashC(5);
		tickets.insert(1, ListaTickets);
		//tickets.insert(2, ListaTickets2);
		System.out.println("\n");
		System.out.println(tickets);
		System.out.println("\n***********BUSCANDO TICKET***********");
		System.out.println(tickets.search(1));
		
	}
}
