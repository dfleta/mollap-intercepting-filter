package intercepting.targets;

public class Vehicle implements Target {

    @Override
    public void execucio(String id) {
        System.out.println("Puerta abierta " + id.toString() + "!");
    }
}