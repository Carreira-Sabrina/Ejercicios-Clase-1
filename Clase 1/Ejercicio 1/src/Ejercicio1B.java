public class Ejercicio1B {
    public static void main(String[] args) throws Exception {
        int numeroInicio = 5;
        int numeroFin = 14;
        // b) Mostrar sólo los números pares
        System.out.println("********************");
        System.out.println("MOSTRANDO LOS NUMEROS PARES ENTRE " + numeroInicio + " Y " + numeroFin);
        while (numeroInicio<=numeroFin) {
            if (numeroInicio % 2 == 0) {
                System.out.println(numeroInicio);
            }
           numeroInicio = numeroInicio + 1;            
        }
        System.out.println("********************");
    
    }
}
