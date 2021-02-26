# 목표

자바의 제네릭에 대해 학습하세요.

# 학습할 것

- 제네릭 사용법
- Type 파라미터 네이밍 관습
- 제네릭 주요 개념 (바운디드 타입, 와일드 카드)
- 제네릭 메소드 만들기
- Erasure

---

### 제네릭 사용법

제네릭 타입은 타입을 파라미터로 가지는 클래스와 인터페이스를 말한다.
제네릭 타입은 클래스 또는 인터페이스 뒤에 <> 부호가 붙고 사이에 타입 파라미터가 위치한다.

```java
public class 클래스명<T> {...}
public interface 인터페이스명<T> {...}
```
지금까지 Map, List, Set 등등 다양한 JCF에서 사용하였던 다이아몬드 문법이 제네릭인것이다.

[출처] <https://coding-factory.tistory.com/573>

---

### Type 파라미터 네이밍 관습

> 관심에 의하면, Type 파라미터는 단일 대문자 입니다. 
> 이 기준은 이미 알고 있는 변수 네이밍 관습에 극명하게 반대입니다. 
> (좋은점은) 이런 관습이없으면 Type 변수와 일반적인 클래스 혹은 인터페이스 사이에 
> 차이를 전달하기 어려울 겁니다.

<pre>
E - Element
K - Key
N - Number
T - Type
V - Value
S,U,V etc... -> 2nd, 3rd, 4th types...
</pre>

[출처] <https://durtchrt.github.io/blog/java/generics/3/>


---

### 제네릭 주요 개념 (바운디드 타입, 와일드 카드)

- 바운디드 타입

타입 파라미터들은 바운드(bound) 될수 있다, 바운드 된다는 의미는 제한된다는 의미이며메소드가 받을 수 있는 타입을 제한 할 수 있다는 것이다.

```java
public <T extends Animal> List<T> fromArrayToList(T[] a) { ... }

// Animal을 상속받은 모든 동물이 가능

public <T super Cat> List<T> fromArrayToList(T[] a) { ... }

// 고양이의 상위 클래스만 가능

```
 
> 제네릭타입<T extends 상위타입> : 타입의 범위를 특정 객체의 하위클래스만 올 수 있다.
> 제네릭타입<T super 하위타입> : 타입의 범위를 특정 객체의 상위클래스만 올 수 있다.
 
- 다중 반운드

하나의 타입은 아래와 같이 상위의 여러 타입들을 상속받은 타입만 허용하도록 제한 할 수 있다.
<T extends Number & Comparable>
타입 T 가 상속받은 타입이 클래스인 경우(Number 클래스를 상속 받는다면) 클래스 타입을 먼저 표기해 해야 한다. 순서가 바뀔경우 컴파일 오류가 발생한다.


- 와일드 카드

자바에서 와일드 카드는 물음표 "?" 로 표시하며 알수 없는 타입을 의미할 때 사용된다.
와일드 카드는 특히 제네릭 타입을 사용할 때 유용하며, 파라미터로 사용될 수 있으나 사용시 먼저 알고 있어야 할 것이 있다.



Object는 모든 자바 클래스들의 부모 타입이긴 하지만 Object 컬렉션이 다른 컬렉션들의 부모타입이 되는것은 아니다.

예를들어 List<Object>는 List<String>의 부모타입이 아니며, 따라서 List<Object> 타입의 변수에 List<String> 변수를 할당할 경우 컴파일 오류가 발생하게 된다.

```java
public static void paintAllBuildings(List<Building> buildings) { 
    buildings.forEach(Building::paint); 
}
```

Building의 서브타입인 House를 보면 House 가 Building의 서브타입이긴 하지만 House리스트에 이 메소드를 사용할수 없다.
이때 와일드 카드를 사용해야한다.
```java
public static void paintAllBuildings(List<? extends Building> buildings) { ... }
```
위처럼 Building과 Building의 하위 타입에 대해 동작하는것이 "upper bounded wildcard(상위제한와일드카드)" 라고 부른다.

이와반대로

```java
public List<? super Integer> addList(List<? super Integer> list) {
    for (int i = 1; i < 5; i++) {
        list.add(i);
    }
    return list;
}
```
lower bounded wildcard(하위제한와일드카드)도 있는데 ? 타입은 정의된 타입 자체가 되거나 부모 타입이 되어야 한다.

[출처] <https://sthwin.tistory.com/22>

---

### 제네릭 메소드 만들기

- 제네릭 메서드란?
> 제네릭 메서드를 정의할 때는 리턴타입이 무엇인지와는 상관없이 내가 제네릭 메서드라는 것을 컴파일러에게 알려줘야한다.
> 그러기 위해서 리턴타입을 정의하기 전에 제네릭 타입에 대한 정의를 반드시 적어야 한다.

```java
public <타입파라미터,...> 리턴타입 메소드명(매개변수,...) { ... }
 
public <T> Box<T> boxing(T t) { ... }
```

예제를 보자

```java
class AAA {
    public String toString() {
        return "ClassAAA";
    }
}

class BBB {
    public String toString() {
        return "ClassBBB";
    }
}

class ShowType {
    public <T> void showType(T typeclass) {
        System.out.println(typeclass);
    }
}

public class GenericMethod {
    public static void main(String[] args) {
        AAA aaa = new AAA();
        BBB bbb = new BBB();

        ShowType showType = new ShowType();
        showType.showType(aaa);
        showType.showType(bbb);

        showType.<AAA>showType(aaa);
        showType.<BBB>showType(bbb);
    }
}
```

제네릭메소드에서는 호출하는 메소드에 타입을 지정해줘도 되지만 생략하여도된다. 생략할 경우 파라미터의 값을 보고 추론하여 컴파일러는 처리를 한다.

[출처] 난 정말 JAVA를 공부한 적이 없다구요 - 윤성우 저 
[출처] <https://ict-nroo.tistory.com/42>

---

### Erasure

제네릭은 타입의 안정성을 보장하며 실행시간에 오버헤드가 발생하지 않도록 하기 위해 추가되었다.
컴파일러는 컴파일 시점에 제네릭에 대하여 "type erasure"라고 부르는 프로세스를 적용한다.
타입 이레이저는 모든 타입 파라미터들을 제거하고나서 그자리를 제한하고 있는 타입으로 변경하거나 타입 파라미터의 제한 타입이 지정되지 않았을 경우에는 Object로 대체한다,


```java
public <T> List<T> genericMethod(List<T> list) { 
    return list.stream().collect(Collectors.toList()); 
}
// 컴파일후
public List<Object> withErasure(List<Object> list) { 
    return list.stream().collect(Collectors.toList()); 
}
```

타입이 제한되어 있을 경우 그 타입은 컴파일 시점에 제한된 타입으로 교체될 것이다.

```java
public <T extends Building> void genericMethod(T t) { ... }
// 컴파일 후
public void genericMethod(Building t) { ... }
```
[출처] <https://sthwin.tistory.com/22>

---
