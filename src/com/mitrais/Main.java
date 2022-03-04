package com.mitrais;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        /*
        * Stream Part, use stream and reducing my data into new structure
        * */
        StreamExercise dummy = new StreamExercise();
        List<Book> lst = dummy.InitData(30);
        int availableBook = lst.stream()
                .filter(Book::isAvailabe)
                .mapToInt(e -> 1).sum(); // can just use count() here but returns long instead of int

        System.out.println(availableBook);

       /*
       * Optional Part
       * */
       OptionalExample optionalExample = new OptionalExample();
       String s1Value=new String("Hello ");
       String value2=null;
       // of() could throw NPE
       Optional<String> s1 = Optional.of(s1Value);
       // ofNullable() can handle NPE
       Optional<String> s2 = Optional.ofNullable(value2);

       System.out.println(optionalExample.concat(s1,s2));


    }
}
