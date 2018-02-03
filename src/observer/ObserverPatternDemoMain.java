package observer;

public class ObserverPatternDemoMain {

    public static void main(String [] args) {

        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BynaryObserver(subject);

        System.out.println("Firt state change: 15");
        subject.setState(15);
        System.out.println("Second state change 10");
        subject.setState(10);

    }

}
