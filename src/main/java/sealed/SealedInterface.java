package sealed;

import sealed.interfaces.RedLight;
import sealed.interfaces.TrafficLight;

public class SealedInterface {
    public static void main(String[] args) {
        TrafficLight trafficLight=new RedLight();
        System.out.println(trafficLight);

    }
    /*
    Your library has two kind of interfaces.
    1.For others to implement
    2.FOr others to use
     */
}
