public class Main {
    public static void main(String[] args) {
      Cliente primero = new Cliente();
      primero.setnombre("Joaquin");
      primero.setedad(10);
      primero.settelefono(1245212);
      primero.setcredito(20000);
      Trabajador segundo = new Trabajador();
      segundo.setnombre("Bruno");
      segundo.setedad(20);  
      segundo.settelefono(1245212);
      segundo.setSueldo(40000);
System.out.println(primero.nombre);
System.out.println(primero.edad);
System.out.println(primero.telefono);
System.out.println(primero.credito);
System.out.println(segundo.nombre);
System.out.println(segundo.edad);
System.out.println(segundo.telefono);
System.out.println(segundo.sueldo);

    }
}
 


class Persona {
  int edad;
  String nombre;
  int telefono;

  public void setnombre(String nombre) {
    this.nombre = nombre;
  }
  public void setedad(int edad) {
    this.edad = edad;
  }
  public void settelefono(int telefono) {
    this.telefono = telefono;
  }
}
class Cliente extends Persona {
  int credito;
  public void setcredito(int credito) {
    this.credito = credito;
  }
}

class Trabajador extends Persona {
  int sueldo;
  public void setSueldo(int sueldo) {
    this.sueldo = sueldo;
  }
}