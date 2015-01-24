package ca.ulaval.glo4002.lab2;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FileTest {

	@Test
    public void MaTestFile()
    {
       file file1 = new file(1, 2, 3);
       boolean isempty = file1.isempty();
       
       assertTrue(isempty);
    }
	
	@Test
	public void PeuAjouterElement()
    {
	
	
	
	
    }
}