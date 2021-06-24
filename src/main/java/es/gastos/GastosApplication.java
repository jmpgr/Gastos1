package es.gastos;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

import comun.Cuenta;
import comun.MovimientoImpl;

import java.util.List;

//@SpringBootApplication
public class GastosApplication {

	public static void main(String[] args) {
		//SpringApplication.run(GastosApplication.class, args);

		final Cuenta cuenta = new Cuenta();
		final List<MovimientoImpl> movimientos = cuenta.cargarMovimientos();

		movimientos.size();
	}

}
