package lsp;

public class BadCar implements Car{

    int speed = 0;

    @Override
    public void brake() {
        speed++;
    }
}
