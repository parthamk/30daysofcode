## Closure

In JavaScript, a closure is a function that "closes over" the variables and functions it has access to in its lexical scope, even after that scope has exited. In other words, a closure allows a function to retain access to variables and functions from its outer (enclosing) function's scope even when the outer function has finished executing.

Here's a simple example to illustrate closures in JavaScript:

    function outerFunction() {
	  const outerVar = 10;

	  function innerFunction() {
	    console.log(outerVar); // innerFunction can access outerVar
	  }

	  return innerFunction;
	}

	const closure = outerFunction(); // outerFunction returns innerFunction
	closure(); // This will log 10, even though outerFunction has already exited

`Fund an excellent example for closure:`

> Here's is it:

Imagine you have a picnic basket (the closure) with your favourite snacks (variables and functions) inside. You bring this basket to a park and can enjoy your snacks anytime you want, even if you move to a different spot in the park. The basket remembers what's inside, just like a closure remembers variables and functions from where it was created.

In JavaScript, closures help functions remember things from the place where they were born, even when those functions are used somewhere else in your code. This can be really handy for keeping track of information or doing special tasks.
