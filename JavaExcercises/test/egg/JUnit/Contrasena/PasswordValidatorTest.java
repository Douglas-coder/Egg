package egg.JUnit.Contrasena;

import JUnit.Contrasena.PasswordServices;
import JUnit.Contrasena.PasswordValidator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    Scanner sc = new Scanner(System.in);
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
    public void validarPasswordCorrecto(){
        assertTrue(ps.comprobarContrasenia(),"Se espera que retorne un password correcto");
    }

    @Test
    public void validarSeguridadPassword(){
        assertTrue(ps.comprobarLongitud(),"El passwor debe contener minimo 11 caracteres");
        //assertEquals(11,pv.getLongitud(),"El passwor debe contener minimo 11 caracteres");
        assertTrue(ps.comprobarMayus(), "Se espera que contenga por lo menos una mayuscula");
        assertTrue(ps.comprobarNum(), "Se espera que contenga por lo menos un numero");
        assertTrue(ps.comprobarCaracterEspecial(), "Se espera que contenga por lo menos un caracter especial");
    }

}