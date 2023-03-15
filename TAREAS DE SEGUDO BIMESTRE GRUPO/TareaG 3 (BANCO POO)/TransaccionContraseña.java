
package EjercicioBancoATM;

public class TransaccionContraseña extends TransaccionATM{
    
    public int PINanterior;
    public int PINnuevo;

    public TransaccionContraseña(int PINanterior, int PINnuevo) {
        this.PINanterior = PINanterior;
        this.PINnuevo = PINnuevo;
    }
    public void CambioContraseña(){
        PINanterior=PINnuevo;
    }
}
