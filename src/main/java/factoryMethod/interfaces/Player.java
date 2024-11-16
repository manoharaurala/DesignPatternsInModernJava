package factoryMethod.interfaces;

public interface Player {
    //Factory method in interface
    Pet getPet();

    default void play() {
        System.out.println("I like playing");
        System.out.println("playing with " + getPet());
    }


}
