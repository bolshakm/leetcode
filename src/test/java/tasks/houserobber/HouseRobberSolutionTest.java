package tasks.houserobber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HouseRobberSolutionTest {

	@Test
	void getMaxSumVar1() {
		int[] arr = {17, 15, 6, 7, 2, 4, 5, 8, 20, 22, 20, 10};

		Assertions.assertEquals(80, HouseRobberSolution.getMaxSum(arr));
	}

	@Test
	void getMaxSumVar2() {
		int[] arr = {2, 1, 1, 2};

		Assertions.assertEquals(4, HouseRobberSolution.getMaxSum(arr));
	}

	@Test
	void getMaxSumVar3() {
		int[] arr = {1, 2, 3, 4, 5, 6};

		Assertions.assertEquals(12, HouseRobberSolution.getMaxSum(arr));
	}

	@Test
	void getMaxSumVar4() {
		int[] arr = {11, 12, 5, 4, 4};

		Assertions.assertEquals(20, HouseRobberSolution.getMaxSum(arr));
	}

	@Test
	void getMaxSumVar5() {
		int[] arr = {1, 1, 1, 1, 1};

		Assertions.assertEquals(3, HouseRobberSolution.getMaxSum(arr));
	}

	@Test
	void getMaxSumVar6() {
		int[] arr = {1, 1, 1, 1, 1, 1};

		Assertions.assertEquals(3, HouseRobberSolution.getMaxSum(arr));
	}

	@Test
	void shouldReturnZeroWhenArrIsNull() {
		int[] arr = null;

		Assertions.assertEquals(0, HouseRobberSolution.getMaxSum(arr));
	}

	@Test
	void shouldReturnZeroWhenArrIsEmpty() {
		int[] arr = {};

		Assertions.assertEquals(0, HouseRobberSolution.getMaxSum(arr));
	}
}
