/**
 * Class Documental
 */
package uni1a;

// Subclase Documental que extiende de ContenidoAudiovisual
public class Documental extends ContenidoAudiovisual {
    private String tema;
    private Investigador investigadorPrincipal;

    // Constructor
    public Documental(String titulo, int duracionEnMinutos, String genero, String tema) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
    }

    // Getters y Setters
    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public Investigador getInvestigadorPrincipal() {
        return investigadorPrincipal;
    }

    public void setInvestigadorPrincipal(Investigador investigadorPrincipal) {
        this.investigadorPrincipal = investigadorPrincipal;
    }

    // Mostrar detalles del investigador
    public void mostrarInvestigador() {
        if (investigadorPrincipal != null) {
            investigadorPrincipal.mostrarInformacion();
        } else {
            System.out.println("No hay investigador asignado.");
        }
    }
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la documental:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Tema: " + this.tema);
        System.out.println();
    }
}