//Given an integer array arr, count element x such that x + 1 is also in arr.

class Solution {
    public int countElements(int[] arr) {
     Set<Integer> lookup = new HashSet<>();
        for(Integer i: arr){
            lookup.add(i);
        }

        int count =0;

        for(Integer i:arr){
            if(lookup.contains(i+1)){
                count++;
            }
        }
        return count;
    }
}
