package com.qualizeal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.stream.Stream;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@TestInstance(Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AppTest {
	static Class<?> operationClass;
	static Method operationMethod;
	static int counter1ForTest4, counter1ForTest5, counter1ForTest6,
			   counter2ForTest4, counter2ForTest5, counter2ForTest6, 
			   counter3ForTest4, counter3ForTest5, counter3ForTest6;

	@Test
	@Order(1)
	public void test1() {
		boolean isValidPackageAndClassName = true;
				
		try {
			operationClass = Class.forName("com.qualizeal.javaapp08.operation.FactorialNumber");
		} catch (ClassNotFoundException cnfEx) {
			isValidPackageAndClassName = false;
		} catch (NoClassDefFoundError ncdfErr) {
			isValidPackageAndClassName = false;
		}
		
		assertTrue(isValidPackageAndClassName, "Either the package name or class name does not match with either GUIDELINE 1 or GUIDELINE 2.");
	}

	boolean customConditionForClass() {
		return (operationClass == null) ? true : false;
	}

	@Test
	@Order(2)
	@DisabledIf("customConditionForClass")
	public void test2() {
		boolean isValidMethod = true;
		
		try {
			operationMethod = operationClass.getMethod("defineFactorialNumber");
			
			String expectedMethodSyntax = "public java.lang.String com.qualizeal.javaapp08.operation.FactorialNumber.defineFactorialNumber()";
			String actualMethodSyntax = operationMethod.toString();
			
			if (!actualMethodSyntax.equals(expectedMethodSyntax)) {
				isValidMethod = false;
			}
		} catch (NoSuchMethodException nsmEx) {
			isValidMethod = false;
		}
		
		operationMethod = null;
		
		
		assertTrue(isValidMethod, "The method name or syntax does not match with GUIDELINE 3.");
	}
	
	@Test
	@Order(3)
	@DisabledIf("customConditionForClass")
	public void test3() {
		boolean isValidMethod = true;
		
		try {
			operationMethod = operationClass.getMethod("generateFactorialNumber", Integer.TYPE);
			
			String expectedMethodSyntax = "public int com.qualizeal.javaapp08.operation.FactorialNumber.generateFactorialNumber(int)";
			String actualMethodSyntax = operationMethod.toString();
			
			if (!actualMethodSyntax.equals(expectedMethodSyntax)) {
				isValidMethod = false;
			}
		} catch (NoSuchMethodException nsmEx) {
			isValidMethod = false;
		}
		
		assertTrue(isValidMethod, "The method name or syntax does not match with either GUIDELINE 4 or GUIDELINE 5a, 5b, and 5c.");
	}
	
	boolean customConditionForMethod() {
		return (operationMethod == null) ? true : false;
	}

	static Stream<Arguments> numbersProviderForTest4() {
		return Stream.of(
					Arguments.of(1),
					Arguments.of(5),
					Arguments.of(10)
				);
	}

	@ParameterizedTest
	@MethodSource({"numbersProviderForTest4"})
	@Order(4)
	@DisabledIf("customConditionForMethod")
	public void test4(int num) {
		int[] sampleInputs = {1, 2, 3};
		int[] parameters1 = {1, 5, 10};
		int[] expectedResults = {1, 120, 3628800};
		
		try {
			Object classObject = operationClass.getDeclaredConstructor((Class<?>[]) new Class[0]).newInstance(new Object[0]);
			
			int actualResult = (int) operationMethod.invoke(classObject, num);
			
			assertEquals(expectedResults[counter1ForTest4++], actualResult, "The result generated by the method does not match with the Expected Output of Sample Input " + sampleInputs[counter2ForTest4++] + ": " + parameters1[counter3ForTest4++]);
		} catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException ex) {
		}
	}

	static Stream<Arguments> numbersProviderForTest5() {
		return Stream.of(
					Arguments.of(-10)
				);
	}

	@ParameterizedTest
	@MethodSource({"numbersProviderForTest5"})
	@Order(5)
	@DisabledIf("customConditionForMethod")
	public void test5(int num) {
		int[] sampleInputs = {4};
		int[] parameters1 = {-10};
		int[] expectedResults = {-1};
		
		try {
			Object classObject = operationClass.getDeclaredConstructor((Class<?>[]) new Class[0]).newInstance(new Object[0]);
			
			int actualResult = (int) operationMethod.invoke(classObject, num);
			
			assertEquals(expectedResults[counter1ForTest5++], actualResult, "The result generated by the method does not match with the Expected Output of Sample Input " + sampleInputs[counter2ForTest5++] + ": " + parameters1[counter3ForTest5++]);
		} catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException ex) {
		}
	}

	static Stream<Arguments> numbersProviderForTest6() {
		return Stream.of(
				Arguments.of(0)
			);
	}

	@ParameterizedTest
	@MethodSource({"numbersProviderForTest6"})
	@Order(6)
	@DisabledIf("customConditionForMethod")
	public void test6(int num) {
		int[] sampleInputs = {5};
		int[] parameters1 = {0};
		int[] expectedResults = {-2};
		
		try {
			Object classObject = operationClass.getDeclaredConstructor((Class<?>[]) new Class[0]).newInstance(new Object[0]);
			
			int actualResult = (int) operationMethod.invoke(classObject, num);
			
			assertEquals(expectedResults[counter1ForTest6++], actualResult, "The result generated by the method does not match with the Expected Output of Sample Input " + sampleInputs[counter2ForTest6++] + ": " + parameters1[counter3ForTest6
			                                                                                                                                                                                                                      ++]);
		} catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException ex) {
		}
	}
}