package decorator;

import java.awt.*;

public class DecoratorDesignPattern {
    public static void main(String[] args) {
        process(new Camera());
        process(new Camera(Color::brighter));
        process(new Camera(Color::darker));
        process(new Camera(Color::brighter, Color::darker));

    }

    public static void process(Camera camera) {
        System.out.println(camera.snap(new Color(125, 125, 125)));
    }

    /*
    1.Functions are composable
    2.F1
    F2
    --->F1--->
    --->F2--->
    --->F3--->

    --->|--->F1--->F2--->|--->

    3.We can combine series of policies,filters,data clensers
    handleData(unmask,uncompress,,makesensitivedata,compress)

     */
}
