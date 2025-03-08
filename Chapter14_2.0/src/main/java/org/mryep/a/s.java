package org.mryep.a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class s {
    @SuppressWarnings({"all"})
    //Hashset treeSet 常用
    public static void main(String[] args) {
        //1. 以Set 接口的实现类 HashSet 来讲解Set 接口的方法
        //2. set 接口的实现类的对象(Set接口对象), 不能存放重复的元素, 可以添加一个null
        //3. set 接口对象存放数据是无序(即添加的顺序和取出的顺序不一致)
        //4. 注意：取出的顺序的顺序虽然不是添加的顺序，但是他的固定.
        Set set = new HashSet();
        set.add("john");
        set.add("lucy");
        set.add("john");//重复
        set.add("jack");
        set.add("hsp");
        set.add("mary");
        set.add(null);//
        set.add(8);//
        set.add(8.00);//
        set.add(null);//再次添加null

        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("----------------");
        for (Iterator i = set.iterator(); i.hasNext();) {
            System.out.println(i.next());
        }
        System.out.println("----------------");
        for(Object o :set){
            System.out.println(o);
        }
    }


}




