package org.example;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE})
@Inherited
public @interface MyAnnotation {

    // Annotation은 주석 취급한다. 클래스까지는 남는데 바이트 코드를 로딩했을때 메모리 정보는 남지 않는다.
    // 가져오고 싶으면 @Retention RetentionPolicy.RUNTIME에 옵션 값을 준다
    // 기본적으로 사용할 수 있는 위치를 지정할 수 있다.(@Target), 허용되지 않은 위치에서 사용하면 컴파일 에러
    // 기본값을 가질 수 있음
     // default에 값을 설정하지 않고 사용할 때 값을 주지 않으면 에러남
    // 상속이 되는 Annotation 설정하려면 Inherited 설정
    // 상위 클래스에 붙어있는 Annotation을 하위 클래스에서 조회할 수 있다.
    String name() default "kyeongjun";

    int number() default 100;

}
