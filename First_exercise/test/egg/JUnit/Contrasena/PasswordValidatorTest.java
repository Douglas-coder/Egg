package egg.JUnit.Contrasena;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    PasswordServices ps;
    PasswordValidator pv;

    @BeforeEach
    void setUp() {
        ps = new PasswordServices();
        pv = new PasswordValidator();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void validarExsitePassword(){
        assertNotNull(new PasswordValidator().getPassword());
    }
    @Test
    public void validarSeguridadPassword(){
        assertEquals(11,pv.getLongitud(),"El passwor debe contener minimo 11 caracteres");

    }
}