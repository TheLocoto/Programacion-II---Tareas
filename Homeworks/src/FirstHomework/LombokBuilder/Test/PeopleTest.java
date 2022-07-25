package FirstHomework.LombokBuilder.Test;

import FirstHomework.LombokBuilder.People;
import org.junit.Assert;
import org.junit.Test;

public class PeopleTest {

    @Test
    public void peopleSettersAndGettersTest(){

        People people = new People.PeopleBuilder().setAge(10).setName("Diego").setLastName("Figueroa").getPeople();

        Assert.assertEquals("Diego",people.getName());
        Assert.assertEquals("Figueroa",people.getLastName());
        Assert.assertEquals(10,people.getAge());
    }
}
