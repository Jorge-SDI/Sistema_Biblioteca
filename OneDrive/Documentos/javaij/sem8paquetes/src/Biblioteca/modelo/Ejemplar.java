package Biblioteca.modelo;

public class Ejemplar {
    private String codigo;
    private EstadoEjemplar estado;

    public Ejemplar(String codigo, EstadoEjemplar estado) {
        this.codigo = codigo;
        this.estado = estado;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public EstadoEjemplar getEstado() {
        return this.estado;
    }

    public void setEstado(EstadoEjemplar estado) {
        this.estado = estado;
    }
}
