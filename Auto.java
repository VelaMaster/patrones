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
    public class Main{
        public static void main(String args[]){
            Auto auto1 = new Auto.ConstructorAuto().establecerTipo("A").establecerAsientos(5).construir();
            Auto auto2 = new Auto.ConstructorAuto().establecerTipo("B").establecerAsientos(5).construir();
            Auto auto3 = new Auto.ConstructorAuto().establecerTipo("C").establecerAsientos(5).construir();
            auto1.mostrar();
            auto2.mostrar();
            auto3.mostrar();
        }
    }
    public void mostrar(){
        System.out.println("Tipo de auto: " + tipo + ", Asientos: " + asientos);
    }
}
