public class Customer {

	private String _id;
    private String _firstname;
    private String _lastname;
    private String _telephone;
    private String _street1;
    private String _street2;
    private String _city;
    private String _state;
    private String _zipcode;
    private String _country;
    private String _mail;

    public Customer(String id, String firstname, String lastname) {
        _id = id;
        _firstname = firstname;
        _lastname = lastname;
    }

	public Customer(String id, String firstname, String lastname, String tel, String street1, String street2, String city, String state, String zipcode, String country, String mail) {
        _id = id;
        _firstname = firstname;
        _lastname = lastname;
        _telephone = tel;
        _street1 = street1 ;
        _street2 = street2 ;
        _city = city ;
        _state = state ;
        _zipcode = zipcode ;
        _country = country ;
        _mail = mail ;
    }
    

	public String getId() {
		return this._id;
	}

	public String getFirstname() {
		return this._firstname;
	}

	public String getLastname() {
		return this._lastname;
	}

	public String getTelephone() {
		return this._telephone;
	}

	public String getStreet1() {
		return this._street1;
    }
    
    public String getStreet2() {
		return this._street2;
	}

	public String getCity() {
		return this._city;
	}

	public String getCountry() {
		return this._country;
	}

	public String getState() {
		return this._state;
	}

	public String getZipcode() {
		return this._zipcode;
	}

	public String getMail() {
		return this._mail;
	}

	public void setFirstname(String firstname) {
        _firstname = firstname;
	}

	public void setLastname(String lastname) {
        _lastname = lastname;
	}

	public void setTelephone(String tel) {
        _telephone = tel;
	}

	public void setStreet1(String street1) {
        _street1 = street1;
    }
    
	public void setStreet2(String street2) {
        _street2 = street2;
	}

	public void setCity(String city) {
        _city = city;
	}

	public void setCountry(String country) {
        _country = country;
	}

	public void setState(String state) {
        _state = state;

	}

	public void setZipcode(String zipcode) {
        _zipcode = zipcode;
	}

	public void setMail(String mail) {
        _mail = mail;
	}

	public boolean checkId(String id) {
		return this._id == id;
	}

	public boolean checkData() {
		if((this._id == null || this._id.length() == 0)) {
			return false;
		}
		if((this._firstname == null || this._firstname.length() == 0)) {
			return false;
		}
		if((this._lastname == null || this._lastname.length() == 0)) {
			return false;
		}
		return true;
	}

	public String getCheckDataError() {
		if((this._id == null || this._id.length() == 0)) {
			return "Invalid id";
		}
		if((this._firstname == null || this._firstname.length() == 0)) {
			return "Invalid first name";
		}
		if((this._lastname == null || this._lastname.length() == 0)) {
			return "Invalid last name";
		}
		return null;
	}

	public boolean checkMail() {
		int minLength = 7;
		int maxLength = 30;
		if((this._mail == null || this._mail.length() == 0)) {
			return false;
		}
		if(this._mail.length() < minLength) {
			return false;
		}
		if(this._mail.length() > maxLength) {
			return false;
		}
		if(!this._mail.contains("@")) {
			return false;
		}
		return true;
	}

	public static Customer find(String string) {
		return null;
	}

	public static boolean remove(String sid) {
		return false;
	}

	public static boolean insert(Customer customer) {
		return false;
	}
}