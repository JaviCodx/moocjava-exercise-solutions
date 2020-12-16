
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!

        HashMap<String, String> nicks = new HashMap<>();

        /*matthew's nickname is matt
    michael's nickname is mix
    arthur's nickname is artie*/
        nicks.put("matthews", "matt");
        nicks.put("michael", "mix");
        nicks.put("arthur", "artie");
        
        System.out.println(nicks.get("matthews"));

    }

}
