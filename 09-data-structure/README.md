## Tree

* Show In Order
```java
public void showInOrder(BinNode currentNode) {
  if (currentNode != null) {
    showTree(currentNode.nodeLeft) ;
    System.out.println(currentNode.content);
    showTree(currentNode.nodeRight);
  }
}
```

* Show Pre Order
```java
public void showPreOrder(BinNode currentNode) {
  if (currentNode != null) {
    System.out.println(currentNode.content);
    showInOrder(currentNode.nodeLeft);
    showInOrder(currentNode.nodeRight);
  }
}
```

* Show Post Order
```java
public void showPostOrder(BinNo currentNode) {
  if(currentNode != null) {  
    showInOrder(currentNode.nodeLeft);
    showInOrder(currentNode.nodeRight);
    System.out.println(currentNode.conteudo);
  }
}
```
