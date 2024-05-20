import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            System.out.println("Bienvenido! Elige una opción:");
            System.out.println("1. Iniciar sesión");
            System.out.println("2. Crear cuenta");
            System.out.println("3. Salir");

            int option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1:
                    iniciarSesion();
                    break;
                case 2:
                    crearCuenta();
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
                    break;
            }
        }
    }

    private static void iniciarSesion() {
        System.out.println("Iniciar sesión:");
        System.out.print("Nombre de usuario: ");
        String username = scanner.nextLine();
        System.out.print("Contraseña: ");
        String password = scanner.nextLine();

        // Aquí se comprueban credenciales



        // 
        System.out.println("Credenciales aceptadas.");

        boolean back = false;
        while (!back) {
            System.out.println("1. Iniciar búsqueda");
            System.out.println("2. Volver al menú principal");

            int sessionOption = scanner.nextInt();
            scanner.nextLine(); 

            switch (sessionOption) {
                case 1:
                    iniciarBusqueda();
                    break;
                case 2:
                    back = true;
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }
    }

    private static void crearCuenta() {
        System.out.println("Crear cuenta:");
        System.out.print("Nombre de usuario: ");
        String newUsername = scanner.nextLine();
        System.out.print("Contraseña nueva: ");
        String newPassword = scanner.nextLine();

        // Aqui va la lógica para crear una nueva cuenta

        ///
        System.out.println("Cuenta creada exitosamente.");
    }

    private static void iniciarBusqueda() {
        ArrayList<String> nombresJuegos = new ArrayList<>();
        boolean agregarMas = true;

        while (agregarMas) {
            System.out.print("Nombre del juego: ");
            String nombreJuego = scanner.nextLine();
            nombresJuegos.add(nombreJuego);

            System.out.print("¿Deseas agregar otro juego? (si/no): ");
            String respuesta = scanner.nextLine().toLowerCase();
            if (!respuesta.equals("si")) {
                agregarMas = false;
            }
        }

        // Aqui va la lógica para el algoritmo de recomendacion



        System.out.println("Búsqueda iniciada con los juegos: " + nombresJuegos);
    }
}
