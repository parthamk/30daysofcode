### 1. How JavaScript is Executed?

JavaScript is a scripting language that allows you to make web pages interactive. When you include JavaScript code in an HTML document using a `<script>` tag, the browser executes it in a step-by-step fashion.

Imagine JavaScript as a set of instructions that the computer (or browser) follows, much like a recipe. Here's a basic example:

```html
<!DOCTYPE html>
<html>
<head>
    <title>Documents</title>
</head>
<body>
    <button id="myButton">Click me</button>
    
    <script>
        // JavaScript code
        document.getElementById("myButton").addEventListener("click", function() {
            alert("Hello, World!");
        });
    </script>
</body>
</html>
```

In this example, when you click the button, JavaScript runs the code inside the event listener and displays an alert.

### 2. How the Call Stack Works?

Think of the call stack as a stack of plates in a cafeteria. When you enter the cafeteria with a plate (function call), you add it to the top of the stack. When you finish eating (function execution), you remove the plate from the top. The last plate added is the first one removed, just like a stack of books.

Let's look at a simple example:

```javascript
function greet(name) {
    console.log("Hello, " + name + "!");
}

function sayHello() {
    console.log("Saying hello...");
    greet("Alice");
    console.log("Hello function executed.");
}

sayHello();
```

1. `sayHello()` is called, so it's added to the stack.
2. Inside `sayHello()`, `greet("Alice")` is called, so it's added to the stack.
3. Inside `greet("Alice")`, it logs a message and completes, so it's removed from the stack.
4. Back to `sayHello()`, it logs another message and completes, so it's removed.
5. Finally, we're back to the global scope (the main program), and `sayHello()` completes and is removed from the stack.

The call stack keeps track of where the program is in its execution.

### 3. How the Call Stack Helps JavaScript Code Execution?

The call stack ensures that JavaScript code is executed in the correct order. It keeps track of which functions are currently running and their order of execution. When a function is called, it's added to the stack, and when it completes, it's removed.

Imagine you're following a recipe that tells you to do one step at a time, and you write down each step on a piece of paper. You can only do the next step when you've finished the previous one. This is similar to how JavaScript follows the call stack to execute code in the correct order.

Understanding the call stack is essential for debugging and writing efficient JavaScript code because it helps you trace where errors occur and ensures that functions are called and completed in the right sequence.