
package cl.duoc;

import org.junit.Assert;
import org.junit.Test;

public class TestCrear {

    public TestCrear() {
    }
    
    @Test
    public void testCrear() {
        System.out.println("Crear");
        Empleado empleado = new Empleado("12345678", "nombre", 1, 1);
        BussEmpleado instance = new BussEmpleado();      
        boolean esperado = true;
        boolean obtenido = instance.Crear(empleado);
        Assert.assertEquals(esperado, obtenido);
    }
}
