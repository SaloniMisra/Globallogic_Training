//create lambda to find largest no.
package com.globallogic.lambda;
interface coder{
	public int max(int a,int b);
}
public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
coder cc=(a,b)->{return Math.max(a,b);
};
System.out.println(cc.max(12, 89));
	}

}
