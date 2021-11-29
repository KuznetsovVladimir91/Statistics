package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();

        int[] enterpriseSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calculateSum(enterpriseSales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateAverage() {
        StatsService service = new StatsService();

        int[] enterpriseSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.findAverage(enterpriseSales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateMonthOfMaximumSales() {
        StatsService service = new StatsService();

        long[] enterpriseSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = service.monthOfMaximumSales(enterpriseSales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateMonthOfMinimumSales() {
        StatsService service = new StatsService();

        long[] enterpriseSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = service.monthOfMinimumSales(enterpriseSales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateMonthsLessAverage() {
        StatsService service = new StatsService();

        int[] enterpriseSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.findMonthsLessAverage(enterpriseSales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateMonthsMoreAverage() {
        StatsService service = new StatsService();

        int[] enterpriseSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.findMonthsMoreAverage(enterpriseSales);

        assertEquals(expected, actual);
    }
}
