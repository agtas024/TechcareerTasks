package com.example.tasks.techcareertasks.task_2;

public class ClassMain {
    public static void main(String[] args) {
        double fahrenheit = 25.4;
        int facNum = 6;
        String text = "In older horror films," +
                " when protagonists were in desperation, it was difficult or" +
                " impossible for them to call for help or call the police. Mobile " +
                "phones have made that situation a bit less believable now. What’s the " +
                "solution to maintain suspense? No phone coverage! If you’re a hero in a horror film, " +
                "it’s almost certain that at a key moment, just when you absolutely need to call for help, " +
                "you will not have any coverage at all. Or your phone battery will die just as you are making " +
                "the call. Or both.";
        char letter = 'o';
        int edge = 8;
        int days1 = 15;
        int days2 = 30;
        int quota1 = 50;
        int quota2 = 100;
        int edge1 = 150, edge2 = 304;
        Functions functions = new Functions();
        double celsius = functions.celsiusToFahrenheit(fahrenheit);
        int fac = functions.factorial(facNum);
        int angle = functions.totalAngle(edge);
        int salary1 = functions.calculateSalary(days1);
        int salary2 = functions.calculateSalary(days2);
        int pay1 = functions.pay(quota1);
        int pay2 = functions.pay(quota2);

        System.out.println("\n" + fahrenheit + " F° = " + celsius + "C°\n");
        functions.rectanglePerimeter(edge1, edge2);
        System.out.println(facNum + "! = " + fac + "\n");
        functions.letterCounter(text, letter);
        System.out.println(edge + " kenarlı çokgenin iç açıları toplamı : " + angle + "°\n");
        System.out.println(days1 + " gün çalışma ücretiniz ₺" + salary1 + "\n");
        System.out.println(days2 + " gün çalışma ücretiniz ₺" + salary2 + "\n");
        System.out.println("Harcadığınız " + quota1 + "GB internet bedeliniz ₺" + pay1 + "\n");
        System.out.println("Harcadığınız " + quota2 + "GB internet bedeliniz ₺" + pay2 + "\n");
    }
}
