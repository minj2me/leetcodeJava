public class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums==null || nums.length==0)
            return 0;
        int size = nums.length;
        int resultSize = valSize(nums,val);//comfrim the loop count
        for (int j=0;j<resultSize;j++) {
            int foundIndex = find(nums,val);
            if (foundIndex!=-1) {//found out val
                for (int i=foundIndex;i<size-1;i++) {
                    nums[i] = nums[i+1];
                }
                size--;
                System.out.print("size:"+size);
                System.out.print("\n");
            }
        }
        return size;
    }
    
    private int valSize (int[] nums, int val) {
        int resultSize=0;
        int size = nums.length;
        for (int i=0;i<size;i++) {
            if (nums[i]==val) {
                resultSize++;
            }
        }
        return resultSize;
    }
    
    private int find(int[] nums, int val) {
        int index=-1;
        int size = nums.length;
        for (int i=0;i<size;i++) {
            if (nums[i]==val) {
                index = i;
                System.out.print("index:"+index);
                System.out.print("\n");
                break;
            }
        }
        return index;
    }
}