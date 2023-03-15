
package EjercicioBancoATM;


public class CuentaCorriente extends Cuenta{
    public int numero_cuenta;
    public double saldo;
  
    public CuentaCorriente(int numero_cuenta, double saldo, String tipo, String propietario) {
        super(tipo, propietario);
        this.numero_cuenta = numero_cuenta;
        this.saldo = saldo;
    }

    public int getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(int numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void Debito(double d){
        
        saldo=saldo-d;
        
    }
    public void Credito(double c){
        
        saldo=saldo+c;
    }
    
}
