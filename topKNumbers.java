/*Find the k most frequent elements in an array */
static int[] input={1,2,3,4,5,5,7,8,1,1,1,2,9,3,6,4,5,5,2,1,1};

public static Integer[] topKNumbers(int[] input, int k){
	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();

	for (int i=0;i<input.length;i++){
		int currentNum=0;
		if (!map.containsKey(input[i])){
			map.put(input[i], 1);
			currentNum = 1;
		}else{
			int updateNum = map.get(input[i])+1);
			map.put(input[i],updateNum);
			currentNum = updateNum;
		}

		if (minHeap.size()<k){
			minHeap.add(currentNum);
		}else if (currentNum > minHeap.peek()){
			minHeap.poll();
			minHeap.add(currentNum);
		}
	}

	int[] result = new int[minHeap.size()];
	int index=0;
	while(!minHeap.isEmpty()){
		result[index++] = minHeap.poll();
	}

	return result;
}

