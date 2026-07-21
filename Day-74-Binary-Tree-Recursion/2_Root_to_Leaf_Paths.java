/* Definition for Node
class Node
{
    int data;
    Node left;
    Node right;
    Node(int val)
    {
        this.data = val;
        left = null;
        right = null;
    }
}
*/

class Solution {
    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    
    public void findPaths(Node root, ArrayList<Integer> li){
        if(root == null){
            return;
        }
        li.add(root.data);
        if(root.left == null && root.right == null){
            ans.add(new ArrayList<>(li));
        }
        else{
            findPaths(root.left,li);
            findPaths(root.right,li);
        }
        li.remove(li.size() - 1);
    }
    
    public ArrayList<ArrayList<Integer>> paths(Node root) {
        // code here
        findPaths(root, new ArrayList<>());
        return ans;
    }
}
