package section02.factory._02_after;

public class BlackShipFactory implements ShipFactory {
    @Override
    public Ship createShip() {
        return new Blackship();
    }
}
