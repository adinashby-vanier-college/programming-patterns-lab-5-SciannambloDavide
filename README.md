[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/zfexo366)
# Programming Patterns - Lab 5

This template repository is the starter project for Programming Patterns Lab 5. Written in Java, and tested with Gradle/JUnit.

### Question(s)

Given the `head` of a singly linked list, sort the list using **insertion sort**, and return the sorted list's head.

The steps of the **insertion sort** algorithm:

1. Insertion sort iterates, consuming one input element each repetition and growing a sorted output list.
2. At each iteration, insertion sort removes one element from the input data, finds the location it belongs within the sorted list and inserts it there.
3. It repeats until no input elements remain.

The following is a graphical example of the insertion sort algorithm. The partially sorted list (black) initially contains only the first element in the list. One element (red) is removed from the input data and inserted in-place into the sorted list with each iteration.

[Insertion Sort Example](https://upload.wikimedia.org/wikipedia/commons/0/0f/Insertion-sort-example-300px.gif)

Example 1:

![](Q1.jpg)

Input: head = [4,2,1,3]  
Output: [1,2,3,4]

Example 2:

![](Q1_2.jpg)

Input: head = [-1,5,3,4,0]  
Output: [-1,0,3,4,5]

**Constraints**

The number of nodes in the list is in the range [1, 5000].  
-5000 <= Node.val <= 5000

### Setup Command

`gradle clean`

### Run Command

`gradle test`
