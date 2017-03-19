package com.array.basic;

public class HignArray {

	private long[] a;
	private int nElems;
	
	//构造函数
	public HignArray(int max){
		a = new long[max];
		nElems = 0;
	}
	//查询方法--某值在数组中是否存在
	public boolean find(long searchKey){
		int j;
		for(j=0;j<nElems;j++){
			if(a[j] == searchKey){
				break;
			}
		}
		if(j == nElems){
			return false;
		}else{
			return true;
		}
	}
	//插入方法--无序数组，插入到数组最后
	public void insert(long value){
		a[nElems] = value;
		nElems++;
	}
	//删除方法--删除某值，将后面的数据前移
	public boolean delete(long value){
		int j;
		for(j=0;j<nElems;j++){
			if(value == a[j]){
				break;
			}
		}
		if(j==nElems){
			return false;
		}else{
			for(int k=j;k<nElems;k++){
				a[k] = a[k+1];
			}
			nElems--;
			return true;
		}
	}
	//展示方法--显示数组中所有的数据
	public void display(){
		for(int j=0;j<nElems;j++){
			System.out.print(a[j]+" ");
		}
	}
	public static void main(String[] args) {
		int maxSize = 100;
		HignArray arr = new HignArray(maxSize);
		arr.insert(77);
		arr.insert(99);
		arr.insert(44);
		arr.insert(55);
		arr.insert(66);
		arr.insert(88);
		arr.insert(100);
		arr.display();
		System.out.println("");
		int searchKey = 35;
		if(arr.find(searchKey)){
			System.out.println("Found"+searchKey);
		}else{
			System.out.println("Con't found"+" "+searchKey);
		}
		arr.delete(44);
		arr.delete(55);
		arr.delete(66);
		
		arr.display();
	}
}
