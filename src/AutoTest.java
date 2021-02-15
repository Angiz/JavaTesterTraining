public class AutoTest {

    public static void main(String[] args) {
        Auto mercedes = new Auto("Mercedes", "A6", 2021, 10000000);
        mercedes.jedz();

        Auto volvo = new Auto("Volvo", "XC90", 2020, 123454645);
        volvo.hamuj();

        Auto opel = new Auto("Opel", "Vectra", 2000, 133534654);
        opel.info();
    }

}
