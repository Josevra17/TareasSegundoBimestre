
package EjercicioBancoATM;


public class CajaAhorro  extends Cuenta{
    
    public int numero_cuenta;
    public double saldo;

    
    
    public CajaAhorro(int numero_cuenta, double saldo, String tipo, String propietario) {
        super(tipo, propietario);
        this.numero_cuenta = numero_cuenta;
        this.saldo = saldo;
    }
    
    public void Debito(double d){
        
        saldo=saldo-d;
    }
    public void Credito(double c){
        saldo=saldo+c;
    }
}
