package ru.netology.stats;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    @org.junit.jupiter.api.Test
    void shouldSumm() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 179;
        long average = service.getSummSales(purchases);
        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, average);
    }

    @org.junit.jupiter.api.Test
    void shouldAverage() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long average = service.getAverageSales(purchases);
        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, average);
    }

    @org.junit.jupiter.api.Test
    void shouldMonthMax() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long average = service.getMonthMaxSales(purchases);
        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, average);
    }

    @org.junit.jupiter.api.Test
    void shouldMonthMin() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long average = service.getMonthMinSales(purchases);
        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, average);
    }

    @org.junit.jupiter.api.Test
    void shouldMonthLessAverage() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long average = service.getMonthsLessAverage(purchases);
        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, average);
    }

    @org.junit.jupiter.api.Test
    void shouldMonthLargerAverage() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long average = service.getMonthLargerAverage(purchases);
        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, average);
    }
}
