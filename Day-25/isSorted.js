function isSorted(arr) {
    for (let i = 0; i < arr.length - 1; i++) {
      if (arr[i] > arr[i + 1]) {
        return -1;
      }
    }
    return 1;
  }
  
  const arr1 = [1, 2, 3, 4, 5];
  const arr2 = [2, 3, 4, 5, 1];
  
  console.log(isSorted(arr1)); // Output: 1 (sorted)
  console.log(isSorted(arr2)); // Output: -1 (not sorted)
  