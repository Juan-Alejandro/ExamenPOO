package domain.models;

public class AutoElectrico extends Vehiculo{
    
    
    private int bateria;
    
    public AutoElectrico(String marca, String modelo, 
            int anio, double velocidad , int bateria)
    {
        super(marca, modelo, anio, velocidad);
        this.bateria = bateria;
    }

    public int getBateria()
    {
        return bateria;
    }

    public void setBateria(int bateria)
    {
        this.bateria = bateria;
    }
    
    public void cargarBateria(int porcentaje) {
        if (this.bateria != 100) {
            this.bateria = bateria + porcentaje;
            if(this.bateria > 100) {
                this.bateria = 100;
            }
        }
    }
    
    @Override 
    public String toString(){
        return super.mostrarInfo() + "\nBateria: " + bateria;
    }
    
    
}
