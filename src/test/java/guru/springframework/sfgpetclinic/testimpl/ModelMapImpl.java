package guru.springframework.sfgpetclinic.testimpl;

import guru.springframework.sfgpetclinic.fauxspring.Model;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ModelMapImpl implements Model {

    Map<String, Object> map = new HashMap<>();


    public Map<String, Object> getMap() {
        return map;
    }

    @Override
    public void addAttribute(String key, Object o) {
        map.put(key, o);
    }

    @Override
    public void addAttribute(Object o) {
        // not implemented
    }


}
