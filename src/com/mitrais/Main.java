package com.mitrais;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
	// write your code here
       OptionalExample optionalExample = new OptionalExample();
       String s1Value=new String("Hello ");
       String value2=null;

       Optional<String> s1 = Optional.of(s1Value);
       Optional<String> s2 = Optional.ofNullable(value2);

       System.out.println(optionalExample.concat(s1,s2));


    }
}
