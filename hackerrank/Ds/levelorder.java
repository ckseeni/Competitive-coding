 /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
    Queue<Node> q = new LinkedList<Node>();
   void LevelOrder(Node root)
    {
        q.add(root);
        while(!q.isEmpty()){
            Node curr = q.remove();
            System.out.print(curr.data+" ");
            if(curr.left!=null)
                q.add(curr.left);
            if(curr.right!=null)
                q.add(curr.right);
        }
    }

