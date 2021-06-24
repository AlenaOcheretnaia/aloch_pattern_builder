public class Person {
    protected final String name;
    protected final String surname;
    private int age;
    private boolean knownAge;
    private String address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public boolean hasAge() {
        if (knownAge)
            return true;
        else
            return false;
    }

    public String getAddress() {
        return address;
    }

    public boolean hasAddress() {
        if ((this.address == null) || this.address.isEmpty())
            return false;
        else
            return true;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
        this.knownAge = true;
    }

    public void happyBirthday() {
        if (knownAge)
            this.setAge(this.getAge() + 1);
    }
//с уже заполненными фамилией (родительской), возрастом и текущим городом жительства (родительским)
    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(this.surname)
                .setAge(8)
                .setAddress(this.address);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Person: name=").append(this.name).append(" surname=").append(this.surname);
        if (hasAge()) builder.append(" age=").append(this.age);
        if (this.hasAddress())
            builder.append(" address=").append(this.address);
        return builder.toString();
    }


}