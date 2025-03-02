public abstract class Auto {
    private String tipo;
    private int asientos;

    protected Auto(String tipo, int asientos) {
        this.tipo = tipo;
        this.asientos = asientos;
    }
    public void mostrar() {
        System.out.println(tipo + ", Asientos: " + asientos);
    }
}