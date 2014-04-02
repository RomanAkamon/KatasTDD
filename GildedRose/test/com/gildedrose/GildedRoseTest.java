package com.gildedrose;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GildedRoseTest
{

    private static final int QUALITY_UPPER_LIMIT = 50;
    private static final int QUALITY_LOWER_LIMIT = 0;

    private Item item;
    private GildedRose gildedRose;

    @Before
    public void setUp() throws Exception
    {
    }

    @Test
    public void everyDatSellInAndQualityDecreases()
    {
        final int anySellIn = 3;
        final int anyQuality = 4;
        final int expectedSellIn = anySellIn - 1;
        final int expectedQuality = anyQuality - 1;

        Item items[] = new Item[]{new Item("anyItem", anySellIn, anyQuality)};

        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        assertEquals("SellIn not decreases after day", expectedSellIn, items[0].sellIn);
        assertEquals("Quality not decreases after day", expectedQuality, items[0].quality);
    }

    @Test
    public void itemExpiredDecresesQualityTwiceFast()
    {
        final int expiredSellIn = 0;
        final int anyQuality = 4;
        final int expectedQuality = 2;

        Item items[] = new Item[]{new Item("anyItem", expiredSellIn, anyQuality)};

        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        assertEquals("item Expired not decreases twice fast", expectedQuality, items[0].quality);
    }

    @Test
    public void agedBrieIncreasesQuality()
    {
        final int anySellIn = 3;
        final int anyQuality = 4;
        final int expectedQuality = anyQuality + 1;

        Item items[] = new Item[]{new Item("Aged Brie", anySellIn, anyQuality)};

        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        assertEquals("Aged Brie not increase quality", expectedQuality, items[0].quality);
    }

    @Test
    public void qualityHasUpperLimit()
    {
        final int upperLimit = 50;
        final int upperLimitQuality = 50;
        final int anySellIn = 3;

        Item items[] = new Item[]{new Item("Aged Brie", anySellIn, upperLimitQuality)};

        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        assertEquals("Aged Brie not increase quality", upperLimit, items[0].quality);

    }

    @Test
    public void sulfurasIsLegendary()
    {
        final int sellIn = 5;
        final int anyQuality = 5;
        final int expectedQuality = anyQuality;
        final int expectedSellIn = sellIn;

        Item items[] = new Item[]{new Item("Sulfuras, Hand of Ragnaros", sellIn, anyQuality)};

        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        assertEquals("sulfuras changed quality", expectedQuality, items[0].quality);
        assertEquals("sulfuras changed SellIn", expectedSellIn, items[0].sellIn);

    }

    @Test
    public void backStageIncreaseInQuaility()
    {
        final int longSellIn = 50;
        final int anyQuality = 5;
        final int expectedQuality = anyQuality + 1;

        Item items[] = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", longSellIn, anyQuality)};

        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        assertEquals("sulfuras changed quality", expectedQuality, items[0].quality);
    }

    @Test
    public void backStageIncreaseTwiceFasterWhenConcertIsNear()
    {
        final int concertNearSellIn = 9;
        final int anyQuality = 5;
        final int expectedQuality = anyQuality + 2;

        Item items[] = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", concertNearSellIn, anyQuality)};

        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        assertEquals("sulfuras changed quality", expectedQuality, items[0].quality);
    }

    @Test
    public void backStageIncreasesThreeTimesFasterWhenConcertIsInminent()
    {
        final int concertNearSellIn = 4;
        final int anyQuality = 5;
        final int expectedQuality = anyQuality + 3;

        Item items[] = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", concertNearSellIn, anyQuality)};

        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        assertEquals("sulfuras changed quality", expectedQuality, items[0].quality);
    }

    @Test
    public void backstageLoseAllQualityWhenConcertIsOver()
    {
        final int concertIsOver = 0;
        final int anyQuality = 5;
        final int expectedQuality = 0;

        Item items[] = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", concertIsOver, anyQuality)};

        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        assertEquals("sulfuras changed quality", expectedQuality, items[0].quality);
    }
}

