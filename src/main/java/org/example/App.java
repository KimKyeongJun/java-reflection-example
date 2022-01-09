package org.example;

import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException {
        // 클래스 타입을 가져오는 방법
        //타입을 통해서 가져오는 방법
        Class<Book> bookClass = Book.class;

        // 인스턴스를 통해 가져오는 방법
        Book boot = new Book();
        Class<? extends Book> aClass = boot.getClass();

        Class<?> aClass1 = Class.forName("org.example.Book");

        // 클래스에 있는 모든 필드 출력
        Arrays.stream(bookClass.getDeclaredFields()).forEach(System.out::println);

        Arrays.stream(bookClass.getDeclaredFields()).forEach(f -> {
            try {
                // 리플렉션에서는 접근 지시자를 무시할 수 있다.
                f.setAccessible(true);
                System.out.printf("%s %s\n", f, f.get(boot));
            } catch (IllegalAccessException e) {
                e.getStackTrace();
            }
        });

        Arrays.stream(bookClass.getMethods()).forEach(System.out::println);

        Arrays.stream(bookClass. getDeclaredConstructors()).forEach(System.out::println);

        System.out.println(MyBook.class.getSuperclass());

        Arrays.stream(MyBook.class.getInterfaces()).forEach(System.out::println);

        Arrays.stream(Book.class.getFields()).forEach(f->{
            int modifiers = f.getModifiers();
            System.out.println(f);
            System.out.println(Modifier.isPrivate(modifiers));
            System.out.println(Modifier.isProtected(modifiers));
            System.out.println(Modifier.isStatic(modifiers));
        });

        Arrays.stream(Book.class.getMethods()).forEach(m->{
            int modifiers = m.getModifiers();
            System.out.println(m);
            System.out.println(Modifier.isInterface(modifiers));
            System.out.println(Modifier.isProtected(modifiers));
            System.out.println(Modifier.isStatic(modifiers));
            System.out.println(m.getReturnType());
            System.out.println(m.getParameterTypes());
        });




        Arrays.stream(Book.class.getAnnotations()).forEach(System.out::println);

        // 자기 자신에만 붙어있는 애노테이션 조회
        Arrays.stream(Book.class.getDeclaredAnnotations()).forEach(System.out::println);

    }
}
