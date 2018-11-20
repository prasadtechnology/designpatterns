package chanofresponsibility.design.pattern;

public class ChainObject1 implements ChainObjects{

	ChainObjects nextObject;
	
	public void printText(int level){
		
		if(level == 0){
			System.out.println(" this is chain object1");	
		}else{
			this.nextObject.printText(level);
		}
		
	}

	@Override
	public void setChainObject(ChainObjects chainObjects) {
		this.nextObject = chainObjects;
	}
	
}
