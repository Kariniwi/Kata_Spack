package cl.ubb.agil;

public class Stack {
	public int cont=0;
	public int arr[]= new int [2];
	
	
	public boolean stackVacio(){
		if(cont>0){
			return false;
		}else{
			return true;
		}
	}

	public int agregar(int x){
		for(int i=0; i<2; i++){			
			arr[i]=x;	
		}
		cont++;
		return 1;
		
	}
}
