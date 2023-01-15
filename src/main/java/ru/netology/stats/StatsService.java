package ru.netology.stats;

public class StatsService {

    public long sum(long[] sales) { // 1.сумма всех продаж
        long result = 0;
        for (long sale : sales) {
            result += sale;

        }
        return result;
    }

    public long average(long[] sales) { //2.среднюю сумму продаж в месяц
        long result = sum(sales);
        return result / sales.length;
    }

    public int maxSum(long[] sales) { //3.номер месяца - пик продаж, т.e. продажи на max сумму
        int monthMax = 0;
        long maxSumSale = sales[0];
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] >= maxSumSale) {
                maxSumSale = sales[i];
                monthMax = i;

            }

        }
        return monthMax + 1;
    }

    public int minSum(long[] sales) { //4.номер месяца - min продаж, т.e. продажи на min сумму
        int monthMin = 0;
        long minSumSale = sales[0];
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] <= minSumSale) {
                minSumSale = sales[i];
                monthMin = i;
            }

        }
        return monthMin + 1;
    }

    public int belowAverage(long[] sales) { //5.количество месяцев - продажи были ниже среднего
        int counter = 0;
        long averageSale = average(sales);

        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;

            }
        }
        return counter;
    }

    public int aboveAverage(long[] sales) { //6.количество месяцев - продажи были выше среднего
        int counter = 0;
        long averageSale = average(sales);

        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;

            }
        }
        return counter;


    }
}
