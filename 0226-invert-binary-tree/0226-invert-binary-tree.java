
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null)
            return null;

Queue<TreeNode> queue= new LinkedList<>();

queue.add(root);

while(!queue.isEmpty()){

TreeNode node=queue.poll();


//swap the nodes

TreeNode temp=node.left;
node.left=node.right;
node.right=temp;


if(node.left!=null) queue.add(node.left);

if(node.right!=null) queue.add(node.right);


}
return root;




    }
}