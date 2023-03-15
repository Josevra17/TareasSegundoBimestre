
package EjercicioBancoATM;

import java.util.ArrayList;


public class TransaccionConsulta extends TransaccionATM{
    public String consulta;

    public TransaccionConsulta(String consulta) {
        this.consulta = consulta;
    }

    public String getConsulta() {
        return consulta;
    }

    public void setConsulta(String consulta) {
        this.consulta = consulta;
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

}
    
    
   
