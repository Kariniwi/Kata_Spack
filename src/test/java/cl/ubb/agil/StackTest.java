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
	@Test 
	public void agregaValor(){
		int v=1;
		Stack pila= new Stack();
		pila.agregar(v);
		boolean r= pila.stackVacio();
		assertFalse(r);		
	}
	@Test
	public void agregaDosValores(){
		Stack pila= new Stack();
		pila.agregar(1);
		pila.agregar(2);
		boolean r= pila.stackVacio();
		assertFalse(r);		
	}
	@Test
	public void StackEsDos(){
		Stack pila= new Stack();
		pila.agregar(1);
		pila.agregar(2);
		int v=pila.cont;
		assertThat(v,is(2));
	}
	@Test
	public void retornaUno(){
		Stack pila= new Stack();
		int v=pila.agregar(1);
		assertThat(v,is(1));
	}
}
