package cl.duoc;

import org.junit.Assert;
import org.junit.Test;

public class TestModificar {

    public TestModificar() {
    }
    
    @Test
    public void testModificar() {
        System.out.println("Modificar");       
        BussEmpleado instance = new BussEmpleado();
        String rut = "66666666";
        Empleado empleado = instance.Buscar(rut);
        empleado.setEdad(100);
        boolean esperado = true;      
        boolean obtenido = instance.Modificar(empleado);
        Assert.assertEquals(esperado, obtenido);
    }
}
