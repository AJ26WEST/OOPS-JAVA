import java.util.ArrayList;


class HelloWorld {
    public static void main(String[] args) {
        ArrayList<String> Food = new ArrayList<String>();

        Food.add("chicken");
        Food.add("mutton");
        Food.add("hmm mm");
        for(int i=0;i<Food.size();i++) {
            System.out.println(Food.get(i));
        }

    }
}
