// write a program method overloading to find the sum of two numbers\
import java.util.*;
class Sum {
    int add(int a, int b) {
        return a+b;
    }
    double add(double a, double b){
        return a+b;
    }
}

class OverLoaded {
    public static void main(String[] args) {
        Sum sum = new Sum();
        System.out.println(sum.add(5.5, 10.5));
        System.out.println(sum.add(5, 10));
    }
}

// Compile time polymorphism