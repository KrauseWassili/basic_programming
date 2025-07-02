/*
Задача 2.  Mail Delivery
Создать интерфейс MailDeliveryService с одним методом void sendMail().
Создайте класс DHL, который должен реализовать интерфейс MailDeliveryService.

Его способ отправки почты — напечатать что-то вроде: «Положи письмо в конверт, поставь марку, отправь».

Создайте класс Email, который должен реализовать интерфейс MailDeliveryService.
Его способ отправки почты - напечатать что-то вроде: «Отправить по Интернету».

Создайте класс Pigeon, который должен реализовать интерфейс MailDeliveryService.
Его способ отправки почты — напечатать что-то вроде: «Голубь?! Серьезно!? в двадцать первом веке?!!! Ты сумасшедший! Я улетаю»

Создайте класс Sender. Реализуйте в нем метод send(), который в качестве аргумента принимает
MailDeliveryService и отправляет почту с помощью данной службы.

Реализуйте диалог с пользователем (использовать Scanner), как отправлять почту и отправлять ее с помощью Sender.

 */

package app2;

import app2.model.DHL;
import app2.model.MailDeliveryService;
import app2.model.Pigeon;
import app2.model.Sender;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MailDeliveryService mailDeliveryService = null;

        switch (getSendMethodFromSender()) {
            case 1:
                mailDeliveryService = new DHL();
                break;
            case 2:
                mailDeliveryService = new Pigeon();
                break;
            default:
                System.out.println("Такого варианта отправки не существует");
        }

        if (mailDeliveryService != null)
            mailDeliveryService.sendMail();
    }

    public static int getSendMethodFromSender() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Как хотите отправить письмо? Введите 1 для отправки DHL, 2 - для отправки Pigeon");
        return scanner.nextInt();
    }

}
