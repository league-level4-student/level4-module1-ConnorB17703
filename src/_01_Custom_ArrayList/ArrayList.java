package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	
	T[] memberArr;
	
	public ArrayList() {
		memberArr = (T[])new Object[0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		return memberArr[loc];
	}
	
	public void add(T val) {
		T[] arr2 = (T[]) new Object[memberArr.length+1];
		
		arr2[arr2.length-1] = val;
		
		for(int i =0; i<memberArr.length; i++){
			arr2[i] = memberArr[i];
		}
		memberArr = arr2;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		
		//You left off on this method, FINISH IT
		
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		
	}
	
	public boolean contains(T val) {
		
		return false;
	}
}