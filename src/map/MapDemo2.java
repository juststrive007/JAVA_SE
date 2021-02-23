package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map的遍历
 * Map提供了三种遍历方式：
 * 1.遍历所有的key
 * 2.遍历每一组键值对
 * 3.遍历所有的value(不常用)
 * @author wm
 *
 */
public class MapDemo2 {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();


        map.put("chinese",99);
        map.put("english",98);
        map.put("math",97);
        map.put("physics",96);
        map.put("chemistry",95);

        System.out.println(map);

        /**
         * 遍历所有的key
         * Set keySet()
         * 将当前Map中所有的key一个Set集合形式返回。
         * 遍历该集合等于遍历所有的key
         */
         Set<String> keySet =  map.keySet();
         for(String key:keySet){
             System.out.println("key:"+key);
         }

        /**
         * 遍历每一组键值对
         * Set entrySet()
         * 将当前Map中每一组键值对以一个Entry实例存入Set集合并返回
         *
         * java.util.Map.Entry
         * Entry的每一个实例用于表示Map中的一组键值对
         */


        Set<Map.Entry<String,Integer>> entrySet= map.entrySet();
        for(Map.Entry<String,Integer> e:entrySet){
            String key =e.getKey();
            Integer value=e.getValue();
            System.out.println(key+":"+value);
        }


        /**
         * Collection values()
         * 将当前Map中所有的value以一个集合的形式返回
         * （应为value可能由重复，不能以set形式存储）
         */

        Collection<Integer> values =map.values();
        for(Integer value:values){
            System.out.println("value:"+value);
        }

    }
}
