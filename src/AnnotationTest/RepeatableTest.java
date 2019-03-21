package AnnotationTest;

import java.lang.annotation.*;





public class RepeatableTest {

    //定义一个可重复的注解，其@Repeatable值采用FileTypes
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    @Repeatable(FileTypes.class)
    public @interface FileType{
        String value();
    }

    //注解FileTypes，其value()返回一个FileType数组
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface FileTypes{
        FileType[] value();
    }

    @FileType(".java")
    @FileType(".html")
    @FileType(".css")
    @FileType(".js")
    public void work(){

        try{
            //从方法的注解中获取信息
            FileType[] fileTypes = this.getClass().getMethod("work").getAnnotationsByType(FileType.class);

            System.out.println("将从如下后缀名的文件中查找文件内容");

            //将获取的信息打印出来
            for(FileType fileType : fileTypes){
                System.out.println(fileType.value());
            }
            System.out.println("查找过程省略。。。");
        }catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
