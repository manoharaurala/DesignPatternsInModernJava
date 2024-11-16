package decorator;

import java.awt.*;
import java.util.function.Function;
import java.util.stream.Stream;

public class Camera {
    private final Function<Color, Color> filter;

    public Camera(Function<Color, Color>... filters) {
        /*
        filter=input->input;
        for(var afilter:filters){
            filter=filter.andThen(afilter);

        }
         */
        /*filter=Stream.of(filters)
                .reduce(input->input,(result,aFilter)->result.andThen(aFilter));*/
        filter = Stream.of(filters)
                .reduce(Function.identity(), Function::andThen);
    }

    public Color snap(Color input) {
        return filter.apply(input);
    }
}
