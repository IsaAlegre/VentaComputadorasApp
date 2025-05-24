package MundoPC.modelo;

public class Compuradora {
    private int idComputadora;
    private String nombre;
    private Raton raton;
    private Teclado teclado;
    private Monitor monitor;
    private static int contadorComputadoras;

    private Compuradora(){
        idComputadora = ++contadorComputadoras;
    }

    public Compuradora(String nombre, Raton raton, Monitor monitor, Teclado teclado){
        this();
        this.nombre = nombre;
        this.raton = raton;
        this.monitor = monitor;
        this.teclado = teclado;
    }

    @Override
    public String toString() {
        return "Compuradora{\n" +
                "idComputadora=" + idComputadora +
                ", nombre='" + nombre + '\'' +
                ",\n raton=" + raton +
                ",\n teclado=" + teclado +
                ",\n monitor=" + monitor +
                '}';
    }
}
