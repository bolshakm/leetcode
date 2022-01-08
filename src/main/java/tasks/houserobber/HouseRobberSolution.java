package tasks.houserobber;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class HouseRobberSolution {

	public static int getMaxSum(int[] arr) {
		if (arr == null || arr.length == 0) {
			return 0;
		}

		List<Integer> array = Arrays.stream(arr).boxed().collect(toList());
		Map<Integer, Integer> mapper = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			mapper.put(i, arr[i]);
		}

		Map<Integer, Integer> sortedMap = reversedSort(mapper);
		int tmpIndex = -1;

		List<Integer> indexesToSum = new ArrayList<>();
		Set<Integer> blockedIndexes = new HashSet<>();

		for (Map.Entry<Integer, Integer> item : sortedMap.entrySet()) {
			int index = item.getKey();
			if (tmpIndex == -1|| !blockedIndexes.contains(index)) {
				tmpIndex = index;
				indexesToSum.add(index);
				blockedIndexes.add(index + 1);
				blockedIndexes.add(index - 1);
			}
		}

		return indexesToSum.stream()
				.map(array::get)
				.reduce(Integer::sum)
				.orElse(0);
	}

	private static LinkedHashMap<Integer, Integer> reversedSort(Map<Integer, Integer> mapper) {
		return mapper.entrySet()
				.stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.collect(Collectors.toMap(
						Map.Entry::getKey,
						Map.Entry::getValue,
						(oldValue, newValue) -> oldValue, LinkedHashMap::new));
	}
}
