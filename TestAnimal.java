//Importa el paquete que contiene la clase Scanner  
  import java.util.*;
  
//Definicion de la clase
  public class TestAnimal {
     //Definición del Metodo principal
     public static void main(String[] args) {
     
      //Declaración del objeto Animal      
        Animal animal1 = new Animal();
      
      //Declaración del objeto teclado de la clase Scanner      
        Scanner teclado = new Scanner(System.in);

      //Pedir el nombre del animal
        System.out.print("Teclee el Nombre del Animal: ");

      //Leer y asignar nombre al objeto animal1
        animal1.setNombre(teclado.nextLine());

      //Pedir la edad del animal
        System.out.print("Teclee la edad del animal: ");
        int edad = teclado.nextInt();
        
      //Asignar edad al objeto animal1
        animal1.setEdad(edad);

      //Informar de los datos de animal1
        animal1.nace();
        System.out.println("Mi nombre es: " + animal1.getNombre() +
                           " y mi edad es: " + animal1.getEdad() );
     }

  }       
