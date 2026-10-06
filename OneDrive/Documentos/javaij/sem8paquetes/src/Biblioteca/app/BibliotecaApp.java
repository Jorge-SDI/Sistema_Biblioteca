package Biblioteca.app;
import Biblioteca.modelo.*;
import Biblioteca.servicio.*;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class BibliotecaApp {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("USBI");
        Usuario usuario1 = new Usuario("Alan Yahir", "24077");
        biblioteca.agregarUsuario(usuario1);

        //Libro libroMuestra = new Libro("Programacion en JAVA", "J.A.Vergara && P.Martinez");
        Libro libro2 = new Libro("Cien anios de soledad", "Gabriel G. Márquez");
        //Ejemplar ejemplar1 = new Ejemplar("V-001", EstadoEjemplar.DISPONIBLE);
        Ejemplar ejemplar2 = new Ejemplar("T-009", EstadoEjemplar.DISPONIBLE);
        libro2.agregarEjemplar(ejemplar2);

        System.out.println("=================================================================");

        System.out.println("Datos generales del libro");
        System.out.println("Codigo del ejemplar: " + ejemplar2.getCodigo() + ". Estado actual del ejemplar: " + ejemplar2.getEstado());

        System.out.println("=================================================================");

        Prestamo prestamo1 = new Prestamo(LocalDate.now(), LocalDate.now().plusDays(30));
        prestamo1.RealizarPrestamo(usuario1, ejemplar2);
        System.out.println("Datos del prestamo");
        System.out.println("Usuario: " + usuario1.getNombre());
        System.out.println("Libro prestado: " + libro2.getTitulo());

        System.out.println("=================================================================");

        System.out.println("Datos generales del libro despues del prestamo");
        System.out.println("Codigo del ejemplar: " + ejemplar2.getCodigo() + ". Estado actual del ejemplar: " + ejemplar2.getEstado());
        System.out.println("Prestamo vencido?: " + prestamo1.estaVencido());

        System.out.println("=================================================================");

        prestamo1.devolver(true);

        System.out.println("=================================================================");

        System.out.println("Despues de devolver");
        System.out.println("Ejemplar numero: " + ejemplar2.getCodigo());
        System.out.println("Estado actual del ejemplar: " + ejemplar2.getEstado());
    }
}
