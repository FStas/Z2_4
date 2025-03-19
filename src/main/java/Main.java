// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    System.out.println("1 – dla sumy, 2 – dla różnicy, 3 – dla iloczynu, 4 – dla ilorazu, 5 - sprawdzenie czy trójkąt jest prostokątny");
    Scanner scanner = new Scanner(System.in);
    int op = scanner.nextInt();
    float a = scanner.nextFloat();
    float b = scanner.nextFloat();

    switch (op)
      case (1) Suma(a,b);
      case (2) Różnica(a,b);
      case (3) Iloczyn(a,b);
      case (4) Iloraz(a,b);
      case (5) Trójkąt(a,b);
      
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}