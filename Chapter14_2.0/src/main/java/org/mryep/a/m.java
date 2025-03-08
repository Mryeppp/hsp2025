package org.mryep.a;

import java.util.*;

public class m {
    @SuppressWarnings({ "all" })
    public static void main(String[] args) {
        Map m = new HashMap();
        m.put("a", "b");
        m.put("a", "c");
        m.put("b", "c");
        // System.out.println("m = " + m);

        // NO1 use keyset() to get key ->> value
        Set keyset = m.keySet();
        // 1.pro for
        for (Object key : keyset) {
            System.out.println(key + " = " + m.get(key));
        }
        // 2.iterator itit(short keys)
        Iterator iterator = keyset.iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            System.out.println(key + " = " + m.get(key));
        }

        // NO2 use values() to get all values
        Collection values = m.values();
        // 1.pro for
        for (Object value : values) {
            System.out.println(value);
        }
        // 2.itit
        // Iterator iterator1 = values.iterator();
        // while (iterator1.hasNext()) {
        // Object value = iterator.next();
        // System.out.println(value);
        // }

        for (Iterator iterator2 = values.iterator(); iterator2.hasNext();) {
            System.out.println(iterator2.next());
        }
        // NO3 : use entryset()
        Set entryset = m.entrySet(); // Entryset<Map.Entry<K,V>>
        // 1.pro for
        for (Object entry : entryset) {
            // System.out.println(entry);
            Map.Entry m_e = (Map.Entry) entry;
            System.out.println(m_e.getKey() + "=" + m_e.getValue());
        }
        // 2.itit
        Iterator iterator3 = entryset.iterator();
        while (iterator3.hasNext()) {
            Object entry = iterator3.next(); // entry其实是一个HashMap$Node -实现了Map.Entry()->(getKey(),getValue())

            // System.out.println(entry.getClass());
            // class java.util.HashMap$Node
            // System.out.println(iterator3.getClass());
            // class java.util.HashMap$EntryIterator
            Map.Entry m_e = (Map.Entry) entry;
            System.out.println(m_e.getKey() + "__" + m_e.getValue());

            // System.out.println(entry);
        }

        // 3.for
        for (Iterator it = entryset.iterator(); it.hasNext();) {
            // System.out.println(it.next());
            Map.Entry m_e = (Map.Entry) it.next();
            System.out.println(m_e.getKey() + "__" + m_e.getValue());
        }

    }
}
