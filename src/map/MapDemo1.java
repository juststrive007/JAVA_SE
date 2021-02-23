package map;

import java.util.HashMap;
import java.util.Map;

/**
 * java.util.Map接口 查找表
 * Map体现的结构时一个多行两列的表格，左列称为Key，右列称为value
 * Map总是根据key来获取对应的value。因此保存数据时总是成对保存的
 * 并且应当将查询的数据作为value查询条件作为key进行保存
 * Map要求key不允许重复（equals比较判定）
 *
 * 常用的实现类：
 * java.util.HashMap,散列表，哈希表
 * 当今查询速度最快的数据结构。
 *
 * @author wm
 */
public class MapDemo1 {
    public static void main(String[] args) {
        Map<String, Integer> map=
                new HashMap<>();
        /**
         * V put（K k ，V v）
         * 将给定的key-value对存入Map
         * 由于Map要求Key不允许重复，所以若要使用重复的key存储则是替换
         * value操作那么返回值就是该key原来对应的value
         * 若给定的key不存在则返回值为null。
         *
         */
        map.put("chinese",99);
        map.put("math",98);
        map.put("english",97);
        map.put("Physics",96);
        map.put("chemistry",99);


        System.out.println(map);
        Integer value = map.put("chemistry",98);
        System.out.println(value);
        System.out.println(map);

        /**
         * V get(object key)
         * 根据给定的key获取对应的value
         * 若给定的key不存在则返回值为null
         */
        value=map.get("math");
        System.out.println(value);
        value=map.get("art");
        System.out.println(value);

        /**
         * V remove(Object key)
         * 删除当前Map中给定的key所对应的键值对
         * 返回值为该key对应的value
         */
        value=map.remove("math");
        System.out.println(value);
        System.out.println(map);

        /**
         * int size()
         * 返回Map中的元素个数
         */
        int size=map.size();
        System.out.println("size:"+size);



        boolean ck=map.containsKey("chinese");
        System.out.println("key chinese:"+ck);

        ck=map.containsValue(96);
        System.out.println("value 97:"+ck);
    }
}
