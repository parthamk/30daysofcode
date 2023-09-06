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
