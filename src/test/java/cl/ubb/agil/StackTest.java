package cl.ubb.agil;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.hamcrest.CoreMatchers.is;

public class StackTest {
	@Test 
	public void creaStackVacio(){
		Stack pila= new Stack();
		boolean r;
		r=pila.stackVacio();
		assertTrue(r);
		
		
	}

}
