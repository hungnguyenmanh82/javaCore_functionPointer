package com.example.function;

/**
 * Chỉ dùng từ Java8 => dùng cú pháp Lambda rất hay gọi function pointer giống hệt C++.
Cách này hạn chế viết code rất nhiều. Vẫn có thể jump hàm bình thường “Ctrl+click”, 
vẫn có thể Search với lệnh “Ctrl +Shift +G” trên Eclipse.
Eclipse vẫn check lỗi cú pháp khi function pointer ko đúng tham số.

 *
 */

public class App1_functionPointer {

	public static void main(String[] args) {
		//dùng Lambda syntax => dùng như pointer function trên C++
		functionRunable(App1_functionPointer::sayHello);  // prints "Hello"
	}

    /**
			@FunctionalInterface
			public interface Runnable {
			    public abstract void run();
			}
			
     */
	// xem khai bao Runable interface  => @FunctionalInterface
    static void functionRunable(Runnable toRun) {
        toRun.run();
    }

    // funtion pointer cùng kiểu dữ liệu với Runnable.run()
    static void sayHello() {
        System.out.println("Hello");
    }
}
