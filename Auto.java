public class Auto
{
    private String tipo;
    private int asientos;
    private Auto(String tipo, int asientos){
        this.tipo = tipo;
        this.asientos = asientos;
    }
    public static class ConstructorAuto{
        private String tipo;
        private int asientos;
        public ConstructorAuto establecerTipo(String tipo){
            this.tipo = tipo;
            return this;
        }
        public ConstructorAuto establecerAsientos(int asientos){
            this.asientos = asientos;
            return this;
        }
        public Auto construir(){
            return new Auto(tipo, asientos);
        }
    }
    public void mostrar(){
        System.out.println("Tipo de auto: " + tipo + ", Asientos: " + asientos);
    }
}
