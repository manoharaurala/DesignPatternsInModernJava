package OptionalDesignPattern;

import java.util.Optional;

public class OptionalDesignPattern {
    public static Optional<String> getName(Long id) {
        if (id == 0) {
            //return null; //null is a smell
            return Optional.empty();
        }
        return Optional.of("Ruby");

    }

    public static void main(String[] args) {
        var result = getName(25L);
        //imperatively
        /*
        if(result.isPresnt(){
        result.get(); don't use get. Use orElseThrow orElse("default")
        }
         */

        //functionally
        result.ifPresentOrElse(
                System.out::println,
                () -> System.out.println("Not Found"));


    }
}

//Code should reveal its intentions

/* Good practice use Optional
1.Return reference if value will always exist
2.Return an Optional<T> if the value may or may not exist.
3.Don't use Optional<T> for attributes in class
4.Don't use Optional<T> for method parameters

 */
