class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet <Integer> set = new HashSet <Integer>();

        for(int num : nums){
            set.add(num);
        }

        List<Integer> ret = new ArrayList<>();

        for(int i = 1; i <= nums.length;i++){
            if(!set.contains(i)){
                ret.add(i);
            }
        }
        return ret;
    }
}
