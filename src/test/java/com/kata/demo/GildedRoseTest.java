package com.kata.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class GildedRoseTest {

	@ParameterizedTest
	@CsvSource(value = { 
			"10; 9",
			"0; 0",
			}, delimiter = ';')
	void item_foo_update_quality_success(int itemQuality, int expectedQuality) {
		Item[] items = new Item[] { new Item("foo", 3, itemQuality) };
		GildedRose app = new GildedRose(items);
		app.updateQuality();
		Item actualItem = app.items[0];
		assertEquals(expectedQuality, actualItem.quality);
	}

}