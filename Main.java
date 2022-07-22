public class Main {
    public static void main(String[] args) {


        Persona anibal = new Persona();
        anibal.setNombre("Anibal");
        anibal.setEdad(44);
        anibal.setTelefono(11256565);

        System.out.println(anibal.getNombre());
        System.out.println(anibal.getEdad());
        System.out.println(anibal.getTelefono());

}
 }



    //////////////////////////////////////////////////////////////////

     
class Coche {
    int puertas = 2;

  public void agregarPuerta () {
    this.puertas++;
  }

}
class Persona {
private int edad;
private String nombre;
private int telefono;


public  void setEdad (int edad) {
    this.edad = edad;
}
public  void setNombre (String nombre) {
    this.nombre = nombre;

}
public  void setTelefono (int telefono) {
    this.telefono = telefono;

 }
 public  int getEdad () {
    return this.edad;  
    }  
  public  String getNombre () {
    return this.nombre;


     }
  public  int getTelefono () {
    return this.telefono;
     }
      }