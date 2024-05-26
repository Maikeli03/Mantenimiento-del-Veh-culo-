
public class Vehiculo {
    private String marca;
    private String modelo;
    private int kilometraje; 

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = 0;
    } 

    public String getMarca() {
        return marca;
    } 

    public void setMarca(String marca) {
        this.marca = marca;
    } 

    public String getModelo() {
        return modelo;
    } 

    public void setModelo(String modelo) {
        this.modelo = modelo;
    } 

    public int getKilometraje() {
        return kilometraje;
    } 

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    } 

    public double realizarMantenimiento(double costoPorKilometro, int kilometrosRecorridos) {
        System.out.println("Realizando mantenimiento básico del vehículo.");
        double costoTotal = costoPorKilometro * kilometrosRecorridos;
        return costoTotal;
    }
}  
