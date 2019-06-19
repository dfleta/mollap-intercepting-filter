package intercepting.targets;

public class Vehicle implements Target {

    @Override
    public void execucio(String peticio) {
        System.out.println("Porta oberta!");
    }
}