package design_patterns.factory;

public class WoodFactoryPatternDemo {
    public static void main(String[] args) {

        WoodFactory wf = new WoodFactory();
        Wood wood1 = wf.getInstance("alder");
        Wood wood2 = wf.getInstance("ash");
        Wood wood3 = wf.getInstance("mahogany");
        System.out.println(wood1 + " " + wood2 + " " + wood3);
        wf.getInstance("whaaaat?");


    }
}

class WoodFactory {
    public Wood getInstance(String type) {
        if(type.equalsIgnoreCase("alder")) return new Alder();
        else if(type.equalsIgnoreCase("ash")) return new Ash();
        else if(type.equalsIgnoreCase("mahogany")) return new Mahogany();
        else throw new RuntimeException("Type not supported. Choose from \"alder\"," +
            "\"ash\", and \"mahogany\"");
    }
}

abstract class Wood {

    @Override
    public String toString() {
        return "Wood{: " +  this.getClass() + "}" ;
    }
}

class Alder extends Wood {
    @Override
    public String toString() {
        return "Alder";
    }
}

class Mahogany extends Wood {

}

class Ash extends Wood {

}
