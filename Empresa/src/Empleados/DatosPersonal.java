package Empleados;
import java.util.Date;
import java.util.GregorianCalendar;

public class DatosPersonal {
		// METODO constructor//
		public DatosPersonal (String nom, int dni, int edad, double sueldo, int year, int mes, int dia) {

			this.sueldo = sueldo;
			this.edad = edad;
			nombre = nom;
			GregorianCalendar contadorDeDia = new GregorianCalendar(year, mes - 1, dia);
			antiguedad = contadorDeDia.getTime();
			this.dni = dni;
		}

		// METODOS//
		public String dameNombre() // GETTER//
		{
			return nombre;
		};
		public int dameDni() // GETTER//
		{
			return dni;
		};

		
		public double dameSueldo() // GETTER//
		{
			return this.sueldo;
		};

		public int dameEdad() // GETTER//
		{
			return edad;
		};

		public Date dameDias() // GETTER//
		{
			return antiguedad;
		};

		public void subeSueldo(double porcentaje) // GETTER//
		{
			double aumento = sueldo + porcentaje / 100;
			sueldo += aumento;
		};

//Atributos//
		private String nombre;
		private int dni;
		private int edad;
		private double sueldo;
		private Date antiguedad;

	}// cierre de clase//
