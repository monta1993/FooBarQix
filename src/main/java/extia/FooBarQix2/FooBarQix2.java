package extia.FooBarQix2;
/**
 * Author:montassar
 * Date:26/11/2018
 */

import java.util.HashMap;
import java.util.Map;

import java.util.stream.Collectors;
public class FooBarQix2 {

	public String function(int number) {
		String result="";
		Map<Integer, String> divisionMap = new HashMap<>();
		divisionMap.put(3, "Foo");
		divisionMap.put(5, "Bar");

		Map<Integer, String> containMap = new HashMap<>();
		containMap.put(3, "Foo");
		containMap.put(5, "Bar");
		containMap.put(7, "Qix");

		result = divisionMap.keySet().stream()
				.filter(toReplace -> number % toReplace == 0)
				.map(divisionMap::get)
				.collect(Collectors.joining());

		String toFooBar = String.valueOf(number);
		result += toFooBar.chars()
				.mapToObj(integerAsChar -> containMap.getOrDefault(Character.getNumericValue(integerAsChar), ""))
				.collect(Collectors.joining());
		return result.isEmpty() ? String.valueOf(toFooBar) : result;

	}

	public void doItTo(int maxNumber) {
	
		for (int i = 1; i <= maxNumber; i++) {
			System.out.println(function(i));	
		}
	}
}


