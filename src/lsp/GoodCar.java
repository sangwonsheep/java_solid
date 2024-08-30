package lsp;

public class GoodCar implements Car{

    int speed = 0;

    @Override
    public void brake() {
        speed = 0;
    }
}
