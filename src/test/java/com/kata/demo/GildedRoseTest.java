package com.kata.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class GildedRoseTest {

	@ParameterizedTest
	@CsvSource(value = { 
			"foo; 2; 10; 1; 9",
			"foo; 1; 0; 0; 0",
			}, delimiter = ';')
	void item_foo_update_quality_success(String itemName, int sellin, int quality, int expectedSellin,
			int expectedQuality) {
		// Arrange
		Item[] items = new Item[] { new Item(itemName, sellin, quality) };
		Item expectedItem = new Item(itemName, expectedSellin, expectedQuality);

		// Act
		GildedRose app = new GildedRose(items);
		app.updateQuality();

		// Assert
		Item actualItem = app.items[0];
		assertThat(expectedItem).usingRecursiveComparison().isEqualTo(actualItem);
	}

	@ParameterizedTest
	@CsvSource(value = { 
			"foo; 0; 10; -1; 8",
			"foo; 0; 0; -1; 0",
			}, delimiter = ';')
	void item_foo_sellin_expired_update_quality_success(String itemName, int sellin, int quality, int expectedSellin,
			int expectedQuality) {
		// Arrange
		Item[] items = new Item[] { new Item(itemName, sellin, quality) };
		Item expectedItem = new Item(itemName, expectedSellin, expectedQuality);

		// Act
		GildedRose app = new GildedRose(items);
		app.updateQuality();

		// Assert
		Item actualItem = app.items[0];
		assertThat(expectedItem).usingRecursiveComparison().isEqualTo(actualItem);
	}
	
	@ParameterizedTest
	@CsvSource(value = { 
			"Aged Brie; 3; 30; 2; 31",
			"Aged Brie; 3; 49; 2; 50",
			"Aged Brie; 3; 50; 2; 50",
			"Aged Brie; 0; 30; -1; 32",
			}, delimiter = ';')
	void item_Aged_Brie_update_quality_success(String itemName, int sellin, int quality, int expectedSellin,
			int expectedQuality) {
		// Arrange
		Item[] items = new Item[] { new Item(itemName, sellin, quality) };
		Item expectedItem = new Item(itemName, expectedSellin, expectedQuality);

		// Act
		GildedRose app = new GildedRose(items);
		app.updateQuality();

		// Assert
		Item actualItem = app.items[0];
		assertThat(expectedItem).usingRecursiveComparison().isEqualTo(actualItem);
	}
	
	@ParameterizedTest
	@CsvSource(value = { 
			"Aged Brie; 0; 30; -1; 32",
			}, delimiter = ';')
	void item_Aged_Brie_sellin_expired_update_quality_success(String itemName, int sellin, int quality,
			int expectedSellin, int expectedQuality) {
		// Arrange
		Item[] items = new Item[] { new Item(itemName, sellin, quality) };
		Item expectedItem = new Item(itemName, expectedSellin, expectedQuality);

		// Act
		GildedRose app = new GildedRose(items);
		app.updateQuality();

		// Assert
		Item actualItem = app.items[0];
		assertThat(expectedItem).usingRecursiveComparison().isEqualTo(actualItem);
	}
	
	
	@ParameterizedTest
	@CsvSource(value = { 
			"Backstage passes to a TAFKAL80ETC concert; 5; 10; 4; 13",
			"Backstage passes to a TAFKAL80ETC concert; 4; 48; 3; 50",
			"Backstage passes to a TAFKAL80ETC concert; 10; 10; 9; 12",
			"Backstage passes to a TAFKAL80ETC concert; 10; 48; 9; 50",
			}, delimiter = ';')
	void item_Backstage_update_quality_success(String itemName, int sellin, int quality, int expectedSellin,
			int expectedQuality) {
		// Arrange
		Item[] items = new Item[] { new Item(itemName, sellin, quality) };
		Item expectedItem = new Item(itemName, expectedSellin, expectedQuality);

		// Act
		GildedRose app = new GildedRose(items);
		app.updateQuality();

		// Assert
		Item actualItem = app.items[0];
		assertThat(expectedItem).usingRecursiveComparison().isEqualTo(actualItem);
	}
	
	@ParameterizedTest
	@CsvSource(value = { 
			"Backstage passes to a TAFKAL80ETC concert; 0; 48; -1; 0",
			}, delimiter = ';')
	void item_Backstage_sellin_expired_update_quality_success(String itemName, int sellin, int quality,
			int expectedSellin, int expectedQuality) {
		// Arrange
		Item[] items = new Item[] { new Item(itemName, sellin, quality) };
		Item expectedItem = new Item(itemName, expectedSellin, expectedQuality);

		// Act
		GildedRose app = new GildedRose(items);
		app.updateQuality();

		// Assert
		Item actualItem = app.items[0];
		assertThat(expectedItem).usingRecursiveComparison().isEqualTo(actualItem);
	}
	
}