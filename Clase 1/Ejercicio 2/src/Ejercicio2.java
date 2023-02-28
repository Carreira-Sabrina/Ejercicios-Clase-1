public class Ejercicio2 {
    public static void main(String[] args) throws Exception {
        float ingresoMaximo = 489083;
        float ingresoMensual = 1;
		byte cantVehiculosMenos5Años = 1;
		byte cantInmuebles = 0;
		boolean poseeEmbarcacion = false;
		boolean poseeAeronave = false;
		boolean poseeActivosSocietarios = false;
		
		boolean ingresosAltos;

        if((ingresoMensual >= ingresoMaximo) || (cantVehiculosMenos5Años >=3)
        || (cantInmuebles>=3) || (poseeEmbarcacion || poseeAeronave || poseeActivosSocietarios)){
            ingresosAltos = true;
        }else {
            ingresosAltos = false;
        }
        String resultado = (ingresosAltos == true) ? "Nivel de ingresos altos" : "No pertenece al segmento de ingresos altos";
        System.out.println(resultado);
    }
}
