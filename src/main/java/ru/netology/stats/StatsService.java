package ru.netology.stats;

public class StatsService {

    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;

        }
        return sum;
    }

    public int findAverage(int[] sales) {
        return calculateSum(sales) / sales.length;
    }

    public int monthOfMaximumSales(long[] sales) {
        int maximumMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maximumMonth]) {
                maximumMonth = month;
            }
            month = month + 1;
        }
        return maximumMonth + 1;
    }

    public int monthOfMinimumSales(long[] sales) {
        int minimumMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minimumMonth]) {
                minimumMonth = month;
            }
            month = month + 1;
        }
        return minimumMonth + 1;
    }

    public int findMonthsLessAverage(int[] sales) {
        int counter = 0;
        int average = findAverage(sales);
        for (int sale : sales) {
            if (sale < average) {
                counter++;
            }
        }
        return counter;
    }

    public int findMonthsMoreAverage(int[] sales) {
        int counter = 0;
        int average = findAverage(sales);
        for (int sale : sales) {
            if (sale > average) {
                counter++;
            }
        }
        return counter;
    }
}

