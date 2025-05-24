package MundoPC.modelo;

public class Computadora {
    private int idComputadora;
    private String nombre;
    private Raton raton;
    private Teclado teclado;
    private Monitor monitor;
    private static int contadorComputadoras;

    private Computadora(){
        idComputadora = ++contadorComputadoras;
    }

    public Computadora(String nombre, Raton raton, Monitor monitor, Teclado teclado){
        this();
        this.nombre = nombre;
        this.raton = raton;
        this.monitor = monitor;
        this.teclado = teclado;
    }

    @Override
    public String toString() {
        return "Computadora{\n" +
                "idComputadora=" + idComputadora +
                ", nombre='" + nombre + '\'' +
                ",\n raton=" + raton +
                ",\n teclado=" + teclado +
                ",\n monitor=" + monitor +
                '}';
    }
}
