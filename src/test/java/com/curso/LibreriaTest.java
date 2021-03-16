package com.curso;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class LibreriaTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( 13 == Libreria.suma(3,5)  );
    }
   
       @Test
    public void resta5y6()
    {
        assertTrue( 10 == Libreria.resta(5,6)  );
    }
      @Test
     public void suma5y5();
    {
        assertTrue( 10 == Libreria.suma(5,5)  );
    }
}