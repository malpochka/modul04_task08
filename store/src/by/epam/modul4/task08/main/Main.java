package by.epam.modul4.task08.main;

import by.epam.modul4.task08.entity.*;
import by.epam.modul4.task08.logic.*;
import by.epam.modul4.task08.view.*;

import java.util.ArrayList;

/*Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
 * метод toString.Создать второй класс агрегирующий массив типа Customer, с подходящими конструктарами и методами.
 * Задать критерии выбора данных и вывести эти данные на консоль.
 * Класс Customer:id, фамилия,имя,отчество,адрес,номер кредитной карты,номер банковского счета.
 * Найти и вывести:
 * a)список покупателей в алфавитном порядке;
 * б)список покупателей, у которых номер кредитной карточки находится в заданном интервале.*/

public class Main {

	public static void main(String[] args) {

		BuyerList buyerList = new BuyerList();
		CustomerLogic logic = new CustomerLogic();
		CustomerView view = new CustomerView();

		buyerList.addCustomer(
				new Customer(156, "Ипалитов", "Максим", "Николаевич", "Гомель", 4800256425640001L, 12345678910111213L));
		buyerList.addCustomer(
				new Customer(157, "Астапова", "Ольга", "Николаевна", "Гомель", 4800256425640002L, 12345678910111214L));
		buyerList.addCustomer(
				new Customer(159, "Федорова", "Ирина", "Николаевна", "Минск", 4800256425640003L, 12345678910111215L));
		buyerList.addCustomer(
				new Customer(160, "Иванов", "Василий", "Иванович", "Минск", 4800256425640004L, 12345678910111216L));
		buyerList.addCustomer(
				new Customer(161, "Сидорова", "Алина", "Николаевна", "Брест", 4800256425640005L, 12345678910111217L));
		buyerList.addCustomer(
				new Customer(162, "Евсеев", "Николай", "Алексеевич", "Гродно", 4800256425640006L, 12345678910111218L));

		ArrayList<Customer> sorted;
		sorted = logic.sortByAlphabet(buyerList.getCustomers());
		view.print("Сортировка по алфавиту", sorted);

		System.out.println();

		sorted = logic.sortByNumber(buyerList.getCustomers());
		view.print("Cписок покупателей, у которых номер кредитной карточки находится в заданном интервале: ", sorted);
	}

}
