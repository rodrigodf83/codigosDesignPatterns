package observer;

public class BynaryObserver extends Observer {

    public BynaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary Strubg " + Integer.toBinaryString(subject.getState()));
    }
}
