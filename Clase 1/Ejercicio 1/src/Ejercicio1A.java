public class Ejercicio1A {
    public static void main(String[] args) throws Exception {
        // a) Mostrar numeros en un cierto rango
        int numeroInicio = 5;
        int numeroFin = 14;
        System.out.println("********************");
        System.out.println("MOSTRANDO LOS NUMEROS DEL " + numeroInicio + " al " + numeroFin);

        while (numeroInicio<=numeroFin) {
            System.out.println(numeroInicio);
            numeroInicio = numeroInicio + 1;            
        }
        System.out.println("********************");
    }
}
