package ru.netology.stats;

// Сумму всех продаж
public class StatsService {
    public int calculateSum(int[] sales) {
        int sum = 0;

        for (int item : sales) {
            sum = sum + item;
        }
        return sum;
    }


// Средняя сумма продаж в месяц
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


// Номер месяца, в котором был пик продаж
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


// Номер месяца, в котором был минимум продаж
    public int findMin(int[] sales) {
        // считаем средне-месячнуюю сумму продаж
        int months = 0;
        int sum = 0;
        for (int item : sales) {
            months += 1;
            sum += item;
        }
        int averageSum = sum / months;

        // ищем минимальные суммы
        int index = 0;
        int month = 0;

        for (int sale : sales) {
            index = index + 1;

            if (sale <= averageSum) {
                month = index;
            }
        }
        return month;
    }


// Кол-во месяцев, в которых продажи были ниже среднего
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


// Кол-во месяцев, в которых продажи были выше среднего
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