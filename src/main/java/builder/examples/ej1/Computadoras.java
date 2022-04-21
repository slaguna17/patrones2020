package builder.examples.ej1;

public class Computadoras {

    String memory;
    String disk;
    String cpu;

    public  Computadoras(){

    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void showData(){
        System.out.println("disk "+disk);
        System.out.println("memory "+memory);
        System.out.println("cpu "+cpu);

    }
}
