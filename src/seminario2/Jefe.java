
package seminario2;
public class Jefe extends Empleado {
    private float incentivo;

   public Jefe (String nombre, float salario, int anyoAlta, float bonificacion){
       super(nombre,salario,anyoAlta);
       this.incentivo= bonificacion;        
    }

    public void setIncentivo(float incentivo){
       this.incentivo= incentivo;  
    }
    
public String getDescripcion (){
        return "Soy"+getNombre() +" y gano "+ getSalario();
}
    
    public float getSalario(){    
       return  super.getSalario()+ super.getSalario()* incentivo;
    }

      public float getIncentivo() {
        return incentivo;
    }    
}
