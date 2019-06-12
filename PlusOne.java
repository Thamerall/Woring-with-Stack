import java.util.ArrayList;

public class PlusOne {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(plusone(list));

    }

    public  static ArrayList<Integer> plusone(ArrayList<Integer> a){
        int index  = a.size()-1;
        while (index >= 0 && a.get(index) == 9){
            a.remove(index);
            a.add(index,0);
            index--;
        }
        if(index < 0){
            a.add(0,1);
        }else {
            int x =a.get(index);
            x++;
            a.remove(index);
            a.add(index,x);
        }
        while (a.get(0)==0){
            a.remove(0);
        }
        return a;
    }

}