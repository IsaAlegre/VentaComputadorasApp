package MundoPC.servicio;

import MundoPC.modelo.Computadora;

import java.util.ArrayList;
import java.util.List;

public class Orden {
    private final int idOrden;
    private final List<Computadora> compuradoras;
    private static int contadorOrdenes;

    public Orden(){
        compuradoras = new ArrayList<>();
        this.idOrden = ++contadorOrdenes;
    }

    public void agregarComputadoras(Computadora compuradora){
        compuradoras.add(compuradora);
    }

    public void mostrarOrden(){
        System.out.println("Orden #:" + idOrden);
        System.out.println("Total computadoras: " + compuradoras.size());
        System.out.println();
        compuradoras.forEach(System.out::println);
    }
}
