public class Ordenador {
    // Atributo para la marca
    private String marca;
    // Atributo para frecuenciaEnGhz
    private boolean estaEncendido;
    // Atributo para procesador
    private Procesador procesador;

    public Ordenador(String marca, boolean estaEncendido, Procesador procesador) {
        this.marca = marca;
        this.estaEncendido = estaEncendido;
        this.procesador = procesador;
    }
}
