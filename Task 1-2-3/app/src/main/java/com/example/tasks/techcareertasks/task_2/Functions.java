package com.example.tasks.techcareertasks.task_2;

public class Functions {

    //1. soru
    public double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (celsius * 1.8) + 32;
        return fahrenheit;
    }

    //2.soru
    public void rectanglePerimeter(int edge1, int edge2) {
        int perimeter = (2 * edge1) + (2 * edge2);
        System.out.println("Kenarları " + edge1 + " ve " + edge2 + " olan dikdörtgeninizin çevresi : " + perimeter + " cm\n");
    }

    //3. soru
    public int factorial(int number) {
        int temp = 1;
        for (int i = number; i > 0; i--) {
            temp *= i;
        }
        return temp;
    }

    //4. soru
    public void letterCounter(String text, char letter) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == letter) {
                count++;
            }
        }
        System.out.println("Metninizde tekrar eden '" + letter + "' karakteri adedi : " + count + "\n");
    }

    //5. soru
    public int totalAngle(int numberOfEdge) {
        int total = (numberOfEdge - 2) * 180;
        return total;
    }

    //6. soru
    public int calculateSalary(int days) {
        int hours = days * 8;
        int salary = 0;
        if (hours <= 160) {
            salary = hours * 10;
            return salary;
        } else {
            int temp = hours - 160;
            int fixed = 160 * 10;
            temp *= 20;
            salary = fixed + temp;
            return salary;
        }
    }

    //7. soru
    public int pay(int quota) {
        int salary = 0;
        if (quota <= 50) {
            salary = 100;
            return 100;
        } else {
            int temp = quota - 50;
            int extra = temp * 4;
            salary = extra + 100;
            return salary;
        }
    }
}
