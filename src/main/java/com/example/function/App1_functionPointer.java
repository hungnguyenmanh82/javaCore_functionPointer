package com.example.function;

import java.util.function.Function;

/**
 * Chỉ dùng từ Java8 => dùng cú pháp Lambda rất hay gọi function pointer giống hệt C++.
Cách này hạn chế viết code rất nhiều. Vẫn có thể jump hàm bình thường “Ctrl+click”, 
vẫn có thể Search với lệnh “Ctrl +Shift +G” trên Eclipse.
Eclipse vẫn check lỗi cú pháp khi function pointer ko đúng tham số.

 *
 */

public class App1_functionPointer {

	public static void main(String[] args) {
		// for java 8
		//dùng Lambda syntax => dùng như pointer function trên C++
		// cách 1:
		functionRunable(App1_functionPointer::sayHello);  // prints "Hello"
		
		
		//cách 2:
		Function<Double, Double> square = App1_functionPointer::square;
		double a = square.apply(23d);
		
		
		//cách 3:
		Hey hey = new Hey();
		Function<Double, Double> square2 = hey::square;
		double b = square2.apply(23d);
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
    
    public static double square(double num){
        return Math.pow(num, 2);
    }
    
    static class Hey {
        public double square(double num) {
            return Math.pow(num, 2);
        }
    }
}
