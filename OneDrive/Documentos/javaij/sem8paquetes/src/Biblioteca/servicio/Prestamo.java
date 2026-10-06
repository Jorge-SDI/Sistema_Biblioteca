package Biblioteca.servicio;
import java.time.LocalDate;

import Biblioteca.modelo.EstadoEjemplar;
import Biblioteca.modelo.Usuario;
import Biblioteca.modelo.Ejemplar;

/**
 * Administra los prestamos de libros
 * @author Jorge
 * @version 1.17.12
 * @since september 2026
 */

public class Prestamo {
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    private Usuario usuario;
    private Ejemplar ejemplar;

    /**
     * libro que será prestado
     * @param fechaDevolucion
     */

    public Prestamo(LocalDate fechaPrestamo, LocalDate fechaDevolucion) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    public String RealizarPrestamo(Usuario usuario, Ejemplar ejemplar) {
       this.usuario = usuario;
       this.ejemplar = ejemplar;
       this.ejemplar.setEstado(EstadoEjemplar.PRESTADO);
       return "Prestamo realizado correctamente";
    }

    public void devolver(boolean estaDanado) {
        if(this.ejemplar != null) {
            if(estaDanado) {
                this.ejemplar.setEstado(EstadoEjemplar.DANADO);
                System.out.println("El libro " + ejemplar.getCodigo() + " está siendo devuelto dañado");
                System.out.println(usuario.getNombre() + " debe pagar una multa de $60");
            }else{
                this.ejemplar.setEstado(EstadoEjemplar.DISPONIBLE);
            }
        }

        /*
        if(this.ejemplar.getEstado() == EstadoEjemplar.DANADO){
            System.out.println("El ejemplar " + this.ejemplar + " está siendo devuelto dañado");
            System.out.println(this.usuario + " debe pagar una multa de $60");
            this.ejemplar.setEstado(EstadoEjemplar.DISPONIBLE);
        }

        this.ejemplar.setEstado(EstadoEjemplar.DISPONIBLE);
        System.out.println(ejemplar + " ha sido devuelto correctamente");
        */
    }

    public boolean estaVencido() {
        return LocalDate.now().isAfter(this.fechaDevolucion);
    }


}
