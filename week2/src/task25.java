

public class task25 {
	
	private Object obj;
	
	public task25(Object input){
		this.obj = input;
	}
	public task25(){
		this.obj = null;
	}
	
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public Object getObj() {
		return obj;
	}
	
	public String pair(task25 element){
		return this.toString() + element.toString();
	}
	
	@Override
	public String toString(){
		return obj.toString(); 
	}
	@Override
	public boolean equals(Object other){
		if((this.getClass() != other.getClass()) || other == null){
			return false;
		}
		if(other == this){
			return true;
		}
		task25 helper = (task25) other;
		
		return this.obj == helper.obj;
	}
	@Override
	public int hashCode(){
		int hash = 7;
		hash = 31 * hash;
		hash = 31 * hash + (obj == null ? 0 : obj.hashCode());
		return hash;
		
	}
	
	public static void main(String[] args) {
		task25 first = new task25(2.4);
		task25 second = new task25(2.5);
		
		System.out.println(second.pair(first));
		
		
		System.out.println(first.equals(second));
	}
}