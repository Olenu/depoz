import junit.framework.Assert;

import org.junit.Test;
import static org.junit.Assert.*;

public class test1 {
	@Test
	public void test1() {
		double res = depcalc.calculate(12, 100000, 12) ;
		if(res!=112000)Assert.fail();	
}}
	
	
	