package cl.duoc;

import org.junit.Assert;
import org.junit.Test;

public class TestBuscar {

    public TestBuscar() {
    }
    
    @Test
    public void testBuscar() {
        System.out.println("Buscar");
        String rut = "11111111";
        BussEmpleado instance = new BussEmpleado();
        Assert.assertTrue(instance.Buscar(rut).getRut().equals(rut));
    }
}
