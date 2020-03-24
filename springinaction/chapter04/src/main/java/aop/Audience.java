package aop;

import org.aspectj.lang.annotation.Pointcut;

/**
 * @author admin
 */
public class Audience {

    /** '* *'任意返回类型，任意类下的perform **/
    @Pointcut("execution(* *.perform(..))")
    public void performance() {

    }


}
