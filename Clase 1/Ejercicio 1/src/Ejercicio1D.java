public class Ejercicio1D {
    public static void main(String[] args) throws Exception {
        // d) Utilizando la sentencia for, hacer lo mismo que en (b) pero invirtiendo el orden
        int numeroInicio = 5;
        int numeroFin = 14;
        for (int i = numeroFin; i >= numeroInicio; i--) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
        
    
    }
}