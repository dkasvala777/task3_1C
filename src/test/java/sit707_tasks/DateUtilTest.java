package sit707_tasks;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author Ahsan Habib
 */
public class DateUtilTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "s223676061";
		Assert.assertNotNull("Student ID is ", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Dhruv";
		Assert.assertNotNull("Student name is ", studentName);
	}

	@Test
	public void testMaxJanuary31ShouldIncrementToFebruary1() {
		// January max boundary area: max+1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldIncrementToFebruary1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(1, date.getDay());
	}
	
	@Test
	public void testMaxJanuary31ShouldDecrementToJanuary30() {
		// January max boundary area: max-1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldDecrementToJanuary30 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(1, date.getMonth());
	}
	
	@Test
	public void testNominalJanuary() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_31, 1, 2024);
        System.out.println("testJanuaryNominal > " + date);
        date.increment();
        System.out.println(date);
	}
	
	/*
	 * Complete below test cases.
	 */
	
	@Test
	public void testMinJanuary1ShouldIncrementToJanuary2() {
		// Code here
	}
	
	@Test
	public void testMinJanuary1ShouldDecrementToDecember31() {
		// Code here
	}
	 // Day Equivalence Classes
    @Test
    public void testMinimumDay() {
        DateUtil date = new DateUtil(1, 1, 2024);
        Assert.assertEquals(1, date.getDay());
    }

    @Test
    public void testMaximumDay() {
        DateUtil date = new DateUtil(31, 1, 2024);
        Assert.assertEquals(31, date.getDay());
    }

    @Test
    public void testNormalDay() {
        DateUtil date = new DateUtil(15, 1, 2024);
        Assert.assertEquals(15, date.getDay());
    }

    // Month Equivalence Classes
    @Test
    public void testMinimumMonth() {
        DateUtil date = new DateUtil(1, 1, 2024);
        Assert.assertEquals(1, date.getMonth());
    }

    @Test
    public void testMaximumMonth() {
        DateUtil date = new DateUtil(1, 12, 2024);
        Assert.assertEquals(12, date.getMonth());
    }

    @Test
    public void testNormalMonth() {
        DateUtil date = new DateUtil(1, 6, 2024);
        Assert.assertEquals(6, date.getMonth());
    }

    // Year Equivalence Classes
    @Test
    public void testMinimumYear() {
        DateUtil date = new DateUtil(1, 1, 1700);
        Assert.assertEquals(1700, date.getYear());
    }

    @Test
    public void testMaximumYear() {
        DateUtil date = new DateUtil(1, 1, 2024);
        Assert.assertEquals(2024, date.getYear());
    }

    @Test
    public void testNormalYear() {
        DateUtil date = new DateUtil(1, 1, 2023);
        Assert.assertEquals(2023, date.getYear());
    }
}
