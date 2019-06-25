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
/*		functionHandler(App3_functionPointer_params::functionPointer1);  // 

		functionHandler(App3_functionPointer_params::functionPointer2);*/
		
		
		functionHandler(App2_functionPointer::functionPointer3); 
	}

	// define input cua funtion la 1 @FunctionalInterface
    static void functionHandler(Handler2<String,String> handler) {
    	handler.handle("param1","param2");
    }

    
    static void functionPointer1(String st) {
    	System.out.println("functionPointer1:"+st);
    }


    static void functionPointer2(String st) {
    	System.out.println("functionPointer2:"+st);
    }
    
    static void functionPointer3(String st1, String st2) {
    	System.out.println("functionPointer2:"+st1 + ":" + st2);
    }
}
