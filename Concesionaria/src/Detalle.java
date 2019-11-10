import java.text.DecimalFormat;

public enum Detalle {  
	
	PUERTAS("Puertas"), CILINDRADA("Cilindrada");
	
	private String nombreModelo;
	private Integer cantidad;
	
	private Detalle(String nombreModelo) {
		this.nombreModelo = nombreModelo;
	}

	private Detalle(String nombreModelo, Integer cantidad) {
		this.nombreModelo = nombreModelo;
		this.cantidad = cantidad;
	}

	public String getNombreModelo() {
		return nombreModelo;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	@Override
	public String toString() {
		return getNombreModelo() + " : " + new DecimalFormat().format(getCantidad());
	}
}
	
