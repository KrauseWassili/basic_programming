/*
Wassili Krause HW_21_1 cochort_68M

Задача 1
Дано: Массив double из 12 значений - каждое значение доход от продаж за соответствующий месяц. Ваша задача:

посчитать доход за весь год
найти месяц (номер месяца) с самым большим доходом
 */

package app;

public class Task1 {
    public static void main(String[] args) {

        double[] monthIncomeArr = {12, 16, 64, 34, 53, 46, 89, 13, 23, 53, 45, 67};

        double yearIncome = monthIncomeArr[0];

        for (int i = 1; i < monthIncomeArr.length; i++) {
            yearIncome += monthIncomeArr[i];
        }

        System.out.println("Годовой доход составил " + yearIncome);

        double maxIncome = monthIncomeArr[0];
        for (int i = 1; i < monthIncomeArr.length; i++) {
            if (maxIncome < monthIncomeArr[i]) {
                maxIncome = monthIncomeArr[i];
            }
        }

        System.out.println("Номер месяца с самым большим доходом " + maxIncome);
    }
}
