import java.text.DecimalFormat;

public class Auto extends Vehiculo{
	
	public Auto(String marca,String modelo, Detalle detalle, Double precio) {
		setModelo(modelo);
		setMarca(marca);
		setPrecio(precio);
		setDetalle(detalle);
	}

	@Override
	public String toString() {
		return String.join(" /// ", getModelo(), getDetalle().toString(),
				new DecimalFormat("$").format(getPrecio()));
	}

}
