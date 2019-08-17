
class Node1{
    Node1 next;
    int val;
    Node1(int val){this.val=val;}
}
public class Text_2 {
    public static Node1 divideList(Node1 head, int x) {
        Node1 small = null;
        Node1 big = null;
        Node1 last1 = null;
        Node1 last2 = null;
        //引用指向空即 引用==null
        for (Node1 cur = head; cur != null; cur = cur.next) {
            if (cur.val < x) {
                if (small == null) {
                    small = cur;
                } else {
                    last1.next = cur;
                }
                last1 = cur;
            } else {
                if (big == null) {
                    big = cur;
                } else {
                    last2.next = cur;
                }
                last2 = cur;
            }
        }
        if (small == null) {
            return big;
        } else {
            small.next = big;
        }
        if (last2 != null) {
            last2.next = null;
        }
        return small;
    }

    public static void display(Node1 head){
        for(Node1 cur=head;cur!=null;cur=cur.next){
            System.out.printf("(%d)-->",cur.val);
        }
        System.out.println("null");
    }
    public static Node1 createList1(){
        Node1 n1=new Node1(1);
        Node1 n2=new Node1(2);
        Node1 n3=new Node1(3);
        Node1 n4=new Node1(4);
        Node1 n5=new Node1(5);
        n1.next=n2;n2.next=n3;n3.next=n4;n4.next=n5;
        return n1;
    }
    public static void main(String[] args) {
        Node1 L=createList1();
        display(L);
        Node1 result=divideList(L,3);
        display(result);
    }
}
