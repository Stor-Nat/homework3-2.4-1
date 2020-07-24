package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] sales) {
        int sum = 0;

        for (int item : sales) {
            sum = sum + item;
        }
        return sum;
    }


    public int calculateAverageSales(int[] sales) {
        int months = 0;
        int sum = 0;
        for (int item : sales) {
            months += 1;
            sum += item;
        }
        int averageSum = sum / months;
        return averageSum;
    }

    public int findMax(int[] sales) {
        int currentMax = sales[0];  // берём за точку отсчёта первый элемент
        int index = 0;
        int month = 0;

        // перебираем по одному
        for (int sale : sales) {
            index = index + 1;
            // каждый раз сравниваем:
            // если тот, что у нас — меньше, чем текущий
            if (currentMax <= sale) {
                // выкидываем наш, а вместо него кладём в переменную текущий
                currentMax = sale;
                month = index;
            }
        }
        // возвращаем итоговый
        return month;
    }

    public int findMin(int[] sales) {
        int currentMin = sales[0];
        int index = 0;
        int month = 0;

        for (int sale : sales) {
            index = index + 1;

            if (currentMin > sale) {
                currentMin = sale;
                month = index;
            }
        }
        return month;
    }

    public int calculateBelowAverageSales(int[] sales) {
        int months = 0;
        int sum = 0;
        for (int item : sales) {
            months += 1;
            sum += item;
        }
        int averageSum = sum / months;

        int index = 0;
        for (int sale : sales) {
            if (sale < averageSum) {
                index = index + 1;
            }
        }
        return index;
    }

    public int calculateAboveAverageSales(int[] sales) {
        int months = 0;
        int sum = 0;
        for (int item : sales) {
            months += 1;
            sum += item;
        }
        int averageSum = sum / months;

        int index = 0;
        for (int sale : sales) {
            if (sale > averageSum) {
                index = index + 1;
            }
        }
        return index;
    }
}
