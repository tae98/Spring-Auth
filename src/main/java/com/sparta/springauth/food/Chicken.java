package com.sparta.springauth.food;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // 인터페이스나 상속으로 같은 타입의 여러게 빈이 있을 시 primary annotation 이있는 클래스를 우선적으로 선택함
public class Chicken implements Food {
    @Override
    public void eat() {
        System.out.println("치킨을 먹습니다.");
    }
}