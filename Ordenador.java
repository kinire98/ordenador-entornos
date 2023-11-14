public class Ordenador {
    // Atributo para la marca
    private String marca;
    // Atributo para frecuenciaEnGhz
    private boolean estadoEncendido;
    // Atributo para procesador
    private Procesador procesador;

    public Ordenador(String marca, boolean estaEncendido, Procesador procesador) {
        this.marca = marca;
        this.estaEncendido = estaEncendido;
        this.procesador = procesador;
    }

    public String getMarca(){
        return marca;
    }

    public String GetEstadoEncendido(){
        return estadoEncendido;
    }

    public String getProcesador(){
        return procesador;
    }
}
