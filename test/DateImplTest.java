/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Calendar;
import java.util.GregorianCalendar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * 
 */
public class DateImplTest {
    
    public DateImplTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getYear method, of class DateImpl.
     */
    @Test
    public void testGetYear() {
        System.out.println("getYear");
        DateImpl instance = new DateImpl();
        int expResult = 2016;
        int result = instance.getYear();
        assertEquals(expResult, result);  
    }

    /**
     * Test of setYear method, of class DateImpl.
     */
    @Test
    public void testSetYear() {
        System.out.println("setYear");
        int year = 2000;
        DateImpl instance = new DateImpl();        
        boolean expResult = true;
        boolean result = instance.setYear(year);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getMonth method, of class DateImpl.
     */
    @Test
    public void testGetMonth() {
        System.out.println("getMonth");
        DateImpl instance = new DateImpl();
        int expResult = 8;
        int result = instance.getMonth();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMonth method, of class DateImpl.
     */
    @Test
    public void testSetMonth() {
        System.out.println("setMonth");
        int month = 1;
        DateImpl instance = new DateImpl();
        boolean expResult = false;
        instance.setDayOfMonth(30);
        instance.setMonth(9);
        //checking february 30
        boolean result = instance.setMonth(month);
        assertEquals(expResult, result);
        instance.setYear(2016);
        instance.setDayOfMonth(29);
        result = instance.setMonth(month);
        assertEquals(true, result);
    }

    /**
     * Test of getDayOfMonth method, of class DateImpl.
     */
    @Test
    public void testGetDayOfMonth() {
        System.out.println("getDayOfMonth");
        DateImpl instance = new DateImpl();
        int expResult = (new  GregorianCalendar()).get(Calendar.DAY_OF_MONTH);
        int result = instance.getDayOfMonth();
        assertEquals(expResult, result);        
        
    }

    /**
     * Test of setDayOfMonth method, of class DateImpl.
     */
    @Test
    public void testSetDayOfMonth() {
        System.out.println("setDayOfMonth");
        
        int date = 0;
        DateImpl instance = new DateImpl();

        boolean expResult = false;
        int month=2;
        boolean result = instance.setDayOfMonth(32);
        assertEquals(expResult, result);
        instance.setMonth(9);                
        result = instance.setDayOfMonth(32);
        assertEquals(expResult, result);
        
        instance.setYear(2016);        
        instance.setMonth(1);
        result = instance.setDayOfMonth(29);;
        assertEquals(true, result);
        instance.setDayOfMonth(21);
        instance.setYear(2015);        
        instance.setMonth(1);
        result = instance.setDayOfMonth(29);
        assertEquals(false, result);
        
    }

    /**
     * Test of getHours method, of class DateImpl.
     */
    @Test
    public void testGetHours() {
        System.out.println("getHours");
        DateImpl instance = new DateImpl();
        int expResult = (new  GregorianCalendar()).get(Calendar.HOUR_OF_DAY);
        int result = instance.getHours();
        assertEquals(expResult, result);        
    }

    /**
     * Test of setHours method, of class DateImpl.
     */
    @Test
    public void testSetHours() {
        System.out.println("setHours");
        int hours = 0;
        int minutes = 0;
        DateImpl instance = new DateImpl();
        boolean expResult = true;
        for(int i=0;i<24;i++)
        {
            boolean result =instance.setHours(i);            
            assertEquals(expResult, result);            
        }
        expResult = false;
        for(int i=-100;i<1000;i++)
        {
            if(i<0||i>23)
            {                
                boolean result =instance.setHours(i);            
                assertEquals(expResult, result);            
            }
        }
    }

    /**
     * Test of getMinutes method, of class DateImpl.
     */
    @Test
    public void testGetMinutes() {
        System.out.println("getMinutes");
        DateImpl instance = new DateImpl();
        int expResult = 59;
        for(int i=0;i<60;i++)
        {
            instance.setMinutes(i);
            expResult =i;
            int result = instance.getMinutes();
            assertEquals(expResult, result);            
        }       
    }

    /**
     * Test of setMinutes method, of class DateImpl.
     */
    @Test
    public void testSetMinutes() {
        System.out.println("setMinutes");
        int minutes = 0;
        DateImpl instance = new DateImpl();
        boolean expResult = true;
        for(int i=0;i<60;i++)
        {
            boolean result =instance.setMinutes(i);            
            assertEquals(expResult, result);            
        }
        expResult = false;
        for(int i=-100;i<1000;i++)
        {
            if(i<0||i>59)
            {                
                boolean result =instance.setMinutes(i);            
                assertEquals(expResult, result);            
            }
        }

    }

    /**
     * Test of getSeconds method, of class DateImpl.
     */
    @Test
    public void testGetSeconds() {
        System.out.println("getSeconds");
        DateImpl instance = new DateImpl();
        int expResult = 59;
        for(int i=0;i<60;i++)
        {
            instance.setSeconds(i);
            expResult =i;
            int result = instance.getSeconds();
            assertEquals(expResult, result);            
        }
        // check errors
    }

    /**
     * Test of setSeconds method, of class DateImpl.
     */
    @Test
    public void testSetSeconds() {
        System.out.println("setSeconds");
        int seconds = 0;
        DateImpl instance = new DateImpl();
        boolean expResult = true;
        for(int i=0;i<60;i++)
        {
            boolean result =instance.setSeconds(i);            
            assertEquals(expResult, result);            
        }
        expResult = false;
        for(int i=-100;i<1000;i++)
        {
            if(i<0||i>59)
            {                
                boolean result =instance.setSeconds(i);            
                assertEquals(expResult, result);            
            }
        }

    }

    /**
     * Test of isLeapYear method, of class DateImpl.
     */
    @Test
    public void testIsLeapYear() {
        System.out.println("isLeapYear");
        DateImpl instance = new DateImpl();
        boolean expResult = true;
        boolean result = instance.isLeapYear();
        assertEquals(expResult, result);
        instance.setYear(2015);
        result = instance.isLeapYear();        
        assertEquals(false, result);
        

    }
    
}
