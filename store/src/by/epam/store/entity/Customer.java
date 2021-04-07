package by.epam.store.entity;

public class Customer {

	private int id;
	private String surname;
	private String name;
	private String patronymic;
	private String adress;
	private long numberOfCreditcart;
	private long account;

	public Customer(int id, String surname, String name, String patronymic, String adress, long numberOfCreditcart,
			long account) {
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.adress = adress;
		this.numberOfCreditcart = numberOfCreditcart;
		this.account = account;
	}

	public Customer() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public long getNumberOfCreditcart() {
		return numberOfCreditcart;
	}

	public void setNumberOfCreditcart(long numberOfCreditcart) {
		this.numberOfCreditcart = numberOfCreditcart;
	}

	public long getAccount() {
		return account;
	}

	public void setAccount(long account) {
		this.account = account;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (account ^ (account >>> 32));
		result = prime * result + ((adress == null) ? 0 : adress.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (int) (numberOfCreditcart ^ (numberOfCreditcart >>> 32));
		result = prime * result + ((patronymic == null) ? 0 : patronymic.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (account != other.account)
			return false;
		if (adress == null) {
			if (other.adress != null)
				return false;
		} else if (!adress.equals(other.adress))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numberOfCreditcart != other.numberOfCreditcart)
			return false;
		if (patronymic == null) {
			if (other.patronymic != null)
				return false;
		} else if (!patronymic.equals(other.patronymic))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Покупатель: id=" + id + ", " + surname + ", " + name + ", " + patronymic + ", " + adress
				+ ", номер кредитной карты=" + numberOfCreditcart + ", банковский счет=" + account;

	}

}