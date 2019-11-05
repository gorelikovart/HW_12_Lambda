package com.company;

public class Main {

    public static void main(String[] args) {

        Lambda operation1 = x-> { if (x % 15 == 0) return true;
            return false;
        };

        Lambda operation2  = x-> { if (x > 0) return true;
            return false;
        };

        Lambda operation3  = (x)-> { if (x == 1)
            return true;
        else {
            double T = 0;
            int a = 1;
            int b = 1;
            int c = 0;
            while (c < x) {
                c = a + b;
                a = b;
                b = c;
            }
            if (c == x)
                 return true;
            else
                return false;
        }};

        System.out.println(operation1.calculate(55));       //Делиться на 15
        System.out.println(operation2.calculate(4));        //Больше 0
        System.out.println(operation3.calculate(6765));     //Число Фибоначчи
    }

    public interface Lambda {
        boolean calculate(int chisclo);
    }
}
