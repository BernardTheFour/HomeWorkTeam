package com.mitrais;

import java.util.Optional;

public class OptionalExample {
    public String concat(Optional<String> s1, Optional<String> s2){
        System.out.println(s1.isPresent());
        System.out.println(s2.isPresent());

        // get() throws NoSuchElementException
        String s1Value = s1.get();
        // orElse() returns the other value if not present
        String s2Value = s2.orElse(new String(""));
        return s1Value+s2Value;
    }

}
