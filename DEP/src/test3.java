import junit.framework.Assert;

import org.junit.Test;
import static org.junit.Assert.*;


public class test3 {
	@Test
	public void test3() {
		double res = depcalc.calculate(14, 5000000, 36) ;
		if(res!=7100000)Assert.fail();	
}}
	