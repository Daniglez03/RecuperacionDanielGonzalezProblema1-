import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Impresora impresora = new Impresora();
        DocOfimatico documento = null;
        Scanner sc = new Scanner(System.in);
        boolean enntrada = false;
        while (!enntrada) {
            System.out.println("1.Encender impresora");
            System.out.println("2.Apagar impresora");
            System.out.println("3.Añadir trabajo");
            System.out.println("4.Ver lista de trabajos");
            System.out.println("5.Imprimir");
            System.out.println("Q.Salir");

            String opcion = sc.next();
            switch (opcion) {
                case "1":
                    impresora.on();

                    if (impresora.estado == true) {
                        System.out.println("Estado impresora : encendida");
                    }
                    break;
                case "2":
                    impresora.off();
                    if (impresora.estado == false) {
                        System.out.println("Estado impresora : apagada");
                    }
                    break;
                case "3":
                    if (impresora.estado) {
                        System.out.println("Introduzca el nombre: ");
                        String nombre = sc.next();
                        System.out.println("Introduzca el tamaño del documento: ");
                        String tamano = sc.next();
                        documento = new DocOfimatico(nombre, tamano);
                        impresora.enqueue(documento);
                    }else {
                        System.out.println("Enciende impresora");
                    }
                    break;
                case "4":
                    System.out.println(impresora);
                    break;
                case "5":
                    System.out.println("Imprimiendo...");
                    System.out.println(impresora.dequeue());
                    break;
                case "Q":
                    enntrada = true;
                    System.out.println("Saliendo...");
                    break;
            }
        }
    }
}
