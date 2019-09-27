package cl.duoc;

import org.junit.Assert;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TestMontoBono {

    public TestMontoBono() {
    }
    
    @Test
    public void testMontoBono() {
        System.out.println("montoBono");       
        BussEmpleado instance = new BussEmpleado();
        String rut = "55555555";
        Empleado empleado = instance.Buscar(rut);
        int esperado = 200000;
        int obtenido = empleado.montoBono();
        Assert.assertTrue(esperado == obtenido);
    }
}
