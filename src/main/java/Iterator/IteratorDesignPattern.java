package Iterator;

import java.util.List;

public class IteratorDesignPattern {
    public static void main(String[] args) {
        var pets = List.of("Ruby", "Aanemari", "Piddi", "Annayya", "Putani");
        /*external iterators
        things like break,continue etc
        for(var name:pets)System.out.print("\t"+name);
         */



        /*
        Internal iterator
        -Functional programming
        1.In imperative style of programming we use statements and expression
        2.In functional programming we use expression instead of statements.Imulability
         */

        /*Function style using forEach
        pets.forEach(System.out::println);

         */

        /*Functional Style iteration using streams
        1.takeWhile is functional programming equivalent of imperative style break
         */
        pets.stream()
                .takeWhile(name -> !name.equals("Annayya"))
                .limit(2)
                .forEach(System.out::println);
    }
}
