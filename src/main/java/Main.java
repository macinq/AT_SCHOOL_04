import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import somepackage.Other;
import somepackage.Some;
import somethinggreen.AnnotationForExaple;
import somethinggreen.Contract;

import java.util.HashMap;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        HashMap<String,Object> map = new HashMap<>();
        map.put("key1", "value");
        map.put("key2", "value");
        map.put("key3", "value");
        map.put("key4", "value");

        /*LinkedList list =
                new LinkedList();
        list.add("UIGIU");
        list.add(new Object());
        list.add(1);

        for(int i=0; i<list.size();i++){
            if(list.get(i).getClass().getSimpleName().equals("Object")){
                System.out.println(list.get(i));
            }
        }

        System.out.println(list.get(0));*/
        for (String s : map.keySet()) {
            System.out.println(map.get(s));
        }
        Contract.staticMethod("");

        System.out.println(map);

        Some some = new Some("ku");
        some.soTellMeAboutInterfaces();
        System.out.println(some.getДаТакТожеМожно());
        System.out.println(some.toString());
        System.out.println(Some.class.getAnnotation(AnnotationForExaple.class).description());
        System.out.println(some.count());
        Other.saySomthing();


    }
}
