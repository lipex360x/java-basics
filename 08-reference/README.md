## Generics

* Unknown Wildcards (Unbounded)

* Bounded Wildcard (Upper/Lower Bounded)

* Convention

---

### Unknown Wildcards (Unbounded)

```java
public void printList(List<?> list) {
  for(Object obj : list) {
    System.out.println(obj);
  }
}

List<Student> students = new List<Student>();
printList(students);
```

---

### UpperBounded Wildcard

```java
public void printList(List<? extends User> list) {
  for(User user : list) {
    System.out.println(user);
  }
}

List<Student> students = new List<Student>();
printList(students);
```

---

### LowerBounded Wildcard

```java
public void printList(List<? super User> list) {
  for(User user : list) {
    System.out.println(user);
  }
}

List<Student> students = new List<Student>();
printList(students);
```

---

### Convention

**K** - Key: Map<K,V>
**V** - Value: Map<K,V>
**E** - Element: List<E>
**T** - Type: Collections#addAll
**?** - Generic