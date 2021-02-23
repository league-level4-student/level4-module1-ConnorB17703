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
		
		T[] newArr = (T[]) new Object[memberArr.length+1];
		
		for(int i = 0; i < newArr.length; i++){
			if(i< loc){
				newArr[i] = memberArr[i];
			}
			else if(i>loc){
				newArr[i] = memberArr[i-1];
			}
			else{
				newArr[i] = val;
			}
		}
		memberArr = newArr;
		
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		memberArr[loc] = val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {

		T[] newArr = (T[]) new Object[memberArr.length-1];
		
		for(int i = 0; i < newArr.length; i++){
			if(i< loc){
				newArr[i] = memberArr[i];
			}
			else if(i>loc){
				newArr[i-1] = memberArr[i];
			}
			else{
				continue;
			}
		}
		memberArr = newArr;
	}
	
	public boolean contains(T val) {
		
		for(int i = 0; i<memberArr.length;i++){
			if(memberArr[i] == val){
				return true;
			}
		}
		return false;
	}
	
	
	public int size(){
		return memberArr.length;
		
	}
	
}