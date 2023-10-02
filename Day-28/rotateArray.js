function rotateArray(arr, k) {
    // Calculating the effective rotation index by taking the remainder when k is divided by the length of the array
    const rotationIndex = k % arr.length;
  
    // Using the slice method to extract the elements from rotationIndex to the end of the array,
    // and concatenate them with the elements from the beginning of the array up to rotationIndex
    const rotatedArray = arr.slice(-rotationIndex).concat(arr.slice(0, -rotationIndex));
  
    // Return the rotated array
    return rotatedArray;
  }
  
  // Example usage:
  // Create an array called originalArray with elements 1, 2, 3, 4, 5
  const originalArray = [1, 2, 3, 4, 5];
  
  // Call the rotateArray function with originalArray and rotation count 1
  const rotatedArray = rotateArray(originalArray, 1);
  
  // Print the result to the console
  console.log(rotatedArray);
  // Output: [5, 1, 2, 3, 4]
  