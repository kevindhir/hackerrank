/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycleHelper(Node head, List<Node> visited){
    if(head == null){
        return false;
    }
    if(visited.contains(head)){
        return true;
    }
    visited.add(head);
    return hasCycleHelper(head.next, visited);
}
boolean hasCycle(Node head) {
    return hasCycleHelper(head, new ArrayList<Node>());
}
