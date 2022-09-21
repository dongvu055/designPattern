package creational.prototypeDS;

import java.util.HashMap;
import java.util.Map;

public class CacheAccount {
    static Map<String,Account> accountCache = new HashMap<>();

    static {
        AAccount aAccount = new AAccount();
        BAccount bAccount = new BAccount();
        accountCache.put("AAcount",aAccount);
        accountCache.put("BAcount",bAccount);
    }


}
