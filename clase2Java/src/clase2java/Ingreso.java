
package clase2java;


public class Ingreso {
    private String usuario,pass;
    private String miUsuario="Luis";
    private String miPass="123456";
  
    public String getUsuario(){
        return this.usuario;
    }
    public void setUsuario(String us){
        this.usuario=us;
    }
    public String getPass(){
        return this.pass;
    }
    public void setPass(String pass){
        this.pass=pass;
    }
    public boolean Validar(){
        return miUsuario.equals(this.usuario) && miPass.equals(this.pass);
    }
}


