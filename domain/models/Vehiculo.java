package domain.models;


public class Vehiculo
{
    private String marca;
    private String modelo;
    private int anio;
    private double velocidad;
    
    public Vehiculo(String marca, String modelo, 
            int anio, double velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.velocidad = 0;
    }
    
    
    //Getters
    public String getMarca()
    {
        return marca;
    }

    public String getModelo()
    {
        return modelo;
    }

    public int getAnio()
    {
        return anio;
    }

    public double getVelocidad()
    {
        return velocidad;
    }
    
    
    //Setters
    public void setMarca(String marca)
    {
        this.marca = marca;
    }

    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    public void setAnio(int anio)
    {
        this.anio = anio;
    }

    public void setVelocidad(double velocidad)
    {
        this.velocidad = velocidad;
    }
    
    
    //Metodos
    
    public void acelerar() {
        this.velocidad = velocidad + 10;
    }
    
    public void acelerar(int incremento) {
        this.velocidad = velocidad + incremento;
    }
    
    public void acelerar(int incremento,int veces) {
        for (int i = 0; i <= veces ; i++) {
            this.velocidad = velocidad + incremento;
        }
    }
    
    
    
    
    
    public void frenar(int decremento) {
        this.velocidad = velocidad - decremento;
    }
    
    
    public boolean puedeCircular() {
        if(this.velocidad > 0) {
            return true;
        }
        return false;
    }
    
    public double calcularTiempo(double distancia) {
        if(this.velocidad == 0) {
            return 0;
        }
        return distancia / velocidad;
    }
    
    
    public String mostrarInfo() {
        
        
        return "Vehiculo {\n" +
                "Marca:" + marca +
                "\nModelo: " + modelo +
                "\nAnio: " + anio+
                "\nVelocidad: " + velocidad + "}";
    }
}
