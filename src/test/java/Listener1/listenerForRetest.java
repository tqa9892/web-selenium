package Listener1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import Common.Retry;

public class listenerForRetest implements IAnnotationTransformer  {

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
	
	annotation.setRetryAnalyzer(Retry.class);
	}

}
