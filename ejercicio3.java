import java.util.*;
public class ejercicio3 {
    public static void main(String[] args) {
        System.out.println("""
                            Un empleado trabaja 48 horas en la semana a razón de $5.000 hora. El porcentaje de\s
                            retención en la fuente es del 12,5% del salario bruto. Se desea saber cuál es el salario bruto,\s
                            la retención en la fuente y el salario neto del trabajador.\s
                            """);
        System.out.println(salario());
    }
    public static String salario(){
        double valorHora = 5000, horas = 48, porcentajeReteFuente = 0.125;
        double salario = valorHora*horas, reteFuente = (salario*porcentajeReteFuente);

        return  "El salario bruto es $" + salario +
                "\nLa retención en la fuente es $" + reteFuente +
                "\nEl salario neto es $" + (salario - reteFuente) + "\n";
    }
}
