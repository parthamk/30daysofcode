# Features introduced in ECMAScript 6 (ES6): 

1. **let and const**
   - **Description:** `let` and `const` are new ways to declare variables, replacing `var`. `let` allows variable reassignment, while `const` creates immutable variables.
   - **Example:**
     ```javascript
     let age = 25;
     age = 26; // Valid

     const name = "John";
     name = "Doe"; // Invalid, will throw an error
     ```

   - **How to Use:** Use `let` for variables that can change their values and `const` for constants that should not be reassigned.

2. **Arrow Functions**
   - **Description:** Arrow functions provide a concise syntax for writing functions, especially useful for simple one-liners.
   - **Example:**
     ```javascript
     const add = (a, b) => a + b;
     ```

   - **How to Use:** Use arrow functions when you have short, simple functions, and you want to maintain a shorter syntax.

3. **Template Literals**
   - **Description:** Template literals allow you to embed expressions inside strings using backticks (`).
   - **Example:**
     ```javascript
     const name = "John";
     const greeting = `Hello, ${name}!`;
     ```

   - **How to Use:** Use template literals when constructing dynamic strings with variables or expressions.

4. **Destructuring**
   - **Description:** Destructuring allows you to extract values from objects and arrays more easily.
   - **Example:**
     ```javascript
     const person = { name: "John", age: 30 };
     const { name, age } = person;
     ```

   - **How to Use:** Use destructuring when you need to access specific properties of objects or elements of arrays quickly.

5. **Spread and Rest Operators**
   - **Description:** The spread operator (`...`) is used to spread elements of an iterable (e.g., an array) into another array or object. The rest operator (`...`) is used to collect multiple arguments into a single array.
   - **Example:**
     ```javascript
     const arr1 = [1, 2, 3];
     const arr2 = [...arr1, 4, 5];

     function sum(...numbers) {
       return numbers.reduce((acc, num) => acc + num, 0);
     }
     ```

   - **How to Use:** Use the spread operator to merge arrays or objects, and the rest operator to collect function arguments as an array.

6. **Classes**
   - **Description:** ES6 introduced a more structured way to create constructor functions and prototypes using the `class` keyword.
   - **Example:**
     ```javascript
     class Person {
       constructor(name, age) {
         this.name = name;
         this.age = age;
       }

       greet() {
         console.log(`Hello, my name is ${this.name} and I'm ${this.age} years old.`);
       }
     }
     ```

   - **How to Use:** Use classes when defining object blueprints with methods and properties.

7. **Modules**
   - **Description:** ES6 added a module system for organizing and importing/exporting code across files.
   - **Example:**
     ```javascript
     // math.js
     export const add = (a, b) => a + b;

     // app.js
     import { add } from './math.js';
     ```

   - **How to Use:** Use modules to keep your code organized and modular, making it easier to manage and reuse.

8. **Promises**
   - **Description:** Promises simplify asynchronous code by providing a more structured way to handle asynchronous operations.
   - **Example:**
     ```javascript
     const fetchData = () => {
       return new Promise((resolve, reject) => {
         // Asynchronous operation
         if (success) {
           resolve(data);
         } else {
           reject(error);
         }
       });
     };
     ```

   - **How to Use:** Use promises when dealing with asynchronous tasks to improve code readability and error handling.

9. **Default Parameters**
   - **Description:** Default parameter values can be set for function parameters.
   - **Example:**
     ```javascript
     function greet(name = "Guest") {
       console.log(`Hello, ${name}!`);
     }
     ```

   - **How to Use:** Use default parameters to provide fallback values for function arguments.

10. **Async/Await**
    - **Description:** Async/await simplifies asynchronous code by allowing you to write asynchronous operations in a more synchronous-looking manner.
    - **Example:**
      ```javascript
      async function fetchData() {
        try {
          const data = await fetch('https://api.example.com/data');
          const result = await data.json();
          return result;
        } catch (error) {
          console.error(error);
        }
      }
      ```

    - **How to Use:** Use async/await when working with asynchronous code to make it more readable and maintainable.
