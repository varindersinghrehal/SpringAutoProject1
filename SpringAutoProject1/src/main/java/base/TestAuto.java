package base;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1, auto2;
		ApplicationContext context = new ClassPathXmlApplicationContext("aplicationContext3.xml");
		auto1 = (Auto)context.getBean("fiatbean");
		auto1.setModello("panda");
		auto1.show();
		auto2 = (Auto) context.getBean("bmwbean");
		auto2.setModello("serie 3");
		auto2.show();
	}
}
