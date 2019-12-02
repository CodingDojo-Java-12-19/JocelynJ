import java.util.HashMap;
import java.util.Set;

public class Hashmatique {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Immature", "How could I be so immature to think he could replace the missing elements in me. How extremely lazy of me.");
        trackList.put("A Dream of You and Me", "All that glitters is gold. Don't believe what you've been told. People lie, people love, people go. But beauty lies, in every soul.");
        trackList.put("Happier", "Then only for a minute I want to change my mind. 'Cause this just don't feel right to me. I want to raise your spirits. I want to see you smile but know that means I'll have to leave.");
        trackList.put("Back To Us", "I'll fix this love. Sew it back up to what it was. We do it together so we can get back to us.");
        trackList.put("Accidents", "Do they even cure you? (Cut me open drug me) or it is just to humor us. (Repair all my defects) before we die. If only we could heal ourselves we wouldn't need to be hooked up to these machines.");
        
        
        System.out.println(trackList.get("Immature"));
        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println(key + ": " + trackList.get(key));    
        }
    }
}
