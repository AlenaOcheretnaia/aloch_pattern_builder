public class Person {
    private final String name;
    private final String surname;
    private Integer age;
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
        if (age != null) return true;
        else return false;
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

    public void setAge(Integer age) {
        this.age = age;
    }

    public void happyBirthday() {
        if (hasAge())
            this.setAge(this.getAge() + 1);
        else
            System.out.println("Возраст неизветен");
    }

    //с уже заполненными фамилией, текущим городом жительства (родительскими)
    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(this.surname)
                .setAddress(this.address);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Person: name=").append(this.name).append(" surname=").append(this.surname)
                .append(" age=").append(this.age).append(" address=").append(this.address);
        return builder.toString();
    }

}