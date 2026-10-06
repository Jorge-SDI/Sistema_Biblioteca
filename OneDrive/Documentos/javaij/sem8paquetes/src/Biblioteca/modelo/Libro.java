package Biblioteca.modelo;
import java.util.ArrayList;
import java.util.List;

public class Libro {
    private String titulo;
    private String autor;
    private List<Ejemplar> ejemplares;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = new ArrayList<>();
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void agregarEjemplar(Ejemplar ejemplar){
        this.ejemplares.add(ejemplar);
    }
}
