package com.roger;
 
import org.junit.Before;
import org.junit.Test;
 
import static org.junit.Assert.assertEquals;
 
public class MessageServiceTest {
 
    private MessageService messageService;
 
    @Before
    public void setUp() {
        messageService = new MessageService();
    }
 
    @Test
    public void getMessage_ShouldReturnMessage() {
        assertEquals("abc",messageService.getMessage());
    }
}
