package com.kata.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GildedRoseTest {

	@Test
	void item_foo_update_quality_success() {
		Item[] items = new Item[] { new Item("foo", 0, 0) };
		Item expectedItem = items[0];
		GildedRose app = new GildedRose(items);
		app.updateQuality();
		Item actualItem = app.items[0];
		assertEquals(expectedItem.name, actualItem.name);
	}

}