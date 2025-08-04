import java.util.Scanner;

public class Codigo_Control_Colegio {
    public static void main(String[]args){
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del estudiante");
        estudiante estudiante1 = new estudiante(leer.nextLine());
        estudiante estudiante2 = null;
        // prueba de uso del operador ternario
        String Nombre1 = estudiante1 != null ? estudiante1.getNombre():"sin nombre";
        String Nombre2 = estudiante2 != null? estudiante2.getNombre():"sin estudiante";
        System.out.println("Nombre del estudiante: " + Nombre1);
        System.out.println("Nombrel del estudiante2 : " + Nombre2);

    }
}
