public class Procesador {
    // Atributo para la marca
    private String marca;
    // Atributo para frecuenciaEnGhz
    private double frecuenciaEnGhz;

    public Procesador(String marca, double frecuenciaEnGhz) {
        this.marca = marca;
        this.frecuenciaEnGhz = frecuenciaEnGhz;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public double getfrecuenciaEnGhz(){
        return frecuenciaEnGhz;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public void setFrecuenciaEnGhz (double frecuenciaEnGhz){
        this.frecuenciaEnGhz = frecuenciaEnGhz;
    }

    public void imprimirDetalles() {
        System.out.println("Marca: " + marca + "\n" +
                "Frecuencia: " + frecuenciaEnGhz + "GHz");
    }
}
