
package seminario2;


public class PruebaEmpleados {

    public static void main(String[] args) {
       Empleado [] empleados = new Empleado[3];
        empleados [0]= new Empleado ("Carlos",1000,2001);
        Jefe jefe = new Jefe ("Camilo",1200,1999,0.5f);
        empleados[1]= jefe;
        empleados[2]= new Administrativo ("Andres",900,2003,jefe);
    
        for (Empleado empleado : empleados) {
             if (empleado instanceof Jefe){
            Jefe jefe2= (Jefe)empleado;
            jefe.setIncentivo(0.8f);
                 System.out.println("Bonificación para :"+jefe.getNombre() );

             }
        }
        
    }
    
}
