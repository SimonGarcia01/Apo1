package model;

//You dont need to import packages that are already in the same package
// import model.Ship;
// import model.Client;
import java.util.Calendar;

public class MorganController{
	//atributes
	private String name;
	private String id;
	
	
	//relations
	private Ship ships;
	private Client[] clients;

	//old relationship with independant clients
	// private Client client1;
	// private Client client2;
	// private Client client3;
	// private Client client4;
	// private Client client5;
	
	//Methods
	public MorganController(String id, String name, String nameShip, double minimum, double maximum){
		this.id = id;
		this.name = name;
		
		this.ships = new Ship(nameShip, minimum, maximum);

		this.clients = new Client[5];

		//Done by single client at a time
		// client1 = null;
		// client2 = null;
		// client3 = null;
		// client4 = null;
		// client5 = null;

		//To test the available method
		// client1 = new Client();
		// client2 = new Client();
		// client3 = new Client();
		// client4 = new Client();
		// client5 = new Client();
	}
	
	public String updateInfoShip(int option, String newNameS, double newLimMin , double newLimMax){
		
		String update = "Se cambio ";

		switch(option){
			
			case 1://Update ship's name
				ships.setName(newNameS);
				update = update + "el nombre a " + newNameS;
				break;
			case 2:
				ships.setLimMin(newLimMin);
				update = update + "el Limite minimo a " + newLimMin;
				break;
			case 3:
				ships.setLimMax(newLimMax);
				update = update + "el Limite maximo a " + newLimMax;
				break;
			default:
				update = "Opcion invalida";
			
		}
		return update;
	}
	
	public String addClient(String name, String registrationNumber, Calendar registrationDate, String nit,
    double transportedKilos, double payments){
		
		String message = "";
		
		//First, check if there is space to register a new client
		
		boolean available = availableClient();
		
		//Old method for single clients
		// boolean available = availableClient(client1, client2, client3, client4, client5);
		
		if(available){
			//Second, check if the client we want to add already exists 
			
			boolean clientExists = searchClient(nit);

			//Old method for single client
			//boolean clientExists = searchClient(nit);

			if (clientExists){
				message = "El cliente ya existe, ingrese otro.";
			} else {
				//Third, assign the new client to a free space
				

				Client temporalClient = new Client(name, registrationNumber, registrationDate, 
				nit, transportedKilos, payments);
				message = storingPositionClient(temporalClient);
			}
		}else{
			message = "Error: No hay mas espacio para otro cliente.";
		}
		
		return message;
		
	}

	public boolean availableClient(){
		boolean availableSpace = false;

		for(Client client : clients){

			if(client==null){
				availableSpace = true;
			}

		}

		return availableSpace;
	}

	//Old method for single clients
	// public boolean availableClient(Client client1, Client client2, Client client3, Client 
	// client4, Client client5){
	// 	boolean space = false;

	// 	if(client1==null||client2==null||client3==null||client4==null||client5==null){
	// 		space = true;
	// 	}

	// 	return space;
	// }

	public boolean searchClient(String nit){
		boolean duplicate = false;

		for(Client client:clients){
			if(client != null && client.getNit().equals(nit)){
				duplicate = true;
			}
		}

		return duplicate;
	}

	//Old method for single clients
	// public boolean searchClient(String nit){

	// 	boolean findNit= false;

	// 	if(client1 != null && client1.getNit().equals(nit)){
	// 		findNit = true;
	// 	}else if(client2 != null && client2.getNit().equals(nit)){
	// 		findNit = true;
	// 	}else if(client3 != null && client3.getNit().equals(nit)){
	// 		findNit = true;
	// 	}else if(client4 != null && client4.getNit().equals(nit)){
	// 		findNit = true;
	// 	}else if(client5 != null && client5.getNit().equals(nit)){
	// 		findNit = true;
	// 	}

	// 	return findNit;

	// }

	public String storingPositionClient(Client temporal) {
		String message = "";
		boolean added = false;

		for (int i = 0; i < clients.length && !added; i++) {
			if (clients[i] == null) {
				clients[i] = temporal;
				message = "El Cliente fue agregado con exito";
				added = true;
			}
		}

		if (!added) {
			message = "Error: No hay espacio disponible para agregar al cliente.";
		}

		return message;
	}

	//Old method for single cliente
	// public String storingPositioClient(Client temporal){

	// 	if(client1==null){
	// 		client1 = temporal;
	// 	}else if(client2==null){
	// 		client2 = temporal;
	// 	}else if(client3==null){
	// 		client3 = temporal;
	// 	}else if(client4==null){
	// 		client4 = temporal;
	// 	}else {
	// 		client5 = temporal;
	// 	}

	// 	return "El cliente se ha guardado exitosamente.";
	// }
	
	public String displayAllClients(){
		String message = "";

		for(Client client:clients){

			if(client != null){
				message += client.toString();
			}

		}

		return message;
	}

	//Old method for single clients
	// public String displayAllClients(){
	// 	String allClients= "";

	// 	if(client1!=null) {
	// 		allClients = allClients + client1.toString();
	// 	}

	// 	if(client2!=null) {
	// 		allClients = allClients + client2.toString();
	// 	}

	// 	if(client3!=null) {
	// 		allClients = allClients + client3.toString();
	// 	}

	// 	if(client4!=null) {
	// 		allClients = allClients + client4.toString();
	// 	}

	// 	if(client5!=null) {
	// 		allClients = allClients + client5.toString();
	// 	}

	// 	return allClients;
	// }

	//Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Ship getShips() {
		return ships;
	}

	public void setShips(Ship ships) {
		this.ships = ships;
	}

	public Client[] getClients() {
		return clients;
	}

	public void setClients(Client[] clients) {
		this.clients = clients;
	}
	
}