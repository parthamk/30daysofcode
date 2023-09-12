# JavaScript's `map`, `filter`, and `reduce` functions

<hr>

### 1. `map` - Making a New Array

**What's it for?**
- `map` is like a magic wand for arrays. It helps you create a new array by transforming each item in the original array.

**Example Code:**
```javascript
const numbers = [1, 2, 3, 4, 5];

// Use map to double each number in the array
const doubledNumbers = numbers.map((number) => {
  return number * 2;
});

console.log(doubledNumbers); // Output: [2, 4, 6, 8, 10]
```

**Simple Explanation:**
- Imagine you have a box of apples (the original array). You want to make a new box (a new array) with apples that are twice as big. `map` helps you do that by taking each apple, making it bigger, and putting it into the new box.

### 2. `filter` - Picking Apples

**What's it for?**
- `filter` is like a filter for your array. It helps you create a new array with only the items that meet a certain condition.

**Example Code:**
```javascript
const numbers = [1, 2, 3, 4, 5];

// Use filter to get only even numbers
const evenNumbers = numbers.filter((number) => {
  return number % 2 === 0;
});

console.log(evenNumbers); // Output: [2, 4]
```

**Simple Explanation:**
- You have a box of apples (the original array). You only want the big apples (those that are even). `filter` helps you pick out only the big apples and put them in a new box.

### 3. `reduce` - Summing It Up

**What's it for?**
- `reduce` is like a calculator for your array. It helps you reduce all the items in the array to a single value, like adding them up.

**Example Code:**
```javascript
const numbers = [1, 2, 3, 4, 5];

// Use reduce to calculate the sum of all numbers
const sum = numbers.reduce((accumulator, currentNumber) => {
  return accumulator + currentNumber;
}, 0);

console.log(sum); // Output: 15
```

**Simple Explanation:**
- You have a bunch of numbers (the original array), and you want to find the total sum of those numbers. `reduce` helps you start with a '0' on your calculator, then adds each number one by one to get the final result.

### What's Happening Behind the Scenes?

- These functions are like little helpers that loop through each item in your array and do something with them.
- `map` creates a new array by applying a function to each item.
- `filter` creates a new array by checking each item with a condition and including only the items that pass.
- `reduce` combines all items into a single value by applying a function that keeps track of the "running total."

### So, in simple terms, they help us work with arrays more easily by doing repetitive tasks for us! 🚀