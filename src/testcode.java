
import java.util.*;

public class testcode {
    public static void main(String[] args) {
Set<String> set=new LinkedHashSet<>();
set.add("hello");
set.add("bye");
Iterator<String> iterator=set.iterator();
while(iterator.hasNext()){
    String signals=iterator.next();
    System.out.println(signals);

}



    }}