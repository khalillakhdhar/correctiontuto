
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import junit.framework.Assert;


public class DateVerif {
	private Date date;
	@Before
	public void init() {
	date = new Date();
	}

	@Rule
	public ExpectedException exception = ExpectedException.none();
	@Test
	public void testCasAutoIncrement() {
		
		
Assert.assertEquals(true, date.valideday(4,12,2014));	}
}
