package design_patterns.observer.demo6_headfirst;


//polling an object for changes vs. pushing out object change info to interested objects
//the changing object is responsible for informing the interested object that it has changed (push)
//nobody has to ask for an update while not knowing if there is one. if there is one, info on it is
//pushed out (example of TDA --> tell don't ask)

//before any pushing happens, the observable(THE SUBJECT) must register the observers

//def: OP defines a one-to-many dependency between objects so that when one object changes state,
//all of its dependencies are notified and updated automatically

//it's potentially a violation of the SRP that we're making the concrete implementation of an observable
//(a subject) do 2 things: do whatever it substantial tasks it does and also do the management of observers
//(registering/de-registering/notifying them)

//oddly, the HeadFirst impl of OP has it that a concrete observer has an instance of its observable
//which you pass to into its constructor (so now its bidirectional: the observer is registered with
//the observable (in its list, array etc.), and the observer has an instance of the thing it's observing
//that way it not only knows that something has changed (because something called its update method, but
//but also what changed (because that sth is passed to the update function as argument)
public class ObserverPatternDemoHeadFirst {
    public static void main(String[] args) {

        WeatherStation station = new WeatherStation();
        //passing a reference to station to observer constructor for it to be able to get the state
        //of the observable (ONCE it knows it has changed -- which is handled by the observer pattern)
        PhoneDisplay phoneDisplay = new PhoneDisplay(station);
        WindowDisplay windowDisplay = new WindowDisplay(station);
        station.addObserver(phoneDisplay);
        station.addObserver(windowDisplay);
        station.setTemperature(15.4);
        station.setTemperature(15.5);
        station.setTemperature(19.2);
    }
}
