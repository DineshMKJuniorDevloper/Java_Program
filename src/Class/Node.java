package Class;

//Define the Node class representing each element in the linked list
class Node {
 int data;  // The data held by the node
 Node next;  // Reference to the next node
 
 Node(int data) {
     this.data = data;  // Assign data to the node
     this.next = null;  // Initially, there's no next node
 }
}

//Define the LinkedList class with methods to manage the list
class LinkedList {
 Node head;  // The head node of the linked list
 
 // Method to insert a new node at the beginning of the list
 public void insertAtBeginning(int data) {
     Node newNode = new Node(data);  // Create a new node
     newNode.next = head;  // The new node points to the current head
     head = newNode;  // The new node becomes the new head
 }
 
 // Method to reverse the linked list
 public void reverse() {
     Node prev = null;  // The previous node (initially null)
     Node current = head;  // The current node (starting at the head)
     Node next;  // The next node
     
     while (current != null) {
         next = current.next;  // Save the next node
         current.next = prev;  // Reverse the link
         prev = current;  // Move `prev` to `current`
         current = next;  // Move `current` to `next`
     }
     
     head = prev;  // After the loop, `prev` is the new head
 }
 
 // Method to print the linked list
 public void printList() {
     Node current = head;  // Start from the head
     while (current != null) {
         System.out.print(current.data + " ");  // Print the data of the current node
         current = current.next;  // Move to the next node
     }
     System.out.println();  // Print a new line after printing the list
 }
}
 
//Main class to test the linked list reversal
//public class Main {
// public static void main(String[] args) {
//     LinkedList list = new LinkedList();  // Create a new linked list
//     
//     // Insert some values into the linked list
//     list.insertAtBeginning(50);  // Insert at the beginning
//     list.insertAtBeginning(40);
//     list.insertAtBeginning(30);
//     list.insertAtBeginning(20);
//     list.insertAtBeginning(10);
//     
//     // Print the original list
//     System.out.print("Original Linked List: ");
//     list.printList();  // Output the list before reversal
//     
//     // Reverse the linked list
//     list.reverse();  // Reverse the list
//     
//     // Print the reversed list
//     System.out.print("Reversed Linked List: ");
//     list.printList();  // Output the list after reversal
// }
//}
