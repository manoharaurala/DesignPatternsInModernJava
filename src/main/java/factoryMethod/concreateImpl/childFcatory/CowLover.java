package factoryMethod.concreateImpl.childFcatory;

import factoryMethod.concreateImpl.domains.Cow;
import factoryMethod.interfaces.Pet;
import factoryMethod.interfaces.Player;

public class CowLover implements Player {
    @Override
    public Pet getPet() {
        return new Cow();
    }
}
