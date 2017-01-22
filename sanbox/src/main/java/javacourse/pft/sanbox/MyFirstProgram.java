package javacourse.pft.sanbox;

public class MyFirstProgram {

  public static void main(String[] args) {
  //Вызов функции hello ();
    hello("world");
    hello("user");
    hello("Oleksandr");
    double l = 5;
    System.out.println("Площадь квадарата со стороной " + l + " равна " + area(l));

    double a = 4;
    double b = 5;
    System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b +  " равна " + area(a, b));

  }
  // Функция Hello World;
  public static void hello(String somebody ) {

    System.out.println("Hello," + somebody + "!");
  }

  public  static double area (double len) {
    return  len*len;

  }

  public static double area (double a, double b) {
    return  a*b;
  }



}