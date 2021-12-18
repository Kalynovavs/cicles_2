package ru.netology.stats;

public class StatsService {

    public long getSummSales(long[] sales) {
        long summ = 0;
        for (long sale : sales) {
            summ = summ + sale; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return summ;
    }

    public long getAverageSales(long[] sales) {
        long summ = getSummSales(sales);
        return summ / sales.length;
    }

    public int getMonthMaxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }


    public int getMonthMinSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int getMonthsLessAverage(long[] sales) {
        long average = getAverageSales(sales);
        int monthCount = 0;
        for (long sale : sales) {
            if (sale < average) {
                monthCount++;
            }
        }
        return monthCount;
    }

    public int getMonthLargerAverage(long[] sales) {
        long average = getAverageSales(sales);
        int monthCount = 0;
        for (long sale : sales) {
            if (sale > average) {
                monthCount++;
            }
        }
        return monthCount;
    }
}
