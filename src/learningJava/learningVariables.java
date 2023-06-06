package learningJava;

import org.json.JSONArray;
import org.json.JSONObject;

public class learningVariables {



    public static void main(String[] args) {
       /* char a=5;
        char b = 3;
        int c = (char) (a+b);

        System.out.println(c);

        float f=10.5f;
        int d = (int) f;
        System.out.println(d);

        byte e= (byte) c;
        System.out.println(e);

        int g= 256;
        byte m= (byte) g;
        System.out.println(g);
        System.out.println(m);*/

        learningVariables ln = new learningVariables();
        ln.jsonStuffs();
    }


    public static void jsonStuffs(){
        JSONObject js= new JSONObject();

        js.put("id", 1);
        js.put("name", "Salim");

        System.out.println(js);

        JSONArray jsonArray =new JSONArray();
        jsonArray.put("a");
        jsonArray.put("b");

        System.out.println(jsonArray);

        js.put("alphabets",jsonArray );
        System.out.println(js);

        JSONArray jsonArray1 =new JSONArray();

        jsonArray1.put(jsonArray);

        js.put("alphabet1", jsonArray1);

        System.out.println(js);
    }


}
