package personal;

public class Personal {
    public String nombre, apellido,email;
    public int edad;
    private double sueldo;
    
    public double getSueldo(){
        return this.sueldo;
    }
    public void setSueldo(double nuevoSueldo){
        this.sueldo=nuevoSueldo;
    }
    public Personal(String nombre,String apellido,int edad){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
    }
}

