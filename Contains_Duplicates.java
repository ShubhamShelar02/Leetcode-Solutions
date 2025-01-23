class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> n = new HashSet<>();
        for(int a : nums){
            if(!n.add(a)){
                return true;
            }
        }
        return false;
    }
}
