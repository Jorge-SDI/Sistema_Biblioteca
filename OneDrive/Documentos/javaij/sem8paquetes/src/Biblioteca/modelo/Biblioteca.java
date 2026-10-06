package Biblioteca.modelo;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private List<Usuario> usuarios;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.usuarios = new ArrayList<>();
    }

    public void agregarUsuario(Usuario usuario){
        this.usuarios.add(usuario);
    }
}
