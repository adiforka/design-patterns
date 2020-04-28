package design_patterns.factory.abstractFactory.demo3;

public class AbstractFactoryPatternSexDollsTest3 {
    public static void main(String[] args) {

        SexDollFactoryProducer.getSexDollFactory(false).getSexDoll("Jenna").take();
        SexDollFactoryProducer.getSexDollFactory(true).getSexDoll("Jenna").take();
        SexDollFactoryProducer.getSexDollFactory(false).getSexDoll("Kristen").take();
        SexDollFactoryProducer.getSexDollFactory(true).getSexDoll("Kristen").take();
    }
}

interface SexDoll {

    public abstract void take();
}

class JennaMax implements SexDoll {

    @Override
    public void take() {
        System.out.println("JennaMax takes it");
    }
}

class JennaMin implements SexDoll {

    @Override
    public void take() {
        System.out.println("JennaMin takes it");
    }
}

class KristenMax implements SexDoll {

    @Override
    public void take() {
        System.out.println("KristenMax takes it");
    }
}

class KristenMin implements SexDoll {

    @Override
    public void take() {
        System.out.println("KristenMin takes it");
    }
}

abstract class SexDollFactory {
    public abstract SexDoll getSexDoll(String type);
}

class MinDollFactory extends SexDollFactory {

    @Override
    public SexDoll getSexDoll(String type) {
        if (type.equalsIgnoreCase("Jenna")) return new JennaMin();
        else if (type.equalsIgnoreCase("Kristen")) return new KristenMin();
        else return null;
    }
}

class MaxDollFactory extends SexDollFactory {

    @Override
    public SexDoll getSexDoll(String type) {
        if (type.equalsIgnoreCase("Jenna")) return new JennaMax();
        else if (type.equalsIgnoreCase("Kristen")) return new KristenMax();
        return null;
    }
}

class SexDollFactoryProducer {

    public static SexDollFactory getSexDollFactory(boolean max) {
        if (max) return new MaxDollFactory();
        else return new MinDollFactory();
    }
}