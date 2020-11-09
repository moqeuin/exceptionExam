package exceptionExam;

public class ExceptionExam {

	public static void main(String[] args) {
		
		System.out.println(1);
		/*
		에러 : 프로그램 코드에 의해 해결할 수 없는 심각한 오류(메모리 부족, 스택오버플로우)
		예외 : 프로그램 코드에 의해 해결할 수 있는 미약한 오류
		
		예외처리 : 실행 도중 예외 발생시 비정상 종료를 막고 정상적인 실행상태를 유지하기 위한 작업.
		
		try-catch문 실행과정
		try문을 실행하다 예외가 발생하면 다음 문장을 실행하지 않고 catch문들을에
		참조변수들을 생성
		*/
		try {
			System.out.println(0/0); // 예외가 발생하면 해당 예외 클래스의 인스턴스가 생성
			System.out.println(2); // 실행되지 않는다.
			
		}catch(ArithmeticException ae) { 
			// 인스턴스와 참조변수 ae를 instanceof으로 확인한다. 
			// |로 여러 개의 예외를 처리할 수 있다
			ae.printStackTrace();	// 
			System.out.println(3 + ae.getMessage()); // 예외 발생 시 실행할 문장
			
		}
		System.out.println(4);
		
		try {
			// 예외 발생시키기
			throw new Exception("고의로 에외 발생"); //예외인스턴스 생성 후 예외발생
			//throw new RuntimeException(); // try-catch문에 없어도 컴파일이 됨 
		}catch(Exception e){
			
			System.out.println("에러 메세지 " + e.getMessage()); // 고의로 예외발생메세지 출력
			e.printStackTrace(); //호출스택에 저장된 메서드와 예외정보를 화면에 출력
		}
		
		try {
			method();	// try-catch를 강제하게 해서 예외처리를 한다.
		} catch (Exception e) {
		
			e.printStackTrace();
		}finally {// 예외발생여부와 관계 없이 반드시 실행해야하는 코드를 명시한다.
			
			System.out.println("예외발생 여부와 관계 없이 실행");
		}
	}
	
	// 메서드를 사용할 때 처리해야할 메서드를 명시할 수 있다. 메서드 사용시 강제적으로 예외를 처리해야한다.
	static void method() throws Exception {
		
		throw new Exception();
	}
}
