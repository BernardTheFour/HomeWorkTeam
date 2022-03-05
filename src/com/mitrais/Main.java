package com.mitrais;
import java.util.List;
import java.util.Optional;

import static com.mitrais.Lambda.operation;

public class Main {

    public static void main(String[] args) {
        // Point 1 & 2 by Winnona Sarah
        /*
                Lambda Part: create Interface, use method reference
        */
        operation(125, 3, (a, b) -> Math.round(Math.pow(a, 1.0/b))); //lambda - nth root of
        operation(5, 3, Math::pow); //method reference - power of

        // Point 3 & 4 by Bernard
        StreamExercise streamExercise = new StreamExercise();

        // Point 6 & 7 by Hafid
        DateTimePeriodExample myExample = new DateTimePeriodExample();

        System.out.println("\nDate & Period usage example (get age): ");
        myExample.countAge();
        System.out.println("---------------------");
        System.out.println("Time & Duration usage example (get working seconds): ");
        System.out.println(myExample.countWorkingSeconds() + " seconds");
        System.out.println("---------------------");
        System.out.println("DateTime & ChronoUnit usage example (get minutes to new year): ");
        System.out.println(myExample.countMinutesToNewYear() + " minutes");
        
        // Point 5 & 8 by Alvian
        /*
         * Stream Part, use stream and reducing my data into new structure
         * */
        StreamExercise dummy = new StreamExercise();
        List<Book> lst = dummy.InitData(30);
        int availableBook = lst.stream()
                .filter(Book::isAvailable)
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
