public class FuncionesRecursivas {

  public static int factorial(int a) {
    if (a > 0) {
      return a * factorial(--a);
    } else {
      return 1;
    }
  }

  public static int acumulacion(int q) {
    if (q > 1) {
      return q + acumulacion(--q);
    } else {
      return 1;
    }
  }

  public static void tablaMultiplicar(int e, int q) {
    if (e < 0) {
      System.out.println("Ingresa un numero positivo");
    } else {
      if (q > 0) {
        System.out.println(e + " x " + q + " = " + (e * q));
        tablaMultiplicar(e, --q);
      }
    }

  }

  public static void numeroPrimo(int a, int b) {
    --a;
    if (a > 1) {
      if ((b % a) == 0) {
        System.out.println("no primo");
      } else {
        numeroPrimo(a, b);
      }
    } else {
      System.out.print("si primo");
    }
  }

  public static int sumaRecursiva(int numero){
    if (numero == 0) {
      return 0;
    }else{
      return numero + sumaRecursiva(--numero);
    }
  }

}
