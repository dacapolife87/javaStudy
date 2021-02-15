# 목표

자바의 애노테이션에 대해 학습하세요.

# 학습할 것

- 애노테이션 정의하는 방법
- @retention
- @target
- @documented
- 애노테이션 프로세서

---

### 어노테이션이란 무엇인가?

자바소스에서 사용하는 주석이라고 보면된다.

### Build-in Annotation

자바에 내장된 어노테이션으로 다음이 있다.

1. @Override
2. @Deprecated
3. @SuppressWarning
4. @FunctionalInterface

### 애노테이션 정의하는 방법

어노테이션을 정의하는방법은 다음과 같다
<pre>
public @interface Example {
}
</pre>


---

### @retention

어노테이션이 유지되는 기간을 말한다

SOURCE / CLASS / RUNTIME 3종류가 있으며 각각의 범위는 다음과 같다.

- RetentionPolicy.SOURCE
  - 소스상에만 존재하는 어노테이션이다.

- RetentionPolicy.CLASS
  - 컴파일후 CLASS까지만 존재하는 어노테이션이다.

- RetentionPolicy.RUNTIME
  - 런타임 시점까지 존재하는 어노테이션이다.

---

### @target

Target은 이 어노테이션이 어디에 적용될지를 정할수 있다.

| Target | 대상 | 
| :--- | :--- |
| TYPE | class, interface, annotation, enum 에만 적용가능 |
| FIELD | 필드, enum상수에만 적용가능 |
| METHOD | 메소드에만 적용가능 |
| PARAMETER | 파라미터에만 적용가능 |
| CONSTRUCTOR | 생성자에만 적용가능 |
| LOCAL_VARIABLE | 지역변수에만 적용가능가능 |
| ANNOTATION_TYPE | 어노테이션에만 적용가능 |
| PACKAGE | 패키지에만 적용가능가능 |

---

### @documented

- javadoc 으로 api문서를 만들때 어노테이션에 대한 설명도 포함하도록 지정

---

### 애노테이션 프로세서

- 컴파일 타임에 어노테이션 정보를 참고하여 코드를 분석하고 생성하는 등의 작업을 할수 있는 기능

- Lombok과 Querydsl등의 예가 있다.

---

#추가보충내용

### 어노테이션 요소의 규칙

<pre>
- 요소의 타입은 기본형, Stirng, enum, 어노테이션, Class만 허용된다.
- () 안에 매개변수는 선언할수 없다.
- 예외를 선언할 수는 없다.
- 요소를 타입 매개변수로 정의 할 수 없다.
</pre>

### 표준 어노테이션

자바에서 제공되는 어노테이션은 크게 2가지로 구성되어 있다.
하나는 자바코드를 작성할 때, 사용되는 어노테이션,
다른 하나는 어노테이션을 정의하기 위해 필요한 것들이다.

```java
@Override
@Deprecated
@FunctionalInterface
@SuppressWarnings
```

---

이번주 학습 출처

[출처] <https://sas-study.tistory.com/329>

[출처] <https://jdm.kr/blog/216>

[출처] <https://bingbingpa.github.io/java/whiteship-live-study-week12/>

