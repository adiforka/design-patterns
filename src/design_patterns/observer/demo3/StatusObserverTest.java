package design_patterns.observer.demo3;

/*this is a variation. not a book observer pattern: does not notify all observers, but a chosen observer based on the new
status value*/
public class StatusObserverTest {
    public static void main(String[] args) {

        Watched watched = new Watched();

        watched.setStatus(2);
        watched.setStatus(26);
        watched.setStatus(51);
    }
}

class Watched {

    private Observer observer;
    private int status;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
        this.notifyObserver();
    }

    public void instantiateObserver() {
        if (this.status <= 50)
            this.observer = new GreenObserver(this);
        else this.observer = new RedObserver(this);
    }

    public void notifyObserver() {
        this.instantiateObserver();
        observer.update();
    }
}

abstract class Observer {

    protected Watched watched;

    public abstract void update();

}

class GreenObserver extends Observer {

    GreenObserver(Watched watched) {
        this.watched = watched;
    }

    @Override
    public void update() {
        System.out.println("Green status: " + watched.getStatus());
    }
}

class RedObserver extends Observer {

    RedObserver(Watched watched) {
        this.watched = watched;
    }

    @Override
    public void update() {
        System.out.println("Red warning! Status: " + watched.getStatus());
    }
}
