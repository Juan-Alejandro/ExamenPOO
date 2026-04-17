package examenpracticopoo;

import domain.models.AutoElectrico;
import domain.models.Vehiculo;

public class Main
{

    public static void main(String[] args)
    {
        Vehiculo vehi = new Vehiculo("Toyota",
                "Corola",
                2022,
                0);
        
        AutoElectrico ae = new AutoElectrico("Nissan", 
                "X-Trail",
                2025,
                0 , 
                50);
        
        
        //Vehiculo estado inicial
        
        System.out.println("\n" +vehi.mostrarInfo());
        
        System.out.println("\nPuede circular: " + vehi.puedeCircular());
        
        System.out.println("\nTiempo estimado: " + 
                vehi.calcularTiempo(0));
        
        //Vehiculo con aceleracion
        
        vehi.acelerar(50);
        
        System.out.println("\n" + vehi.mostrarInfo());
        
        System.out.println("\nPuede circular: " + vehi.puedeCircular());
        
        System.out.println("\nTiempo estimado: " + 
                vehi.calcularTiempo(60));
        
        // Vehiculo Con freno
        
        vehi.frenar(30);
        
        System.out.println("\n" + vehi.mostrarInfo());
        
        System.out.println("\nPuede circular: " + vehi.puedeCircular());
        
        System.out.println("\nTiempo estimado: " + 
                vehi.calcularTiempo(30));
        
        //aceleracion()
        
        vehi.acelerar();
        
        System.out.println("\n" + vehi.mostrarInfo());
        
        System.out.println("\nPuede circular: " + vehi.puedeCircular());
        
        System.out.println("\nTiempo estimado: " + 
                vehi.calcularTiempo(30));
        
        //aceleracion(incremento,veces)
        
        vehi.acelerar(5, 20);
        
        System.out.println("\n" + vehi.mostrarInfo());
        
        System.out.println("\nPuede circular: " + vehi.puedeCircular());
        
        System.out.println("\nTiempo estimado: " + 
                vehi.calcularTiempo(30));
        
        
        //AUTO ELECTRICO
        
        System.out.println("\n" + ae);
        

        //Cargar bateria
        ae.cargarBateria(20);
        
        System.out.println("\n" + ae);
        



    } 
    
}
