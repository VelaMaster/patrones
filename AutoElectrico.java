public class AutoElectrico extends Auto {
    private AutoElectrico(String tipo, int asientos) {
        super(tipo, asientos);
    }
    public static class Builder {
        private String tipo;
        private int asientos;

        public Builder establecerTipo(String tipo) {
            this.tipo = tipo;
            return this;
        }
        public Builder establecerAsientos(int asientos) {
            this.asientos = asientos;
            return this;
        }
        public AutoElectrico construir() {
            return new AutoElectrico(tipo, asientos);
        }
    }
}