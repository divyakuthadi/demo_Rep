package Retrylogic3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.IAnnotation;
import org.testng.annotations.ITestAnnotation;

import retrylogic2.analyser;

public class transform implements IAnnotationTransformer{
	
	public void Transform(ITestAnnotation annotation, Class testclass, Constructor testConstructor, Method testMethod) {
		annotation.setRetryAnalyzer(analyser.class);
	}

}
