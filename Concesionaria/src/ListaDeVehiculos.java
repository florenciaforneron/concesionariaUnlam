
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ListaDeVehiculos {
	
	List<Vehiculo> listaDeVehiculos = new ArrayList<Vehiculo>();

	
	public ListaDeVehiculos() {
	}

	public ListaDeVehiculos(Vehiculo vehiculo) {
		cargarVehiculo(vehiculo);
	}

	
	public void cargarVehiculo(Vehiculo vehiculo) {
		listaDeVehiculos.add(vehiculo);
	}

	public void ordernarListaDeVehiculos() {
		Collections.sort(listaDeVehiculos);
	}

	public void imprimirListaVehiculo() {
		for (Vehiculo v : listaDeVehiculos) {
			System.out.println("Nombre: " + v.toString());
		}
		imprimirEstadistico();
	}

	public void imprimirEstadistico() {
		System.out.println("=====================================================");
		System.out.println("Producto más caro: " + Collections.max(listaDeVehiculos).getMarca());
		System.out.println("Producto más barato: " + Collections.min(listaDeVehiculos).getMarca());
	}
	
	public void imprimirMarcaConLetraY(){
		
				listaDeVehiculos.stream().filter(vehiculo->vehiculo.getMarca().contains("y"));
				System.out.println(listaDeVehiculos);
		
				
	}
	
	



}
