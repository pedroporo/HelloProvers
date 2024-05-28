import org.junit.jupiter.api.*;

//import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

@DisplayName("Pruevas del ciclo de la vida en JUnit5")
public class ProvaCicleVida {
    public ProvaCicleVida(){
        System.out.println("--- Constructor ---");
    }
    @BeforeAll
    static void setup(){
        System.out.println("@BeforeAll => setup(): Se ejecuta ANTES de las pruevas");
    }
    @AfterAll
    static void tear(){
        System.out.println("@AfterAll => tear(): Se ejecuta DESPUES de las pruevas");
    }
    @BeforeEach
    void setupThis(){
        System.out.println("@BeforeEach => setupThis(): Se ejecuta ANTES de CADA prueva");
    }
    @AfterEach
    void tearThis(){
        System.out.println("@AfterEach => tearThis(): Se ejecuta DESPUES de CADA prueva");
    }
    @DisplayName("Primer Test")
    @RepeatedTest(3)
    void testOne(){

        boolean isServerUp=Math.random()>=0.5;
        assumeTrue(isServerUp,"Ingorando test, servidor apagado!!!");


        //fail("Ha fallado");
        int resultadoEsperado=3;
        assertEquals(resultadoEsperado,1+2);
        System.out.println("=== TEST ONE EJECUTADO ===");
    }

    //@Disabled
    @DisplayName("Segon Test")
    @RepeatedTest(value = 2, name = "--> {currentRepetition}/{totalRepetitions}")
    void testTwo(){
        System.out.println("=== TEST TWO EJECUTADO ===");
        int resultadoEsperado=3;
        assertEquals(resultadoEsperado,1+2);
    }
}
