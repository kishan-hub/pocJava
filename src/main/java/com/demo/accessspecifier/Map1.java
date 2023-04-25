package com.demo.accessspecifier;


import java.util.Collection;
import java.util.Set;



public interface Map1<K, V> {
    // Query Operations
    boolean isEmpty();
 
    boolean containsKey(Object key);
   
    boolean containsValue(Object value);   
    V get(Object key);

    // Modification Operation
   
    V put(K key, V value);

    V remove(Object key);
    // Bulk Operations
    
    void putAll(Map1<? extends K, ? extends V> m);
   
    void clear();

    // Views

    Set<K> keySet();

    Collection<V> values();
    
    Set<Map1.Entry<K, V>> entrySet();
    
    interface Entry<K, V> {
      
        V getValue();      
        V setValue(V value);     
        boolean equals(Object o);
        int hashCode();
    }
}

