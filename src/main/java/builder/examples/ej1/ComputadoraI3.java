package builder.examples.ej1;

public class ComputadoraI3 extends  ComputadoraBuilder {


    @Override
    public void buildMemory() {
        computadoras.setMemory("4gb");
    }

    @Override
    public void buildDisk() {
        computadoras.setDisk("500gb");
    }

    @Override
    public void buildCpu() {
        computadoras.setCpu("i3");
    }
}
