public class Ejercicio1C {
    public static void main(String[] args) throws Exception {
        //Mediante una variable elegir si se imprimen los números pares o impares
        int numeroInicio = 5;
        int numeroFin = 14;
        String numerosAImprimir = "impares";
        System.out.println("**********************");
        System.out.println("IMPRIMIENDO LOS NUMEROS: " + numerosAImprimir );
        while (numeroInicio<=numeroFin) {
            if(numerosAImprimir =="pares" && numeroInicio % 2 ==0){
                System.out.println(numeroInicio);
            }else if (numerosAImprimir =="impares" && numeroInicio % 2 !=0) {
                System.out.println(numeroInicio);
            }
            numeroInicio = numeroInicio + 1;
        }
        
    
    }
}