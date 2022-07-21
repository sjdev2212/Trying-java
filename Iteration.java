public class Iteration {

  public static void main(String[] args) {
    int i = 22;

    if (i > 0) {
      System.out.println("i es positivo");
    }
    if (i == 0) {
      System.out.println("i es cero");
    }
    if (i < 0) {
      System.out.println("i es negativo");
    }
    int numeroWhile = 0;
    while (numeroWhile <= 3) {
      System.out.println(numeroWhile);
      numeroWhile++;
    }

    int otroWhile = 3;
    do {
      System.out.println(otroWhile);
      otroWhile++;
    } while (otroWhile <= 3);

    for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
      System.out.println(numeroFor);
    }

    String estacion = "lolos";

    switch (estacion) {
      case "invierno":
        System.out.println("es invierno");
        break;
      case "primavera":
        System.out.println("es primavera");
        break;
      case "verano":
        System.out.println("es verano");
        break;
      case "otonio":
        System.out.println("es otoño");
        break;
      default:
        System.out.println("No se que estacion es");
        break;
    }
  }
}
