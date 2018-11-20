package chanofresponsibility.design.pattern;

public class ChainObject3 implements ChainObjects{

	ChainObjects chainObjects;
	
	public void printText(int level){
		
		if(level == 2){
			System.out.println(" this is chain object3");	
		}else{
			new RuntimeException(" No one cant handle this request ....");
		}
		
	}

	@Override
	public void setChainObject(ChainObjects chainObjects) {
		this.chainObjects = chainObjects;
	}
	
}
