package section03.decorator._03_java;

import jakarta.servlet.http.HttpServletRequestWrapper;
import jakarta.servlet.http.HttpServletResponseWrapper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DecoratorInJava {

    public static void main(String[] args) {
        // Colletions가 제공하는 데코레이터 메소드
        ArrayList list = new ArrayList<>();
        list.add(new Book());

        List books = Collections.checkedList(list, Book.class);

        list.add(new Item());
//        books.add(new Item()); //에러

        List unmodifiableList = Collections.unmodifiableList(list);
//        unmodifiableList.add(new Book()); // 에러

        // 서블릿 요청 또는 읍답 랩퍼
        HttpServletRequestWrapper requestWrapper;
        HttpServletResponseWrapper responseWrapper;
    }

    private static class Book {
    }

    private static class Item {
    }
}
