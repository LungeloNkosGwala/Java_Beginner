import java.util.*;
public class MainA {
    public static void main(String[] args) {


        //LISTS AND LOOPS AND JAVA


        //FIRST EXAMPLE
        List<Integer> bin_seq = new ArrayList<Integer>();

        bin_seq.add(2);
        bin_seq.add(4);
        bin_seq.add(6);
        bin_seq.add(8);
        bin_seq.add(10);

        for (int i:bin_seq) {
            System.out.println(i);
        }


        //MUTABLES LISTS
        List<Integer> age = new ArrayList<>(
            Arrays.asList(1,2,3,8)
        );

        age.add(4);

        System.out.println(age);


        //USING COLLECTIONS.addALL()

        List<Integer> soh = new ArrayList<Integer>();

        Collections.addAll(soh,12,14,56,34,56);

        soh.add(100);

        System.out.println(soh);



        //Collection.unmodifieableList

        List<Integer> qty = Collections.unmodifiableList(Arrays.asList(7,4,7,3,7,3,4));

        try {
            qty.add(67);
        }

        catch (Exception e){
            System.out.println("Exception :" + e);
        }


        

    }
    
}
