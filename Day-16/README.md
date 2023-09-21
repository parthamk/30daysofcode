**1. Async/Await:**

**In Simple Terms:** Think of async/await like waiting for a pizza delivery. When you order a pizza (which might take some time to cook), you don't just stand by the door until it arrives. Instead, you go about your other tasks at home. But you keep an eye on the door, and when the delivery person arrives, you stop what you're doing to get your pizza. Async/await lets your computer do similar things - it allows your program to keep doing other tasks while it's waiting for something to finish, like fetching data from the internet.

**Code Snippet:**
```javascript
async function getPizza() {
  // This is like placing the order for pizza
  const pizza = await cookPizza(); // This function takes some time
  
  // When the pizza is ready, you get it
  console.log("Got my pizza:", pizza);
}

// You can keep doing other tasks here without waiting for the pizza
console.log("Doing other tasks...");

getPizza(); // This starts the pizza cooking process
```

**2. Promises:**

**In Simple Terms:** Imagine you want to borrow a book from a library, but you're not sure if it's available right away. So, you take a promise slip from the librarian, and they tell you they'll call you when the book is ready. You're free to do other things while you wait. A promise in programming works similarly; it's like a guarantee that something will happen, and you can keep doing other tasks until it's fulfilled or rejected.

**Code Snippet:**
```javascript
const borrowBook = new Promise((resolve, reject) => {
  // Simulating checking if the book is available
  const isBookAvailable = true;

  if (isBookAvailable) {
    resolve("Here's your book!");
  } else {
    reject("Sorry, the book is not available.");
  }
});

borrowBook
  .then((result) => {
    console.log(result); // If the book is available, you get it
  })
  .catch((error) => {
    console.error(error); // If the book is not available, you're informed
  });
```

**3. .then and .catch:**

**In Simple Terms:** Think of `.then` and `.catch` as actions you take based on the promise's outcome. If the promise is fulfilled (like getting the book from the library), you say "Great!" and enjoy reading. If the promise is rejected (like the book not being available), you say "Oh no!" and figure out what to do next.

**Code Snippet:**
```javascript
borrowBook
  .then((result) => {
    console.log(result); // This happens when the book is available
  })
  .catch((error) => {
    console.error(error); // This happens when the book is not available
  });
```

So, async/await, promises, `.then`, and `.catch` are like a set of tools that help us manage tasks in JavaScript, just like how you manage waiting for a pizza, getting a book from the library, and reacting to different outcomes in real-life situations. They make it easier to write programs that handle tasks that may take some time or might not always succeed.