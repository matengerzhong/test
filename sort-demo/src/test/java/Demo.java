import java.lang.reflect.Method;

import org.junit.Test;
import com.bin.ShopDi;

public class Demo {

	@ShopDi
    public void aaaa(){}
	
	@Test
	public void test() {
			
		 Method[] ms = this.getClass().getDeclaredMethods();
	        for(Method m : ms ){
	            String mn = m.getName();
	            System.out.println(mn+"----"+m.isAnnotationPresent(ShopDi.class));
	             
	            if(m.isAnnotationPresent(ShopDi.class)){
	                System.out.println(mn+"------shop di ");
	            }
	        }
		
	}

}
