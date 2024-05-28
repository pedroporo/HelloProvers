import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;
import org.junit.jupiter.api.*;
@DisplayName("Actividad del ciclo de la vida")
public class ProvaCicleVidaActivitats {

    @DisplayName("Test para compobar la funcion assertNotEquals")
    @Test
    void testAssertNotEquals(){
        /***
         * Lo que hace la funcion assertNotEquals es comprobar que dos valores/objetos no sean iguales
         */
        int resultadoEsperado=1;
        int valorMeter=32;
        assertNotEquals(resultadoEsperado,valorMeter);
    }
    @DisplayName("Test para compobar la funcion assertTrue")
    @Test
    void testAssertTrue(){
        /***
         * Lo que hace la funcion assertTrue es comprobar que una especificacion se cumpla o un booleano sea true
         */
        boolean comprobacion=false;
        assertTrue(comprobacion,"El requerimiento no se ha cumplido");
    }
    @DisplayName("Test para compobar la funcion assertFalse")
    @Test
    void testAssertFalse(){
        /***
         * Lo que hace la funcion assertFalse es comprobar que una especificacion se no cumpla o un booleano sea false
         */
        boolean comprobacion=true;
        assertFalse(comprobacion,"El requerimiento se ha cumplido cuando no deberia");
    }
    @DisplayName("Test para compobar la funcion assertNull")
    @Test
    void testAssertNull(){
        /***
         * Lo que hace la funcion assertNull es comprobar que un objeto recibido sea null
         */
        String comprobacion=null;
        assertNull(comprobacion,"El objeto recibido existe");
    }
    @DisplayName("Test para compobar la funcion assertNotNull")
    @Test
    void testAssertNotNull(){
        /***
         * Lo que hace la funcion assertNotNull es comprobar que un objeto recibido no sea null
         */
        String comprobacion=null;
        assertNotNull(comprobacion,"El objeto recibido no existe");
    }



    @DisplayName("Test para compobar la funcion assertSame")
    @Test
    void testAssertSame(){
        /***
         * Lo que hace la funcion assertSame es comprobar que dos objetos pasados sean del mismo tipo
         */
        int o1=0;
        String o2="Hola";
        assertSame(o1,o2,"Los objetos no son del mismo tipo");
    }
    @DisplayName("Test para compobar la funcion assertNotSame ")
    @Test
    void testAssertNotSame(){
        /***
         * Lo que hace la funcion assertNotSame es comprobar que dos objetos pasados NO sean del mismo tipo
         */
        int o1=0;
        String o2="Hola";
        assertNotSame(o1,o2,"Los objetos son del mismo tipo cuando no deberian de serlo");
    }
    @DisplayName("Test para compobar la funcion assumeFalse ")
    @Test
    void testAssumeFalse(){
        /***
         * Lo que hace la funcion assumeFalse lo que hace es assumer que recibira un booleano con valor false y si no es asi no pasa la prueba
         */
        int valor1=3;
        int valor2=3;
        boolean decision=true;
        if (valor1==valor2){
            decision=true;
        }else{
            decision=false;
        }
        String mensage=String.format("El valor %d debe ser diferente a %d",valor1,valor2);
       assumeFalse(decision,mensage);
    }
    @DisplayName("Test para compobar la funcion assumeTrue ")
    @Test
    void testAssumeTrue(){
        /***
         * Lo que hace la funcion assumeTrue lo que hace es assumer que recibira un booleano con valor true y si no es asi no pasa la prueba
         */
        int valor1=3;
        int valor2=3;
        boolean decision=true;
        if (valor1==valor2){
            decision=true;
        }else{
            decision=false;
        }
        String mensage=String.format("El valor %d debe ser igual a %d",valor1,valor2);
        assumeTrue(decision,mensage);
    }

}
