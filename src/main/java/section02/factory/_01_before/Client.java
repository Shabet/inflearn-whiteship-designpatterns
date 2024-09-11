package section02.factory._01_before;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();

        Ship whiteship = ShipFactory.orderShip("Whiteship", "keesun@mail.com");
        System.out.println("whiteship = " + whiteship);

        Ship blackship = ShipFactory.orderShip("Blackship", "keesun@mail.com");
        System.out.println("blackship = " + blackship);
    }
}
