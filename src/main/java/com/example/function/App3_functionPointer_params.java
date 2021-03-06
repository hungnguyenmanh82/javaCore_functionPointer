package com.example.function;


/**
 * Chỉ dùng từ Java8 => dùng cú pháp Lambda rất hay gọi function pointer giống hệt C++.
Cách này hạn chế viết code rất nhiều. Vẫn có thể jump hàm bình thường “Ctrl+click”, 
vẫn có thể Search với lệnh “Ctrl +Shift +G” trên Eclipse.
Eclipse vẫn check lỗi cú pháp khi function pointer ko đúng tham số.

 *
 */
public class App3_functionPointer_params {

	public static void main(String[] args) {
		
		//dùng Lambda syntax => dùng như pointer function trên C++
		functionHandler(App3_functionPointer_params::functionPointer3);
		
		functionHandler(App3_functionPointer_params::functionPointer4);
		
		functionHandler(App3_functionPointer_params::functionPointer5);
		
		
		
	}

	
	/**
			@FunctionalInterface
			public interface HandlerParams<E,K> {
			  void handle(E e, K k);
			}
	 */
	// define input cua funtion la 1 @FunctionalInterface
    static void functionHandler(HandlerParams<String,String> handler) {
    	handler.handle("param1","param2");
    }


    // funtion pointer => cùng kiểu dữ liệu với Handler.handler(String,String)
    static void functionPointer3(String st1, String st2) {
    	System.out.println("functionPointer3:"+st1 + ":" + st2);
    }
    
    // funtion pointer => cùng kiểu dữ liệu với Handler.handler(String,String)
    static void functionPointer4(String st1, String st2) {
    	System.out.println("functionPointer4:"+st1 + ":" + st2);
    }
    
    // funtion pointer => cùng kiểu dữ liệu với Handler.handler(String,String)
    static void functionPointer5(String st1, String st2) {
    	System.out.println("functionPointer5:"+st1 + ":" + st2);
    }
}
