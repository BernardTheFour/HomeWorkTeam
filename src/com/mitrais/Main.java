package com.mitrais;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        //Stream part

       // Optional part
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
