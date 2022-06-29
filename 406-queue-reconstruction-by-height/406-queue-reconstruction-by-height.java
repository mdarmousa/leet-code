class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a, b) -> {
            if(b[0] != a[0])
            	return b[0] - a[0];
            else
            	return a[1] - b[1];
        });
        
        List<int[]> ans = new ArrayList<>();
        for(int[] person : people) {
        	ans.add(person[1], person);
        }
        people = ans.toArray(people);
        return people;
    }
}