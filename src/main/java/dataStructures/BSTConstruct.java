package dataStructures;

public class BSTConstruct {

    static int preIndex = 0;
    static int[] preOrder = new int[]{1,2,4,5,3};
    static int[] inOrder = new int[]{4,2,5,1,3};

    public static void main(String[] args) {
        //from the given inorder and preorder traversal, form BST
        //(a) Inorder (Left, Root, Right) : 4 2 5 1 3 
        //(b) Preorder (Root, Left, Right) : 1 2 4 5 3 
        //             1
        //           /   \
        //         2      3
        //        /  \
        //      4     5

        int rootInt = preOrder[preIndex++];
        Node<Integer> root = new Node<>(1);
        System.out.println("adding root ="+root.object);
        constructBST(root,getLeftArray(inOrder,root.object),getRightArray(inOrder,root.object));
        
        int count = getCount(root);

        System.out.println(count);
        
    }

    private static int getCount(Node<Integer> root) {
        if(root==null || root.object==null){
            return 0;
        }else {
            return getCount(root.left) + getCount(root.right) +1;
        }
    }


    private static void constructBST(Node<Integer> root, int[] leftArr, int[] rightArr) {

        if(leftArr!=null){
            Object l = getRoot(leftArr,preIndex++);
            if(l!=null) {
                Node<Integer> leftRoot = new Node<>((Integer)l);
                System.out.println("adding left =" + leftRoot.object);
                root.left = leftRoot;
                constructBST(leftRoot, getLeftArray(leftArr, leftRoot.object), getRightArray(rightArr, leftRoot.object));
            }
        }
        if(rightArr!=null){
            Object r = getRoot(rightArr,preIndex++);
            if(r!=null) {
                Node<Integer> rightRoot = new Node<>((Integer)r);
                System.out.println("adding right =" + rightRoot.object);
                root.right = rightRoot;
                constructBST(rightRoot, getLeftArray(leftArr, rightRoot.object), getRightArray(rightArr, rightRoot.object));
            }
        }
    }

    private static Object getRoot(int[] leftArr, int i) {
        for (int k=0;k<leftArr.length;k++){
            if(leftArr[k]==inOrder[i])
                return leftArr[k];
        }
        return null;
    }

    private static int[] getRightArray(int[] inOrder, Integer root) {
        if(inOrder.length==1)
            return inOrder;
        int rootIndx = getRootIndex(inOrder,root);
        if(rootIndx ==-1)
            return null;
        int[] rightArr = new int[inOrder.length-rootIndx-1];
        System.arraycopy(inOrder,rootIndx+1,rightArr,0,inOrder.length-rootIndx-1);
        return rightArr;
    }

    private static int[] getLeftArray(int[] inOrder, Integer root) {
        if(inOrder.length==1)
            return inOrder;
        int rootIndx = getRootIndex(inOrder,root);
        if(rootIndx ==-1)
            return null;
        int[] leftArr = new int[rootIndx];
        System.arraycopy(inOrder,0,leftArr,0,rootIndx);
        return leftArr;
    }

    private static int getRootIndex(int[] inOrder, int root) {
        for(int i = 0; i<inOrder.length; i++) {
            if (root == inOrder[i]) {
                return i;
            }
        }
        return -1;
    }


}
class Node <T>{
    T object;
    Node left;
    Node right;
    Node(T obj){
        this.object = obj;
        this.left = null;
        this.right = null;
    }
}
