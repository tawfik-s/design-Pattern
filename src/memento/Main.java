package memento;

public class Main {
    public static void main(String[] args) {

        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("a");
        originator.setState("b");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("c");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("d");
        careTaker.add(originator.saveStateToMemento());
        System.out.println("Current State: " + originator.getState());

        originator.getStateFromMemento(careTaker.lastSavedState());
        System.out.println("last state is: "+originator.getState());


        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());

    }
}
