/*
Given a collection of numbers, return all possible permutations.

For example,
[1,2,3] have the following permutations:
[1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], and [3,2,1].
*/
public List<List<Integer>> permute(int[] nums) {
       
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> path = new ArrayList<Integer>();
        boolean[] visited = new boolean[nums.length];
        /*for (int i=0;i<nums.length;i++){
            visited[i]=false;
        }*/
         if (nums==null || nums.length==0) return res;
        Arrays.sort(nums);
        helper(nums, path, res, visited);
        return res;
        
    }
    
    private void helper(int[] nums, List<Integer> path, List<List<Integer>> res, boolean[] visited){
        
        if (path.size()==nums.length){
            res.add(new ArrayList<Integer>(path));
            return;
        }
        for (int i=0;i<nums.length;i++){
            if (!visited[i]){
                path.add(nums[i]);
                visited[i]=true;
                helper(nums, path, res,visited);
                path.remove(path.size()-1);
                visited[i]=false;
            }
        }
    }