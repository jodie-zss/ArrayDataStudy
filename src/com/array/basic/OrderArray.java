package com.array.basic;

public class OrderArray {

	private long[] a;
	private int nElems;
	
	public OrderArray(int max){
		a = new long[max];
		nElems = 0;
	}
	public int size(){
		return nElems;
	}
	public int find(long searchKey){
		int lowerBound = 0;
		int upperBound = nElems - 1;
		int curIn;
		while(true){
			curIn = (lowerBound + upperBound)/2;
			if(a[curIn]<searchKey){
				return nElems;
			}else{
				if(a[curIn] < searchKey){
					lowerBound = curIn + 1;
				}else{
					upperBound = curIn - 1;
				}
			}
		}
	}
	public void insert(long value){
		int j;
		for(j=0;j<nElems;j++){
			if(a[j] > value){
				break;
			}
		}
		for(int k=nElems;k<j;j--){
			a[k] = a[k-1];
		}
		a[j] = value;
		nElems++;
	}
	public boolean delete(long value){
		int j = find(value);
		if(j == nElems){
			return false;
		}else{
			for(int k=j;k<nElems;k++){
				a[k] = a[k+1];
			}
			nElems--;
			return true;
		}
	}
	public void display(){
		for(int j=0;j<nElems;j++){
			System.out.print(a[j]+" ");
		}
	}
	
	public static void main(String[] args) {
		int maxSize = 100;
		OrderArray arr = new OrderArray(maxSize);
		arr.insert(11);
		arr.insert(22);
		arr.insert(33);
		arr.insert(44);
		arr.insert(55);
		arr.insert(66);
		arr.insert(77);
		arr.insert(88);
		arr.insert(99);
		int searchKey = 66;
		if(arr.find(searchKey) !=arr.size()){
			System.out.println("Found"+searchKey);
		}else{
			System.out.println("Con't Found "+searchKey);
		}
		arr.display();
		arr.delete(11);
		arr.delete(22);
		arr.delete(33);
		arr.display();
	}
}
