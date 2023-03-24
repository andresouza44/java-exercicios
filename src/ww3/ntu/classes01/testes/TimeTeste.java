package ww3.ntu.classes01.testes;


import ww3.ntu.classes01.dominio.TheTime;

public class TimeTeste {
    public static void main(String[] args) {

        TheTime time01 = new TheTime (23,59,59);
        System.out.println(time01);
        time01.nextSecond();
        System.out.println(time01);

        time01.nextSecond();
        time01.nextSecond();
        time01.nextSecond();
        System.out.println(time01);


        TheTime t1 = new TheTime(1, 2, 3);
        System.out.println(t1);  // toString()

        // Test Setters and Getters
        t1.setHour(4);
        t1.setMinute(5);
        t1.setSeconds(6);
        System.out.println(t1);  // toString()
        System.out.println("Hour: " + t1.getHour());
        System.out.println("Minute: " + t1.getMinute());
        System.out.println("Second: " + t1.getSeconds());

        // Test setTime()
        t1.setTime(23, 59, 58);
        System.out.println(t1);  // toString()

        // Test nextSecond();
        System.out.println(t1.nextSecond());
        System.out.println(t1.nextSecond().nextSecond());

        // Test previousSecond()
        System.out.println(t1.previousSeconds());
        System.out.println(t1.previousSeconds().previousSeconds());

    }

    }



