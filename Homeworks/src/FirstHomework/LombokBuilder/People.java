package FirstHomework.LombokBuilder;

// FOR THIS PART OF THE TASK USE THIS VIDEO TO HELP ME: https://www.youtube.com/watch?v=xy6FUwftz1Q

public class People{
    private final int age;
    private final String name;
    private final String lastName;
    public final String GREET = "hello";

    public People(PeopleBuilder builder) {
        this.age = builder.age;
        this.name = builder.name;
        this.lastName = builder.lastName;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String greet(){
        return GREET + " my name is " + name;
    }

    public static class PeopleBuilder {
        private int age;
        private String name;
        private String lastName;

        public PeopleBuilder setAge(int age){
            this.age = age;
            return this;
        }

        public PeopleBuilder setName(String name){
            this.name = name;
            return this;
        }

        public PeopleBuilder setLastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public People getPeople(){
            return new People(this);
        }

    }
}
