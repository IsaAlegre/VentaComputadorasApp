package MundoPC;

import MundoPC.modelo.Computadora;
import MundoPC.modelo.Monitor;
import MundoPC.modelo.Raton;
import MundoPC.modelo.Teclado;

public class Main {
    public static void main(String[] args) {
        //objetos

        Raton RatonDell = new Raton("bluetooth", "Dell");
        System.out.println(RatonDell);

        Teclado TecladoDell = new Teclado("bluetooth", "Dell");
        System.out.println(TecladoDell);

        Monitor MonitorDell = new Monitor("Dell", 30);
        System.out.println(MonitorDell);

        Computadora compuradoraDell = new Computadora("Dell 7030", RatonDell, MonitorDell, TecladoDell);
        System.out.println(compuradoraDell);
    }
}