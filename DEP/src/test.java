import org.junit.Test;

import junit.framework.Assert;

import static org.junit.Assert.*;
public class test {
	@Test
	public void test() {
		double res = depcalc.calculate(10, 100, 12) ;
		if(res!=110)Assert.fail();	
	};
		
}

