package com.bin;
import java.lang.annotation.Retention;

import java.lang.annotation.RetentionPolicy;

// declare a new annotation
@Retention(RetentionPolicy.RUNTIME)
public @interface ShopDi {
	 String abc() default "";
	 String value() default "";
}
