
package EjercicioBancoATM;

public class TransaccionTransferencia extends TransaccionATM {
    public double saldo;
    public int numero_cuenta;

    public TransaccionTransferencia(double saldo, int numero_cuenta) {
        this.saldo = saldo;
        this.numero_cuenta = numero_cuenta;
    }

    
}
