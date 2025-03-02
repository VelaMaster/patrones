public class Main {
    public static void main(String[] args) {
        Auto autoElectrico = new AutoElectrico.Builder().establecerTipo("A eléctrico").establecerAsientos(5).construir();
        Auto autoManual = new AutoManual.Builder().establecerTipo("B manual").establecerAsientos(4).construir();
        autoElectrico.mostrar();
        autoManual.mostrar();
    }
}