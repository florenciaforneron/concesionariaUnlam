import java.text.DecimalFormat;

public abstract class Vehiculo implements Comparable<Vehiculo>{
	
	private String marca;
	private String modelo;
	private Double precio;
	private Detalle detalle;
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Detalle getDetalle() {
		return detalle;
	}
	public void setDetalle(Detalle detalle) {
		this.detalle = detalle;
	}
	
	
		@Override
		public int compareTo(Vehiculo o) {
			if (getPrecio() < o.getPrecio()) {
				return -1;
			}
			if (getPrecio() > o.getPrecio()) {
				return 1;
			}
			return 0;
		}

		
		@Override
		public String toString() {
			return String.join(" /// ", getModelo(), getDetalle().toString(),
					"Precio: " + new DecimalFormat("$").format(getPrecio()));
		}
	
	
	
	


}
