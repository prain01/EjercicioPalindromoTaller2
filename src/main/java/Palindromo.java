import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Palindromo {

    public static String pedirRuta(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese ruta del archivo");
        return scanner.nextLine();
    }

    public static boolean verificarRuta(String ruta){
        File archivo;
        archivo = new File(ruta);
        if (archivo.exists()){
            System.out.println("Archivo encontrado.");
            return true;
        }else{
            System.out.println("Archivo NO encontrado");
            return false;
        }
    }

    public static int cantidadLineasArchivo(String ruta) {
        int i = 0;
        try {
            Scanner leer = new Scanner(new File(ruta));
            while (leer.hasNextLine()) {
                i++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return i;
    }

    public static String[] crearArreglo(String ruta){
        return new String[cantidadLineasArchivo(ruta)];
    }

    public static String[] leerArchivo(String[] arreglo, String ruta){
        int i = 0;
        try {
            Scanner leer = new Scanner(new File(ruta));
            while (leer.hasNextLine()){
                arreglo[i] = leer.nextLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return arreglo;
    }






}
