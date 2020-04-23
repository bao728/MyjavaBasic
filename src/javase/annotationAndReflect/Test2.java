package javase.annotationAndReflect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解
 */
public class Test2 {

    @MyAnnotation2(school = "浙江大学")
    void test1(){

    }
}

@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation2{

    //注解的参数   类型  名字();
    String name() default "张三";
    String school();

}