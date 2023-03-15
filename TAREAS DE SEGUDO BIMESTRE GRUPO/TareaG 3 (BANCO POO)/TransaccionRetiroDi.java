
package EjercicioBancoATM;

import java.util.ArrayList;


public class TransaccionRetiroDi extends TransaccionATM{
    public double monto;
    
    

    public TransaccionRetiroDi(double monto) {
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getIDdetransaccion() {
        return IDdetransaccion;
    }

    public void setIDdetransaccion(int IDdetransaccion) {
        this.IDdetransaccion = IDdetransaccion;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    
    public void extraccion(double retiro){
        monto=monto-retiro;
    }
    
}
