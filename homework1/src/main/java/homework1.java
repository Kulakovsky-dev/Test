import com.sun.deploy.security.SelectableSecurityManager;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class homework1 {

    // Метод, возвращающий выражение a+(b+c/d)
    static int Express4(int a, int b, int c, int d){
        return a * (b + c / d);
    }

    //Метод, принимающий на вход 2 числа и проверяющий, что их сумма в пределах 10..20 (вкл)
    static boolean Chek2inRange(int a, int b) {
        return (a+b)>=10 && (a+b)<=20;
    }

    // Метод, выводящий в консоль, положительное ли число
    static void PositiveNegative(int a) {
        if (a < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("'Positive");
        }

    }

    // Метод, возвращающий True, если число отрицательное
    static boolean IsNegative(int a) {
        return a < 0;
    }

    // Метод, выводящий в консоль "Привет, ИМЯ"
    static void HelloName(String name) {
        System.out.println("Привет, " + name);
    }

    //Метод, выводящий в консоль, является ли год високосным
    static boolean WhatYear(int year) {
        boolean answer;
        if (year%4 != 0) {
            answer = false;
        } else{
            answer = year % 100 !=0 || year % 400 == 0;
        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        //primitives
        byte byteValue = 1;
        short shortValue = 200;
        int intValue = 1000;
        long longValue = 10000;
        float floatValue = 1.6f;
        double doubleValue = 1.9;
        // System.out.println(floatValue / doubleValue);
        boolean a = true;
        char simbol = 'A';

        intValue = Express4(1, 2, 3, 4);
        System.out.println(intValue);
        intValue = Express4(10, 40, 30, 20);
        System.out.println(intValue);
        a = Chek2inRange(3, 6);
        System.out.println(a);
        a = Chek2inRange(11, 6);
        System.out.println(a);

        a = WhatYear(2019);
        a = WhatYear(2020);
        a = WhatYear(2100);
        a = WhatYear(2400);
    }
}
