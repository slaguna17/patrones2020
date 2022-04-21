package abstractFactory.ejercicios.ej1.sergio;

public class Crema1 {
        private String sabor;
        private int costo;

    public Crema1(String sabor, int costo) {
        this.sabor = sabor;
        this.costo = costo;
    }

    public String getSabor() {
            return sabor;
        }

        public void setSabor(String sabor) {
            this.sabor = sabor;
        }

        public int getCosto() {
            return costo;
        }

        public void setCosto(int costo) {
            this.costo = costo;
        }


}
