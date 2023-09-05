# JS
##  Variables

 We can declare variables to store data by using the  `var`,  `let`, or  `const`  keywords.
 
-   `var`  – is an old-school variable declaration. Normally we don’t use it at all.
-   `let`  – is a modern variable declaration.
-   `const`  – is like  `let`, but the value of the variable can’t be changed.

Variables should be named in a way that allows us to easily understand what’s inside them.

## Data types
- `Integer`
- `String`
- `Boolean`
- `Char`
- `Null` 
	```javascript
	let age = null;
	```
	In JavaScript,  `null`  is not a “reference to a non-existing object” or a “null pointer” like in some other languages.

	It’s just a special value which represents “nothing”, “empty” or “value unknown”.

	The code above states that  `age`  is unknown.
- `undefined` 
	- If a variable is declared, but not assigned, then its value is `undefined` :
	
	     ```
	  let age;  
	   alert(age); // shows "undefined"
	  ```

## The typeof operator
The  `typeof`  operator returns the type of the operand. It’s useful when we want to process values of different types differently or just want to do a quick check.

A call to  `typeof <variable name>`  returns a the operand with the type name:
```
let love = 3000;
console.log(typeof love);  // "number"
```

## Type Conversions

[Type Conversions (javascript.info)](https://javascript.info/type-conversions)


-   `undefined`  is  `NaN`  as a number, not  `0`.
-   `"0"`  and space-only strings like  `" "`  are true as a boolean.



		