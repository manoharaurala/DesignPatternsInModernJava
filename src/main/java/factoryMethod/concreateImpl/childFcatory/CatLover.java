package factoryMethod.concreateImpl.childFcatory;

import factoryMethod.concreateImpl.domains.Cat;
import factoryMethod.interfaces.Pet;
import factoryMethod.interfaces.Player;

public class CatLover implements Player {
    @Override
    public Pet getPet() {
        return new Cat();
    }
}
