
package uni1a;

public class Actor {
    private String nombre;
    private int edad;
    private String nacionalidad;

    // Constructor
    public Actor(String nombre, int edad, String nacionalidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    // Método para mostrar detalles del actor
    public void mostrarInformacion() {
        System.out.println(nombre + " (" + nacionalidad + "), " + edad + " años");
    }
}
