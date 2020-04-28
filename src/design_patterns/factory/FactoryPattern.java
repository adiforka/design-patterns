package design_patterns.factory;

/*Factory Design Pattern makes it so that object instantiation is removed from client code (main method). The client only
 * calls the getComputer (get instance) method instead of calling the constructor.
 *
 * The factory pattern allows for creation of objects (with a get instance method) without exposing the object creation logic,
 * which is hidden away from the user
 */
public class FactoryPattern {
    public static void main(String[] args) {

        /*the computer factory class returns an instance of an abstract class or interface based on the input provided;
         * here the input is "type", a string*/
        Computer pc = ComputerFactory.getComputer("pc", "16gb", "1tb", "4 cores");
        Computer server = ComputerFactory.getComputer("server", "64gb", "8tb", "16 cores");
        System.out.println("PC config::" + pc);
        System.out.println("Server config::" + server);

    }
}

abstract class Computer {

    public abstract String getRAM();

    public abstract String getHDD();

    public abstract String getCPU();

    //remember to put "thi"s" here, referring to the instance calling the method
    public String toString() {
        return "RAM=" + this.getRAM() + ", HDD=" + this.getHDD() + ", CPU=" + this.getCPU();
    }
}

class PC extends Computer {

    private String ram;
    private String hdd;
    private String cpu;

    public PC(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public String getRAM() {
        return ram;
    }

    @Override
    public String getHDD() {
        return hdd;
    }

    @Override
    public String getCPU() {
        return cpu;
    }
}

class Server extends Computer {

    private String ram;
    private String hdd;
    private String cpu;

    public Server(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public String getRAM() {
        return ram;
    }

    @Override
    public String getHDD() {
        return hdd;
    }

    @Override
    public String getCPU() {
        return cpu;
    }
}

class ComputerFactory {

    //keep this method static or make computer factory a singleton class
    public static Computer getComputer(String type, String ram, String hdd, String cpu) {
        //use switch if more possibilities
        if (type.equalsIgnoreCase("Pc")) return new PC(ram, hdd, cpu);
        else if (type.equalsIgnoreCase("Server")) return new Server(ram, hdd, cpu);
        else return null;
    }
}
