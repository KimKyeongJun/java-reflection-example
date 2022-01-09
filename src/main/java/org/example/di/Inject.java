package org.example.di;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
// 런타임에 참조할 애노테이션은 반드시 런타임 설정을 해야한다

public @interface Inject {
}
