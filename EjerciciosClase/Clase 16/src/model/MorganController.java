package model;


public static MorganController{
	//atributes
	private String name;
	private String id;
	
	
	//relations
	private Ship ships;
	private Client client1;
	private Client client2;
	private Client client3;
	private Client client4;
	private Client client5;
	
	//Methods
	public MorganController(String id, String name, String nameShip, double minimum, double maximum){
		this.id = id;
		this.name = name;
		
		ships = new Ship(nameShip, minimum, maximum);
		
		client1 = null;
		client2 = null;
		client3 = null;
		client4 = null;
		client5 = null;
	}
	
	public void updateInfoShip(int option, String newNameS, double newLimMin , double newLimMax){
		
		switch(option){
			
			case 1://Update ship's name
				pirate.setName(newNameS);
			
		}
		
	}
	
	public String addClient(String nitClient, String nameClient){
		
		String message = "Client Existosamente creado";
		
		boolean available = availableClient();
		
		if(available){
			
			Client objTemporal = searchClient(nitClient);
			
			if(objTemporal == null){
				
				objTemporal = new Client(nitCliente, nameClient);
				
				if(c1ient1 == null){
					client1 = objTemporal;
				}else if(client2){
					client2 = objTemporal;
				}else if(client3){
					client3 = objTemporal;
				}else if(client4){
					client4 = objTemporal;
				}else if(client5){
					client5 = objTemporal;
				}
				
			} else {
				message = "Error: El cliente ya existe"
			}
			
		}else{
			message = "Error: No se puede agregar mas clientes";
		}
		
		return message;
		
	}
}