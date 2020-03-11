package com.example.function;


/**
 * Chỉ dùng từ Java8 => dùng cú pháp Lambda rất hay gọi function pointer giống hệt C++.
Cách này hạn chế viết code rất nhiều. Vẫn có thể jump hàm bình thường “Ctrl+click”, 
vẫn có thể Search với lệnh “Ctrl +Shift +G” trên Eclipse.
Eclipse vẫn check lỗi cú pháp khi function pointer ko đúng tham số.

 *
 */
public class App4_functionPointer_return {

	public static void main(String[] args) {
		
		//dùng Lambda syntax => dùng như pointer function trên C++
		functionHandler(App4_functionPointer_return::functionPointer1);
		
		functionHandler(App4_functionPointer_return::functionPointer2);
		
		//=========================================
		

	}

	
	/**
			@FunctionalInterface
			public interface FunctionReturn<E,K> {
			  E filter(K k);
			}
	 */
	// define input cua funtion la 1 @FunctionalInterface
    static String functionHandler(FunctionReturn<String,String> handler) {
    	return handler.filter("input value");
    }


    // funtion pointer => cùng kiểu dữ liệu với Handler.handler(String,String)
    static String functionPointer1(String st1) {
    	System.out.println("functionPointer1:"+st1 );
    	return st1 + 1;
    }
    

    static String functionPointer2(String st1) {
    	System.out.println("functionPointer2:"+st1);
    	return st1+ 2;
    }
}
