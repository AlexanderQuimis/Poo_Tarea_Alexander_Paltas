package uni1a;

public class Temporada {
    private int numeroTemporada;
    private int cantidadEpisodios;

    // Constructor
    public Temporada(int numeroTemporada, int cantidadEpisodios) {
        this.numeroTemporada = numeroTemporada;
        this.cantidadEpisodios = cantidadEpisodios;
    }

    // Getters y Setters
    public int getNumeroTemporada() {
        return numeroTemporada;
    }

    public void setNumeroTemporada(int numeroTemporada) {
        this.numeroTemporada = numeroTemporada;
    }

    public int getCantidadEpisodios() {
        return cantidadEpisodios;
    }

    public void setCantidadEpisodios(int cantidadEpisodios) {
        this.cantidadEpisodios = cantidadEpisodios;
    }

    // Método para mostrar detalles de la temporada
    public void mostrarTemporada() {
        System.out.println("Temporada " + numeroTemporada + ": " + cantidadEpisodios + " episodios");
    }
}
