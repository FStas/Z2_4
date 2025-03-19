
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("1 – dla sumy, 2 – dla różnicy, 3 – dla iloczynu, 4 – dla ilorazu, 5 - sprawdzenie czy trójkąt jest prostokątny");
    Scanner scanner = new Scanner(System.in);
    int op = scanner.nextInt();
    float a = scanner.nextFloat();
    float b = scanner.nextFloat();

    switch (op) {
      case 1:
        suma(a, b);
        break;
      case 2:
        roznica(a, b);
        break;
      case 3:
        iloczyn(a, b);
        break;
      case 4:
        if (b != 0) {
          iloraz(a, b);
        } else {
          System.out.println("Nie można dzielić przez zero!");
        }
        break;
      case 5:
        float c = scanner.nextFloat();
        trojkat(a, b, c);
        break;
      default:
        System.out.println("Nieprawidłowa opcja!");
    }
    scanner.close();
  }

  static void suma(float a, float b) {
    System.out.println("Suma: " + (a + b));
  }

  static void roznica(float a, float b) {
    System.out.println("Różnica: " + (a - b));
  }

  static void iloczyn(float a, float b) {
    System.out.println("Iloczyn: " + (a * b));
  }

  static void iloraz(float a, float b) {
    System.out.println("Iloraz: " + (a / b));
  }

  static void trojkat(float a, float b, float c) {
    
    if ((a * a) + (b * b) == (c * c)) {
      System.out.println("Trójkąt jest prostokątny");
    } else {
      System.out.println("Trójkąt nie jest prostokątny");
    }
  }
}
