package basic_java;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListIterator {
    public static void main(String []args) {
            readDataFromArrayList();
            copyDataFromArrayList();
            reverseArrayList();
    }
    //How to read data from ArrayList using Iterator
        public static void readDataFromArrayList(){
            ArrayList<String> arrl = new ArrayList<String>();
            //adding elements to the end
            arrl.add("First");
            arrl.add("Second");
            arrl.add("Third");
            arrl.add("Fourth");
            Iterator<String> itr = arrl.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
        }

    //How to copy data from ArrayList
    public static void copyDataFromArrayList(){
        ArrayList<String> arrl = new ArrayList<String>();
        //adding elements to the end
        arrl.add("Bangladesh");
        arrl.add("India");
        arrl.add("Nepal");
        arrl.add("America");
        System.out.println("Actual arrayList is"+arrl);
        ArrayList<String> copy = (ArrayList<String>)arrl.clone();
        System.out.println("Cloned arrayList is -->"+copy);
    }

    //How to reverse ArrayList
    public static void reverseArrayList(){
            ArrayList <String> list = new ArrayList<String>();
            list.add("Bangladesh");
            list.add("India");
            list.add("Nepal");
            list.add("America");
        Collections.reverse(list);
        System.out.println("***********After reverse operations************");
        for (String str:list){
            System.out.println(str);
        }

    }
        }


