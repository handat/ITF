package test_maven;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;


public class GsonTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
	@Test
	public void test() {
//		fail("Not yet implemented");
		DataPatternList dpl = TestDataCreator.createData();
		DataPattern dp = dpl.getDataPattern("004");
	
		System.out.println(dp.toString());
		System.out.println(dpl.getDataPatternString("004"));
	}
	
	@Ignore
	@Test
	public void readJsonTest(){
		
		
	}

}
