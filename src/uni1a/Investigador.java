package uni1a;

public class Investigador {
    private String nombre;
    private String especialidad;

    // Constructor
    public Investigador(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    // Método para mostrar información del investigador
    public void mostrarInformacion() {
        System.out.println("Investigador: " + nombre + " - Especialidad: " + especialidad);
    }
}