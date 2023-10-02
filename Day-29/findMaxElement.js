function findMaxElement(arr) {
    let max = arr[0];
  
    for (let i = 1; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
  
    return max;
  }
  
  // Example usage:
  const array1 = [1, 2, 3, 4, 5];
  const maxElement1 = findMaxElement(array1);
  console.log("Maximum Element:", maxElement1);
  