package poo;

import uni1a.*;

public class PruebaAudioVisual {
    public static void main(String[] args) {
        System.out.println("===== PRUEBA DE CONTENIDO AUDIOVISUAL =====\n");

        // Instancias base
        Pelicula pelicula = new Pelicula("Avatar", 125, "Acción", "20th Century Studios");
        SerieDeTV serie = new SerieDeTV("Game of Thrones", 60, "Fantasía", 8);
        Documental documental = new Documental("Cosmos", 45, "Ciencia", "Astronomía");

        // Agregar relaciones previas
        Actor actor1 = new Actor("Leonardo DiCaprio", 48, "EE.UU.");
        pelicula.agregarActor(actor1);

        Temporada temporada1 = new Temporada(1, 10);
        serie.agregarTemporada(temporada1);

        Investigador investigador1 = new Investigador("Neil deGrasse Tyson", "Astrofísica");
        documental.setInvestigadorPrincipal(investigador1);

        // NUEVAS SUBCLASES
        Podcast podcast = new Podcast("Ciencia al Día", 50, "Educativo", "Dr. Morales", "Spotify", 12);
        podcast.setInvitado(new Investigador("Jane Goodall", "Biología")); // Relación con Investigador

        Webinar webinar = new Webinar("Taller de Actuación", 90, "Arte", "Interpretación emocional", "Laura Méndez", "2025-11-02");
        webinar.setPresentador(new Actor("Robert Downey Jr.", 58, "EE.UU.")); // Relación con Actor

        // Mostrar todos los contenidos
        ContenidoAudiovisual[] contenidos = {pelicula, serie, documental, podcast, webinar};

        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
            System.out.println("--------------------------------------------");
        }
    }
}
