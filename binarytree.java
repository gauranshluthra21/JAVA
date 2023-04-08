import java.util.*;

public class binarytree {
    static class node{
        int data;
        node left;
        node right;

        node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }

    }
    static class binary{
static int idx=-1;
        public static node buildtree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            node newnode=new node(nodes[idx]);
            newnode.left=buildtree(nodes);
            newnode.right=buildtree(nodes);

            return newnode;

        }
    }

    public static void preorder(node root){
        if(root ==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void postorder(node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }


    public static void levelorder(node root){
        Queue<node> q=new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            node curr=q.remove();
            if(curr==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }

            }else{
    System.out.print(curr.data);
    if(curr.left!=null){
        q.add(curr.left);
    }
    if(curr.right!=null){
        q.add(curr.right);
    }
}
        }
    }

    public static int count(node root){
        if(root==null){
            return 0;
        }
        int left=count(root.left);
        int right=count(root.right);
        return left+right+1;
    }

    public static int sum(node root){
        // int suml=0;
        // int sumr=0;
        if(root==null){
            return 0;
        }
        int suml=sum(root.left);
        int sumr=sum(root.right);
        return suml+sumr+root.data;
    }

    public static int height(node root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
    int rh=height(root.right);
    int myh=Math.max(lh,rh)+1;
    return myh;
    }



    public static int diameter(node root){      //time complexity---o(n^2)
        if(root==null){
            return 0;
        }

        int di1=diameter(root.left);
        int di2=diameter(root.right);
         int di3=height(root.left)+height(root.right)+1;
         int mydi=Math.max(Math.max(di1,di2),di3);
         return mydi;
    }

static class treeinfo{
    int ht;
    int diam;

    treeinfo(int ht,int diam){
        this.ht=ht;
        this.diam=diam;
    }
}
    public static treeinfo diameter2(node root){
        if(root==null){
            return new treeinfo(0,0);
        }

        treeinfo left=diameter2(root.left);
        treeinfo right=diameter2(root.right);

        int myhi=Math.max(left.ht,right.ht)+1;
        int d1=left.diam;
        int d2=right.diam;
        int d3=left.ht+right.ht+1;

        int myd=Math.max(Math.max(d1,d2),d3);
        treeinfo myinfo=new treeinfo(myhi,myd);
        return myinfo;
        

    }



 public static void main(String[] args){
    int nodes[]={1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
    binary tree=new binary();
    node root=tree.buildtree(nodes);
    //System.out.println(root.data);
    preorder(root);
    //inorder(root);
    //postorder(root);
    //levelorder(root);
    //System.out.println(count(root));
    //System.out.println(sum(root));
    //System.out.println(height(root));
    //System.out.println(diameter(root));
    //System.out.println(diameter2(root).diam);
 }
}