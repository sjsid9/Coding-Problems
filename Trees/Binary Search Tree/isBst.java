boolean checkBST(Node root) {
        BSTPair bst = isBST(root);
        return bst.isBST;
    }

    public class BSTPair{
        boolean isBST=true;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
    }

    BSTPair isBST(Node node){
        
        if(node==null){
            BSTPair bp = new BSTPair();
            return bp;
        }
        
        BSTPair ls = isBST(node.left);
        BSTPair rs = isBST(node.right);
        
        BSTPair mr = new BSTPair();
        mr.max = Math.max(node.data,Math.max(ls.max,rs.max));
        mr.min = Math.min(node.data,Math.min(ls.min,rs.min));
        
        if(ls.isBST && rs.isBST && node.data>ls.max && node.data < rs.min){
            mr.isBST = true;
        }else{
            mr.isBST=false;
        }
        
        return mr;
        
    }

