package MundoPC;

import MundoPC.modelo.Computadora;
import MundoPC.modelo.Monitor;
import MundoPC.modelo.Raton;
import MundoPC.modelo.Teclado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Computadoras predefinidas
        Computadora[] computadoras = {
                new Computadora("Dell 7030",
                        new Raton("Bluetooth", "Dell"),
                        new Monitor("Dell", 30),
                        new Teclado("Bluetooth", "Dell")
                ),
                new Computadora("HP Envy",
                        new Raton("USB", "HP"),
                        new Monitor("HP", 27),
                        new Teclado("USB", "HP")
                ),
                new Computadora("Lenovo Legion",
                        new Raton("Inalámbrico", "Lenovo"),
                        new Monitor("Lenovo", 32),
                        new Teclado("Inalámbrico", "Lenovo")
                )
        };

        while (true) {
            System.out.println("=== Menú Principal ===");
            System.out.println("1. Ver computadoras prearmadas");
            System.out.println("2. Armar una computadora personalizada");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    mostrarComputadoras(computadoras, scanner);
                    break;
                case "2":
                    Computadora personalizada = armarComputadora(scanner);
                    System.out.println("Computadora personalizada creada:");
                    System.out.println(personalizada);
                    System.out.print("¿Desea confirmar la compra? (s/n): ");
                    if (scanner.nextLine().equalsIgnoreCase("s")) {
                        System.out.println("✅ ¡Gracias por su compra!");
                    } else {
                        System.out.println("❌ Compra cancelada.");
                    }
                    break;
                case "0":
                    System.out.println("¡Hasta luego!");
                    scanner.close();
                    return;
                default:
                    System.out.println("⚠️ Opción inválida.");
            }

            System.out.println();
        }
    }

    private static void mostrarComputadoras(Computadora[] computadoras, Scanner scanner) {
        System.out.println("=== Computadoras Disponibles ===");
        for (int i = 0; i < computadoras.length; i++) {
            System.out.println((i + 1) + ". " + computadoras[i].getNombre());
        }
        System.out.print("Seleccione una para ver detalles (0 para volver): ");
        try {
            int seleccion = Integer.parseInt(scanner.nextLine());
            if (seleccion == 0) return;
            if (seleccion > 0 && seleccion <= computadoras.length) {
                System.out.println(computadoras[seleccion - 1]);
            } else {
                System.out.println("⚠️ Opción fuera de rango.");
            }
        } catch (NumberFormatException e) {
            System.out.println("⚠️ Entrada no válida.");
        }
    }

    private static Computadora armarComputadora(Scanner scanner) {
        System.out.print("Ingrese nombre del modelo de computadora: ");
        String nombre = scanner.nextLine();

        // Selección de ratón
        System.out.print("Ingrese tipo de ratón (USB, Bluetooth, Inalámbrico): ");
        String tipoRaton = scanner.nextLine();
        System.out.print("Ingrese marca del ratón: ");
        String marcaRaton = scanner.nextLine();
        Raton raton = new Raton(tipoRaton, marcaRaton);

        // Selección de monitor
        System.out.print("Ingrese marca del monitor: ");
        String marcaMonitor = scanner.nextLine();
        System.out.print("Ingrese tamaño del monitor (en pulgadas): ");
        double tamanioMonitor = Double.parseDouble(scanner.nextLine());
        Monitor monitor = new Monitor(marcaMonitor, tamanioMonitor);

        // Selección de teclado
        System.out.print("Ingrese tipo de teclado (USB, Bluetooth, Inalámbrico): ");
        String tipoTeclado = scanner.nextLine();
        System.out.print("Ingrese marca del teclado: ");
        String marcaTeclado = scanner.nextLine();
        Teclado teclado = new Teclado(tipoTeclado, marcaTeclado);

        return new Computadora(nombre, raton, monitor, teclado);
    }
}
