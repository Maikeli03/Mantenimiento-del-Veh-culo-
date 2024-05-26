
class Camion extends Vehiculo {
    
    private int nivelDeAceiteMotor;
    private int nivelDeAceiteTransmision; 

    public Camion(String marca, String modelo) {
        super(marca, modelo);
        this.nivelDeAceiteMotor = 100;
        this.nivelDeAceiteTransmision = 100;
    } 

    public int getNivelDeAceiteMotor() {
        return nivelDeAceiteMotor;
    } 

    public void setNivelDeAceiteMotor(int nivelDeAceiteMotor) {
        this.nivelDeAceiteMotor = nivelDeAceiteMotor;
    } 

    public int getNivelDeAceiteTransmision() {
        return nivelDeAceiteTransmision;
    } 

    public void setNivelDeAceiteTransmision(int nivelDeAceiteTransmision) {
        this.nivelDeAceiteTransmision = nivelDeAceiteTransmision;
    } 

    @Override
    public double realizarMantenimiento(double costoPorKilometro, int kilometrosRecorridos) {
        double costoTotal = super.realizarMantenimiento(costoPorKilometro, kilometrosRecorridos);
        System.out.println("Realizando mantenimiento específico del camión: Revisión de niveles de aceite del motor y transmisión.");
        return costoTotal;
    }
}
public class Main {
    public static void main(String[] args) {
        double costoPorKilometro = 0.1; // Ejemplo de costo por kilómetro
        int kilometrosRecorridos = 200; // Ejemplo de kilómetros recorridos 

        Automovil auto = new Automovil("Toyota", "Corolla");
        double costoTotalAuto = auto.realizarMantenimiento(costoPorKilometro, kilometrosRecorridos);
        System.out.println("Costo total de mantenimiento del automóvil: " + costoTotalAuto); 

        Camion camion = new Camion("Volvo", "FH16");
        double costoTotalCamion = camion.realizarMantenimiento(costoPorKilometro, kilometrosRecorridos);
        System.out.println("Costo total de mantenimiento del camión: " + costoTotalCamion); 

        double costoMantenimientoAuto = auto.calcularCostoMantenimiento(costoPorKilometro, kilometrosRecorridos);
        System.out.println("Costo de mantenimiento del automóvil: " + costoMantenimientoAuto);
    }
}


