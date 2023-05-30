package ex.aop.pojo.core;

public class TestServiceImpl implements TestService {
	private String value; 
	
	public TestServiceImpl() {
		this.value = "AOP 테스트 !!!"; 
	}
	
	@Override
	public void save(String value) {
		System.out.println("[save 메소드...]");
		this.value = value;
	}

	@Override
	public void write() {
		//int a = Integer.parseInt("a");
		
		System.out.println("[write 메소드...]");
		System.out.println(value);
	}

}
