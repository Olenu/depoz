
	import junit.framework.Assert;

	import org.junit.Test;
	import static org.junit.Assert.*;


public class test2 {
		@Test
		public void test2() {
			double res = depcalc.calculate(10, 120000, 16) ;
			if(res!=136000)Assert.fail();	
	}}
		
		

