package com.imooc.ad.index;

/**
 * Created by Jingchao Zhang
 * Date: 2020-08-08
 * Time: 9:25 PM
 */
public interface IndexAware<K, V> {

    V get(K key);

    void add(K key, V value);

    void update(K key, V value);

    void delete(K key, V value);
}
