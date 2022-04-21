package builder.examples.ej1;

public class ComputadoraI7 extends  ComputadoraBuilder {


    @Override
    public void buildMemory() {
        computadoras.setMemory("16gb");
    }

    @Override
    public void buildDisk() {
        computadoras.setDisk("2tb");
    }

    @Override
    public void buildCpu() {
        computadoras.setCpu("i7");
    }
}
