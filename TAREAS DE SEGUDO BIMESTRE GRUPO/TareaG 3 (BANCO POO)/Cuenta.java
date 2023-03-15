
package EjercicioBancoATM;


public class Cuenta {
    public String tipo;
    public String propietario;
    

    public Cuenta(String tipo, String propietario) {
        this.tipo = tipo;
        this.propietario = propietario;

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    
    
    
}
