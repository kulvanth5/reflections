package annotations;

import java.lang.annotation.*;



@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface invokeController {

	boolean invoke() default false;

}

