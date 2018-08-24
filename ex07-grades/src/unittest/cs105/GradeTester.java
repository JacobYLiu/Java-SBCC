package unittest.cs105;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.sbcc.cs105.Grade;

public class GradeTester {
	private static final int maximumScore = 8;
	private static final int maximumAssignmentScore = 12;
	private static int totalScore;

	@BeforeClass
	public static void beforeTesting() {
		totalScore = 0;
	}

	@AfterClass
	public static void afterTesting() {
		System.out.printf("Your program's functionality scores %d out of %d.\n\n", totalScore, maximumScore);

		int difference = maximumAssignmentScore - maximumScore;
		String correctedPoint = (difference == 1) ? "point" : "points";

		System.out.printf("The assignment is worth a total of %d where the remainder of %d %s\n",
				maximumAssignmentScore, difference, correctedPoint);
		System.out.println("comes from grading related to documentation, algorithms, and other");
		System.out.println("criteria.");
	}

	@Test
	public void checkAMinus() throws Exception {
		assertEquals(3.7f, Grade.computeGradePoint("A-"), 0.01);

		totalScore += 1;
	}

	@Test
	public void checkB() throws Exception {
		assertEquals(3.0f, Grade.computeGradePoint("B"), 0.01);

		totalScore += 1;
	}
	
	@Test
	public void checkF() throws Exception {
		assertEquals(0.0f, Grade.computeGradePoint("F"), 0.01);

		totalScore += 2;
	}

	@Test
	public void checkAPlus() throws Exception {
		assertEquals(4.0f, Grade.computeGradePoint("A+"), 0.01);

		totalScore += 2;
	}

	@Test
	public void checkA() throws Exception {
		assertEquals(4.0f, Grade.computeGradePoint("A"), 0.01);

		totalScore += 2;
	}
}
