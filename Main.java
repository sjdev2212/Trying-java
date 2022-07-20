public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.agregarPuerta();
        int resultado = 0;
        resultado = sumeTres(5, 15, 15);
        System.out.println(miCoche.puertas);
    }
    
    public static int sumeTres(int a, int b, int c) {
        return a + b + c;
    }

        
}
class Coche {
    int puertas = 2;

  public void agregarPuerta () {
    this.puertas++;
  }

}
