public class PersonBuilder implements IPersonBuilder {
    private String name;
    private String surname;
    private int age;
    private boolean knownAge;
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
        if ((age > 0) && (age < 130)) {
            this.age = age;
            knownAge = true;
        }
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
        if ((age < 0) || (age > 130))
            throw new IllegalArgumentException("Age is not valid");
        if (person.name == null)
            throw new NullPointerException("Can't build Person without name");
        if (person.surname == null)
            throw new NullPointerException("Can't build Person without surname");
        if (person.name.isEmpty())
            throw new IllegalStateException("Can't build Person without name");
        if (person.surname.isEmpty())
            throw new IllegalStateException("Can't build Person without surname");


        return person;
    }


}