import static org.junit.jupiter.api.Assertions.*;

class GenericSafeArrayTest {
    GenericSafeArray<String> gs;
    GenericSafeArray<Person> personArray;


    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        gs = new GenericSafeArray<String>();
        personArray = new GenericSafeArray<Person>();
    }

    @org.junit.jupiter.api.Test
    void add() {
        gs.add("Hello");
        gs.add("World");
        assertEquals(gs.size(),2);
        assertTrue(gs.contains("Hello"));
        assertTrue(gs.contains("World"));

        Person p = new Person("Jane Smith", 33);
        personArray.add(p);
        assertEquals(personArray.size(),1);
        assertTrue(personArray.contains(p));

    }

    @org.junit.jupiter.api.Test
    void set() {
        gs.add("Hello");
        gs.add("World");
        gs.set(1, "Everyone");
        assertTrue(gs.contains("Everyone"));

    }

    @org.junit.jupiter.api.Test
    void get() {

        Person p1 = new Person("Jane Smith", 33);
        Person p2 = new Person("Luke Skywalker", 24);
        personArray.add(p1);
        personArray.add(p2);
        Person p3 = personArray.get(0);
        assertEquals(personArray.get(1), p2);

    }

    @org.junit.jupiter.api.Test
    void contains() {
        Person p1 = new Person("Jane Smith", 33);
        Person p2 = new Person("Luke Skywalker", 24);
        personArray.add(p1);
        personArray.add(p2);
        assertTrue(personArray.contains(p1));
        assertTrue(personArray.contains(p2));

    }

    @org.junit.jupiter.api.Test
    void indexOf() {
        gs.add("Hello");
        gs.add("World");
        assertEquals(gs.indexOf("World"),1);
        assertEquals(gs.indexOf("Hello"),0);


    }

    @org.junit.jupiter.api.Test
    void remove() {
        gs.add("Hello");
        gs.add("World");
        gs.remove(0);
        assertFalse(gs.contains("Hello"));
        assertEquals(gs.size(), 1);

    }

    @org.junit.jupiter.api.Test
    void size() {
        gs.add("Hello");
        gs.add("World");

        assertEquals(gs.size(), 2);


    }
}