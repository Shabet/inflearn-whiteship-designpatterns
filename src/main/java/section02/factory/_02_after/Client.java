package section02.factory._02_after;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();

        Ship whiteship = new WhiteshipFactory().orderShip("Whiteship", "keesun@mail.com");
        System.out.println("whiteship = " + whiteship);

        Ship blackship = new BlackShipFactory().orderShip("Blackship", "keesun@mail.com");
        System.out.println("blackship = " + blackship);
    }
}
