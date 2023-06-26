import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.printf("Hola, estas justo en main, de la paqueteria MiCarpeta, gusto en saludarte...");

        // Aqui tienes un pequeño ejemplo de un ciclo for
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        //Test de herencia
        Profesor profesor1 = new Profesor ("Emanuel", "Luna García", 23);
        profesor1.setIdProfesor("2771123");
        profesor1.mostrarNombreApellidosYCarnet();
    
    }

        
}