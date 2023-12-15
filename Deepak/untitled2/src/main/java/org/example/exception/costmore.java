package org.example.exception;

public class costmore {
    public void InvalidnumberException(int number) throws InvalidnumberException{
        if (number<16)
            throw  new InvalidnumberException("you are not pay here");
        else
            System.out.println("your paymt done thank you");
    }
}
