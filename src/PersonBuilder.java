public class PersonBuilder {
    private String name;
    private String surname;
    private Integer age;
    private String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        Person person = new Person(name, surname);
        person.setAge(age);
        person.setAddress(address);
        if ((this.name == null) || (this.name.isEmpty()))
            throw new NullPointerException("Can't build Person without name");
        if ((this.surname == null) || (this.surname.isEmpty()))
            throw new NullPointerException("Can't build Person without surname");
        if ((age < 0) || (age > 130) && (age != null))
            throw new IllegalArgumentException("Age is not valid");
        return person;
    }
    
}