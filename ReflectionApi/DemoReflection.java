package ReflectionApi;

import java.lang.reflect.Method;

//Usng Reflection Api

public class DemoReflection {
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("ReflectionApi.Test");
		
		Test test= (Test)c.newInstance();
		test.show(); //using for public method
		
		Method method = c.getDeclaredMethod("see", null);
		method.setAccessible(true);
		method.invoke(test, null);
		
	}

}
