import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class HabitacionTest {

    Habitacion h;

    public HabitacionTest(){

    }

    @BeforeAll
    public static void setUpClass(){

    }

    @AfterAll
    static void tearDownClass(){

    }

    @BeforeEach
    void setUp() {
        h = new Habitacion();
    }

    @AfterEach
    void tearDown() {
        h = null;
    }


    @Test
    void hacerReserva() {
        Cliente c = new Cliente("Juan",19,"22.764.583-8",3,84758,"4:30","93893843");
        h.hacerReserva(c);
        assertEquals("22.764.583-8",c.getRut());

    }
}