package startFromP624;
import java.lang.annotation.*;

@Target(ElementType.TYPE)	//applies to classes only
@Retention(RetentionPolicy.RUNTIME)
public @interface DBTable {
	public String name() default "";
}
