package Empleados;

import java.util.*;

public class Empleados {
	public static void main(String[] args) {

		DatosPersonal empleado1 = new DatosPersonal ("Brandon Maciel", 39064996, 25, 45000, 2021, 01, 25);
		DatosPersonal empleado2 = new DatosPersonal ("Jaquelina Lopez", 36402782, 29, 60000, 2021, 10, 23);
		DatosPersonal empleado3 = new DatosPersonal ("Gabriel Gomez", 37654321, 35, 55000, 2015, 03, 01);
		DatosPersonal empleado4 = new DatosPersonal ("Ricardo Perez", 3456789, 55, 75000, 2020, 04, 11);
		DatosPersonal empleado5 = new DatosPersonal ("Alberto Fernandez", 20356029, 75,150000, 2019,8, 21);

		empleado1.subeSueldo(1);
		 System.out.println ("DATOS DE EMPLEADOS:");
	     System.out.println("         Nombre y Apellido: "+ empleado1.dameNombre() + "          Edad: "+ empleado1.dameEdad() + "            Dni: " + empleado1.dameDni() + "          Año de ingreso: " + empleado1.dameDias() +"      sueldo mensual " + empleado1.dameSueldo() );
	     System.out.println("         Nombre y Apellido: "+ empleado2.dameNombre() + "         Edad: "+ empleado2.dameEdad() + "            Dni: " + empleado2.dameDni() + "          Año de ingreso: " + empleado2.dameDias() +"      sueldo mensual " + empleado2.dameSueldo() );
	     System.out.println("         Nombre y Apellido: "+ empleado3.dameNombre() + "           Edad: "+ empleado3.dameEdad() + "            Dni: " + empleado3.dameDni() + "          Año de ingreso: " + empleado3.dameDias() +"      sueldo mensual " + empleado3.dameSueldo() );
	     System.out.println("         Nombre y Apellido: "+ empleado4.dameNombre() + "           Edad: "+ empleado4.dameEdad() + "            Dni: " + empleado4.dameDni() + "           Año de ingreso: " + empleado4.dameDias() +"      sueldo mensual " + empleado4.dameSueldo() );
	     System.out.println("         Nombre y Apellido: "+ empleado5.dameNombre() + "       Edad: "+ empleado5.dameEdad() + "            Dni: " + empleado5.dameDni() + "          Año de ingreso: " + empleado5.dameDias() +"      sueldo mensual " + empleado5.dameSueldo() );

		
	

	}

}
