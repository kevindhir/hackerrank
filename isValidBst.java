/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
*/
    boolean checkBST(Node root) {
        if(root == null){
            return false;
        } else {
            boolean recurseLeft = checkBSTRecurse(root.left, Integer.MIN_VALUE, root.data);
            boolean recurseRight = checkBSTRecurse(root.right, root.data, Integer.MAX_VALUE);
            return recurseLeft && recurseRight;
        }
    }

    boolean checkBSTRecurse(Node root, int lo, int hi){
        if(root == null){
            return true;
        }
        if(root.data <= lo || root.data >= hi){
            return false;
        }
        boolean recurseLeft = checkBSTRecurse(root.left, lo, root.data);
        boolean recurseRight = checkBSTRecurse(root.right, root.data, hi);
        return recurseLeft && recurseRight;
    }
