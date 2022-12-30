package org.example;

public class Program {

    public boolean checkIsAdult(int age) {
        boolean i = true;
        if (age == 18) {
            return i;
        }
        if (age > 18) {
            return i;
        }
        i=false;
        return i;
    }
}
