import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    Cliente c1;
    Cliente c2;

    public ClienteTest(){

    }

    @BeforeAll
    public static void setUpClass(){

    }

    @AfterAll
    static void tearDownClass(){

    }

    @BeforeEach
    void setUp() {
        c1 = new Cliente("Juan",19,"22.138.182-7",3,84758,"4:30","93893843");
        c2 = new Cliente("Pedro",19,"23.438.182-7",2,94562,"7:30","91367314");
    }

    @AfterEach
    void tearDown() {
        c1 = null;
        c2 = null;
    }

    @Test
    void getNumeroReserva() {
        assertEquals(84758,c1.getNumeroReserva());
        assertEquals(94562,c2.getNumeroReserva());
        assertNotEquals(646742,c1.getNumeroReserva());
        assertNotEquals(678357,c2.getNumeroReserva());
    }
}