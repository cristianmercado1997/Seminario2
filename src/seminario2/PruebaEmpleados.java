
package seminario2;


public class PruebaEmpleados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
       /* Empleado empleado = new Empleado ("Juan",1000,2001);
        System.out.println("Empleado: "+ empleado.getNombre());
        
        empleado =new Jefe("Pedro",1200,1999,0.5f); */
        
       Empleado [] empleados = new Empleado[3];
        empleados [0]= new Empleado ("Juan",1000,2001);
        Jefe jefe = new Jefe ("Pedro",1200,1999,0.5f);
        empleados[1]= jefe;
        empleados[2]= new Administrativo ("Enrique",900,2003,jefe);
        
       
       
        for (Empleado empleado : empleados) {
             if (empleado instanceof Jefe){
            Jefe jefe2= (Jefe)empleado;
            jefe.setBonificacion(0.8f);
                 System.out.println(" Bonificación para :"+jefe.getNombre() );
            
                
        
             }
        }
      
         
        // System.out.println(" El empleado no es un jefe");
        
       /* Jefe jefe = new Jefe ("Pedro", 1200,1999,0.5f);
        System.out.println("Jefe :"+ jefe.getNombre());
        
        
       Administrativo admin = 
               new Administrativo ("Pedro",900,2003,jefe);
        System.out.println("Administrativo :" +admin.getNombre());
        System.out.println("Gana :"+admin.getSalario());
        
        */
        
        
        
    }
    
}
