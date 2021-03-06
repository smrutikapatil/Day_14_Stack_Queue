package com.stack_and_queue;

import org.junit.Assert;
import org.junit.Test;

public class MyStackTest {
	@Test
	public void enQueueElement() {
		MyStack myStack = new MyStack();
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);

		myStack.enqueue(myFirstNode);
		myStack.enqueue(mySecondNode);
		myStack.enqueue(myThirdNode);
		myStack.printStack();
	}

	@Test
	public void deQueueElement() {
		MyStack myStack = new MyStack();
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);

		myStack.enqueue(myFirstNode);
		myStack.enqueue(mySecondNode);
		myStack.enqueue(myThirdNode);
		myStack.printStack();

		myStack.dequeue();
		myStack.printStack();
	}
}