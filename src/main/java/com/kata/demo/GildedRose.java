package com.kata.demo;

class GildedRose {

	private static final int MAX_QUALITY = 50;
	private static final String ITEM_AGED = "Aged Brie";
	private static final String ITEM_BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";
	private static final String ITEM_SULFURAS = "Sulfuras, Hand of Ragnaros";
	Item[] items;

	public GildedRose(Item[] items) {
		this.items = items;
	}

	public void updateQuality() {
		for (int i = 0; i < items.length; i++) {
			String itemName = items[i].name;
			switch (itemName) {
			case ITEM_SULFURAS:
				items[i].quality = 80;
				break;
			case ITEM_AGED:
			case ITEM_BACKSTAGE:
				updateItemAgedAndBackstageQuality(items[i]);
				break;

			default:
				updateItemQuality(items[i]);
			}
		}
	}

	private void updateItemQuality(Item item) {
		if (item.quality > 0) {
			item.quality = item.quality - 1;
		}

		item.sellIn = item.sellIn - 1;

		if (item.sellIn < 0 && item.quality > 0) {
			item.quality = item.quality - 1;
		}
	}

	private void updateItemAgedAndBackstageQuality(Item item) {
		if (item.quality < MAX_QUALITY) {
			item.quality = item.quality + 1;

			if (item.name.equals(ITEM_BACKSTAGE)) {
				if (item.sellIn < 11 && item.quality < MAX_QUALITY) {
					item.quality = item.quality + 1;
				}

				if (item.sellIn < 6 && item.quality < MAX_QUALITY) {
					item.quality = item.quality + 1;
				}
			}
		}

		item.sellIn = item.sellIn - 1;

		if (item.sellIn < 0) {
			if (item.name.equals(ITEM_AGED) && item.quality < MAX_QUALITY) {
				item.quality = item.quality + 1;
			} else {
				item.quality = item.quality - item.quality;

			}
		}
	}
}
