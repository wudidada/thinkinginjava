package chapter9;

import java.util.Arrays;

abstract class Car {
}

class Tank extends Car {
    protected void print() {
        System.out.println("Tank");
    }
}

abstract class SecondCar {
    abstract protected void print();
}

class SecondTank extends SecondCar {
    protected void print() {
        System.out.println("Second Tank");
    }
}


public class Ex4 {
    public static void testPrint(Car car) {
        ((Tank)car).print();
    }

    public static void secendTestPrint(SecondCar car) {
        car.print();
    }

    public static void main(String[] args) {
        Tank tank = new Tank();
        Ex4.testPrint(tank);

        SecondTank stank = new SecondTank();
        Ex4.secendTestPrint(stank);


    }
}
