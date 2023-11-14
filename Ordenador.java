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

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setEstaEncendido(boolean estaEncendido) {
        this.estaEncendido = estaEncendido;
    }

    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }
    public void imprimirDetalles() {
        System.out.println("Marca: " + marca + "\n" +
                "¿Está encendido?: " + (estaEncendido? "Sí": "No") + "\n" +
                "Detalles procesador: \n" +
                procesador.getDetalles());
    }
}
