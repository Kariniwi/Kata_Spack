package cl.ubb.agil;

public class Stack {
	int cont=0;
	//public Stack pila= new Stack(); 
	
	public boolean stackVacio(){
		if(cont>0){
			return false;
		}else{
			return true;
		}
	}

	public void agregar(){
		cont ++;
	}
}
