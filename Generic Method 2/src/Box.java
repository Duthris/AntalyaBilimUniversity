
public class Box <T,E> {
	
	private E secData;
	private T data;
	
	Box(T data, E secData) {
		
		this.data = data;
		this.secData = secData;
		
	}
	
	T getData () {
		
		return this.data;
		
	}
	
	E getSecData() {
		
		return this.secData;
	}

}
