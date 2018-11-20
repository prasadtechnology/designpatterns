package chanofresponsibility.design.pattern;

public class ChainObject2 implements ChainObjects{

	ChainObjects chainObjects;
	
	public void printText(int level){
		if(level == 1){
			System.out.println(" this is chain object2");	
		}else{
			this.chainObjects.printText(level);
		}
		
	}

	@Override
	public void setChainObject(ChainObjects chainObjects) {
		this.chainObjects = chainObjects;
	}
}
