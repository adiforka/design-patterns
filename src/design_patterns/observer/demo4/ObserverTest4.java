package design_patterns.observer.demo4;

public class ObserverTest4 {
    public static void main(String[] args) {

        BigShot bs = new BigShot();
        bs.setStatus(16);
        bs.setStatus(50);
    }
}

class Observer {

    private BigShot bigShot;

    Observer(BigShot bigShot) {
        this.bigShot = bigShot;
    }

    public void update() {
        System.out.println("New status set to " + bigShot.getStatus());
    }
}

class BigShot {

    private Observer observer;
    private int status;

    public void setStatus(int status) {
        this.status = status;
        notifyObserver();
    }

    public int getStatus() {
        return status;
    }

    public void instantiateObserver() {
        this.observer = new Observer(this);
    }

    public void notifyObserver() {
        instantiateObserver();
        observer.update();
    }
}
