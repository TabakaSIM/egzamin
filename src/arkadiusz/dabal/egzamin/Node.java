package arkadiusz.dabal.egzamin;

public class Node {
    private int wartosc;
    private Node left;
    private Node right;

    public Node(int wartosc) {
        this.wartosc = wartosc;
    }

    public void add(int value) {
        if(value<this.wartosc){
            if(left==null){
                left=new Node(value);
            }else {
                left.add(value);
            }

        }
        if(value>this.wartosc){
            if(right==null){
                right=new Node(value);
            }else {
                right.add(value);
            }
        }
        if(value==this.wartosc){
            TreeGUI.getInstance().valueError();
        }
    }

    public boolean check(int value) {
        if(value==this.wartosc){
            return true;
        }
        if(value>this.wartosc){
            if(right!=null){
                return right.check(value);
            } else {
                return false;
            }
        } else {
            if(left!=null){
                return left.check(value);
            } else{
                return false;
            }
        }
    }

    public int max() {
        if(right!=null){
            return right.max();
        } else {
            return this.wartosc;
        }
    }

    public int min() {
        if(left!=null){
            return left.min();
        } else {
            return this.wartosc;
        }
    }
}
