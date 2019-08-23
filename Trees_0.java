import java.util.ArrayList;
import java.util.List;

public class Trees_0 {
    public static Node build(){
        Node a=new Node('A');
        Node b=new Node('B');
        Node c=new Node('C');
        Node d=new Node('D');
        Node e=new Node('E');
        Node f=new Node('F');
        Node g=new Node('G');
        Node h=new Node('H');

        a.left=b;a.right=c;
        b.left=d;b.right=e;
        c.left=f;c.right=g;
        e.right=h;
        return a;
    }
    public static void preOrderTree(Node root){
       if(root==null){
           return;
       }
        System.out.print(" "+root.val);
       preOrderTree(root.left);
       preOrderTree(root.right);
       //时间复杂度为O（n）
        //

    }
    public static List<Character>preOder(Node root){
        if(root==null){
            return new ArrayList<>();
        }
        List<Character>list=new ArrayList<>();
        List<Character>left=preOder(root.left);
        List<Character>right=preOder(root.right);
        list.add(root.val);
        list.addAll(left);
        list.addAll(right);
        return list;

    }


public static List<Character>list;

 private static void preOrder_1(Node root){
    if(root==null){
        return;
    }
    list.add(root.val);
    preOrder_1(root.left);
    preOrder_1(root.right);

}
public static List<Character>preOrder_2(Node root){
     list=new ArrayList<>();
     preOrder_1(root);
     return list;
}

    public static void inOrderTree(Node root){
        if(root==null){
            return;
        }
        inOrderTree(root.left);
        System.out.print(" "+root.val);
        inOrderTree(root.right);

    }
    public static void postOrderTree(Node root){
        if(root==null){
            return;
        }
        postOrderTree(root.left);
        postOrderTree(root.right);
        System.out.print(" "+root.val);
    }

    public static void main(String[] args) {
        Node root=build();

        preOder(root);
        System.out.println(root.val);
        System.out.println(" ");
        preOrder_2(root);
        System.out.println(root.val);
        System.out.println(" ");
        inOrderTree(root);
        System.out.println(" ");
        postOrderTree(root);
    }
}
