package annotation.java;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class SuppressWarningCase {

	@SuppressWarnings("unused")
	public void unusedVariable() {
		// 더 이상 사용되지 않는 변수에 대한 경고를 억제
		int unusedVariable = 0; // IDE 경고
	}

	@SuppressWarnings("deprecation")
	public void deprecatedVariable() {
		java.util.Date date = new java.util.Date();
		int year = date.getYear(); // IDE 경고
	}

	@SuppressWarnings({"rawtypes", "unchecked"})
	public void uncheckedCast() {
		// 제네릭 타입 캐스팅 경고 억제, raw 타입 사용 경고 억제
		List list = new ArrayList();
		// 제네릭 타입을 관련된 unchecked 캐스팅 경고를 억제
		List<String> stringList = (List<String>)list;
	}

	@SuppressWarnings("all")
	public void suppressAllWarnings() {
		int unusedVariable = 0; // IDE 경고
		java.util.Date date = new java.util.Date();
		int year = date.getYear(); // IDE 경고
		List list = new ArrayList();
		List<String> stringList = (List<String>)list;
	}
}
