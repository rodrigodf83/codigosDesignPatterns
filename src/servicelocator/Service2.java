package servicelocator;

public class Service2 implements Service {

    @Override
    public String getName() {
        return "Service 2";
    }

    @Override
    public void execute() {

        System.out.println("Executing Service 2");

    }

}
