public class Main {
    public static void main(String[] args) {

        Conect conect = new Conect();
        double rate = conect.conect("BRL", "USB");

        Calculator calculator = new Calculator();
    }
}