package extia.FooBarQix2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FooBarQix2Test {
	
	private FooBarQix2 FooBarQix=new FooBarQix2();
	
	@Test
	public void shouldDisplayTheNumber() {
		assertEquals("1",FooBarQix.function(1));		
	}
	

	@Test
	public void shouldDisplayFooOrBarbasedOnDivision() {
		assertEquals(("Foo"),FooBarQix.function(6) );
		assertEquals(("Bar"),FooBarQix.function(10));
	
	}


	@Test
	public void shouldDisplayFooOrBarOrQixBasedOnDigits() {
		assertEquals(("Qix"),FooBarQix.function(7) );
		assertEquals(("Foo"),FooBarQix.function(13) );
		assertEquals(("Bar"),FooBarQix.function(52) );	
	}

	
	@Test
	public void shouldDisplayCombinedTextBasedOnDigits() {
		assertEquals(("FooBar"),FooBarQix.function(352));
	}
	
	@Test
	public void shouldMixTextForMultiplesAndForDigits() {
		assertEquals(("FooBarBar"),FooBarQix.function(15));
		assertEquals(("BarFooBar"),FooBarQix.function(35));
		assertEquals(("FooQix"),FooBarQix.function(27));
	}
	@Test
	public void shouldDisplayTextRepeatedlyBasedOnDigits() {
		assertEquals(("FooFooFoo"),FooBarQix.function(33));
		assertEquals(("BarBarBar"),FooBarQix.function(55));
	}
	
	

	@Test
	public void shouldCeepTheOrderOfTheDigits() {
		assertEquals(("BarFoo"),FooBarQix.function(53));
	}
	/*
	

	@Test
	public void should_display_numbers_from_1_to_a_value() {
		assertEquals(FooBarQix.asTextUpTo(2), ("1\n2"));
	}
}*/
}
