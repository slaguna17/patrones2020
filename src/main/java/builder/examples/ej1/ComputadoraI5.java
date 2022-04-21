package builder.examples.ej1;

public class ComputadoraI5 extends  ComputadoraBuilder {


    @Override
    public void buildMemory() {
        computadoras.setMemory("8gb");
    }

    @Override
    public void buildDisk() {
        computadoras.setDisk("1tb");
    }

    @Override
    public void buildCpu() {
        computadoras.setCpu("i5");
    }
}
