
public class Main {
	
	private ListaDeVehiculos listaDeVehiculos;
	
	public Main(){
		listaDeVehiculos = new ListaDeVehiculos();
		listaDeVehiculos.cargarVehiculo(new Auto("peugeot", "206", Detalle.PUERTAS, 200000.00));
		listaDeVehiculos.cargarVehiculo(new Moto("honda", "titan", Detalle.CILINDRADA, 60000.00));
		listaDeVehiculos.cargarVehiculo(new Auto("peugeot", "208", Detalle.PUERTAS, 250000.00));
		listaDeVehiculos.cargarVehiculo(new Moto("yamaha", "ybr",Detalle.CILINDRADA, 80500.50));
	}

	public static void main(String[] args) {
		
		

	}

}
