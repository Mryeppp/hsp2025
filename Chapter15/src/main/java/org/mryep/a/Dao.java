package org.mryep.a;

import java.util.*;

public class Dao<T> {
    private Map<String,T> map = new HashMap<>();
    public void save(String id, T entity) {
        map.put(id, entity);
    }
    public T get(String id) {
        return map.get(id);
    }
    public void update(String id, T entity) {
        map.put(id, entity);
    }
    public List<T> list(){
        List<T> list = new ArrayList<>();

        Set<String> keyset = map.keySet();
        for(String key : keyset){
            list.add(get(key));
        }
        return list;
    }
    public void delete(String id) {
        map.remove(id);
    }
}
