package com.platzi.javatests.payments;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilTest {
    @Test
    public void string_cualquiera_no_Es_vacio(){
        assertFalse(StringUtil.isEmpty(""));
    }
    @Test
    public void string_cualquiera_Es_vacio(){
        assertTrue(StringUtil.isEmpty(""));
    }
    @Test
    public void string_null_is_empty(){
        assertTrue(StringUtil.isEmpty(null));
    }
    @Test
    public void stringcon_espacion_is_empy(){
        assertTrue(StringUtil.isEmpty("    "));
    }



}