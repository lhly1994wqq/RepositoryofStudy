package FakeHibernate;

import java.lang.reflect.Method;

public class ParseHibernateAnnotation {
    
//    public static void main(String[] args){
//
//        Class<Hero> clazz = Hero.class;
//        MyEntity myEntity = (MyEntity)clazz.getAnnotation(MyEntity.class);
//
//        //判断是否是实体类
//        if(null == myEntity){
//            System.out.println("Hero类不是实体类");
//        }else {
//            System.out.println("Hero类是实体类");
//            //获取其所在表名
//            MyTable myTable = (MyTable)clazz.getAnnotation(MyTable.class);
//            String tablename = myTable.name();
//            System.out.println("其对应的表名是："+tablename);
//
//            Method[] methods = clazz.getMethods();
//            Method primaryKeyMethod = null;
//            for(Method m:methods){
//                //判断哪个方法具有MyId注解
//                MyId myId = m.getAnnotation(MyId.class);
//                if(null != myId){
//                    //获取主键的设置方法
//                    primaryKeyMethod = m;
//                    break;
//                }
//            }
//
//            if(null != primaryKeyMethod){
//                System.out.println("找到主键："+method2attribute(primaryKeyMethod.getName()));
//                //获取自增策略
//                MyGeneratedValue myGeneratedValue =
//                        primaryKeyMethod.getAnnotation(MyGeneratedValue.class);
//                System.out.println("其自增策略是："+myGeneratedValue.strategy());
//                MyColumn myColumn = primaryKeyMethod.getAnnotation(MyColumn.class);
//                System.out.println("对应数据库中的字段是："+myColumn.value());
//            }
//            System.out.println("其他非主键属性分别对应的数据库字段如下：");
//            //遍历每个方法的注解
//            for(Method m:methods){
//                if(m==primaryKeyMethod)
//                    continue;
//                MyColumn myColumn = m.getAnnotation(MyColumn.class);
//                if(null == myColumn)
//                    continue;
//                System.out.format("属性：%s\t对应的数据库字段是：%s%n",method2attribute(m.getName()),myColumn.value());
//            }
//        }
//    }

    private static String method2attribute(String name) {
        String result = name;
        result = result.replaceFirst("get","");
        result = result.replaceFirst("is","");
        if(result.length()<=1){
            return result.toLowerCase();
        }else {
            return result.substring(0,1).toLowerCase()+result.substring(1,result.length());
        }
    }

}
