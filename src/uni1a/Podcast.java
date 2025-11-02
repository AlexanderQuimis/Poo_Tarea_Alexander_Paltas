package uni1a;

public class Podcast extends ContenidoAudiovisual {
    private String anfitrion;
    private String plataforma;
    private int cantidadEpisodios;
    private Investigador invitado; // Asociación con la clase Investigador

    // Constructor
    public Podcast(String titulo, int duracionEnMinutos, String genero, String anfitrion, String plataforma, int cantidadEpisodios) {
        super(titulo, duracionEnMinutos, genero);
        this.anfitrion = anfitrion;
        this.plataforma = plataforma;
        this.cantidadEpisodios = cantidadEpisodios;
    }

    // Getters y Setters
    public String getAnfitrion() {
        return anfitrion;
    }

    public void setAnfitrion(String anfitrion) {
        this.anfitrion = anfitrion;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public int getCantidadEpisodios() {
        return cantidadEpisodios;
    }

    public void setCantidadEpisodios(int cantidadEpisodios) {
        this.cantidadEpisodios = cantidadEpisodios;
    }

    public Investigador getInvitado() {
        return invitado;
    }

    public void setInvitado(Investigador invitado) {
        this.invitado = invitado;
    }

    // Método para mostrar detalles del Podcast
    public void mostrarDetalles() {
        System.out.println("Detalles del Podcast:");
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos() + " minutos");
        System.out.println("Género: " + getGenero());
        System.out.println("Anfitrión: " + anfitrion);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Cantidad de episodios: " + cantidadEpisodios);

        if (invitado != null) {
            System.out.print("Invitado especial: ");
            invitado.mostrarInformacion();
        }
        System.out.println();
    }
}
