/*  
   class Node
      public  int frequency; // the frequency of this tree
       public  char data;
       public  Node left, right;
    
*/ 

void decode(String S ,Node root)
    {
     int i=0;
     Node curr=root;
    while(i<S.length()){
         while(curr.left!=null||curr.right!=null){
             if(S.charAt(i)=='0')
                 curr=curr.left;
             else
                 curr=curr.right;
             i++;
         }
         System.out.print(curr.data);
        curr=root;
    }
    }
