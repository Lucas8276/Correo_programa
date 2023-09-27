package correo.objetos;

import java.util.Scanner;

public class Usuario {
    private String Nombre;
    private String Contrasenia;
 
    
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getContrasenia() {
        return Contrasenia;
    }
    public void setContrasenia(String contrasenia) {
        Contrasenia = contrasenia;
    }
  


    void comprobar_correo(){
    Scanner imprimotexto = new Scanner(System.in);
    System.out.print("Ingrese direccion de correo electronico a crear");
    String correo= imprimotexto.nextLine();
    imprimotexto.close();
    }
    public boolean 
}
