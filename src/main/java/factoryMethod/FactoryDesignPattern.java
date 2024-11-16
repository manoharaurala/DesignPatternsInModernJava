package factoryMethod;

import factoryMethod.concreateImpl.childFcatory.CatLover;
import factoryMethod.concreateImpl.childFcatory.CowLover;
import factoryMethod.interfaces.Player;

public class FactoryDesignPattern {
    public static void callPlay(Player player) {
        player.play();
    }

    public static void main(String[] args) {
        callPlay(new CatLover());
        callPlay(new CowLover());
    }

    /*
    Factory method
    1.Factory -an abstraction to create object.
      method-inheritance hierarchy where we can override a method to provide an alternative implementation that we return
    2.typically we have base call(abstract) and derived classes that override "factory" method(method which instantiate objects)
    3.Abstract factory horizontal dependency.
    Factory method vertical dependency
    4.In general interfaces better than abstract base class.
     */
}
