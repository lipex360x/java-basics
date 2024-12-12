## Stack and Queue

* Stack (LIFO: Last In First Out)
* Queue (FIFO: First In First Out)

---

### - Stack (LIFO: Last In First Out)

**Methods**

* top(); - show last element preserving stack
* pop(); - show and remove the last element from stack / change last reference
* push(); - insert new element on the top of stack

```java
public boolean isEmpty() {
  return refNode == null;
}
```

* Example of show data (with while)

```java
@Override
public String toString() {
  String returnData = "-----------------\n";
  returnData += "      Stack\n";
  returnData += "-----------------\n";
  Node auxiliarNode = this.referenceNode;
  while(true) {
    if (auxiliarNode == null) break;
    returnData += auxiliarNode.getData() + "\n";
    auxiliarNode = auxiliarNode.getReferenceNode();
  }
  returnData += "=================";
  return returnData;
}
```

---

### Queue (FIFO: First In First Out)

**Methods**

* enqueue();
* dequeue();
* isEmpty();