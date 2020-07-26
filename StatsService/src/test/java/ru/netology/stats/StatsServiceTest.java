package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalculateSumAllSales() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();
        int actual = service.calculateSum(sales);

        int expected = 180;
        assertEquals(expected, actual);

        System.out.println("Сумма всех продаж = " + actual);
    }


    @Test
    void shouldCalculateAverageSales() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();
        int actual = service.calculateAverageSales(sales);

        int expected = 15;
        assertEquals(expected, actual);

        System.out.println("Средняя сумма продаж = " + actual);
    }


    @Test
    void findMax() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();
        int actual = service.findMax(sales);

        int expected = 8;
        assertEquals(expected, actual);

        System.out.println("Максимальная продажа в " + actual + " месяце");
    }


    @Test
    void findMin() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();
        int actual = service.findMin(sales);

        int expected = 11;
        assertEquals(expected, actual);

        System.out.println("Минимальная продажа в " + actual + " месяце");
    }


    @Test
    void shouldCalculateBelowAverageSales() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();
        int actual = service.calculateBelowAverageSales(sales);

        int expected = 5;
        assertEquals(expected, actual);

        System.out.println("Кол-во месяцев, в которых продажи были ниже среднего = " + actual);
    }


    @Test
    void shouldCalculateAboveAverageSales() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();
        int actual = service.calculateAboveAverageSales(sales);

        int expected = 5;
        assertEquals(expected, actual);

        System.out.println("Кол-во месяцев, в которых продажи были выше среднего = " + actual);
    }

}