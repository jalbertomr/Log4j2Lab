package com.bext;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ServiceATest {

    @DisplayName("Test MessageService.info()")
    //@Disabled("Disabled")
    //@ParameterizedTest(name = "Get con param")
    //@ValueSource(String = "valor2")
    @Test
    void info() {
        assertEquals("MessageSerivice.info Junit5", new ServiceA().info());
    }
}