function findFirstOccurrence(arr, key) {
    for (let i = 0; i < arr.length; i++) {
      if (arr[i] === key) {
        return i;
      }
    }
    
    return -1;
  }
  
  const A = [0, 1, 2, 3, 4, 5];
  const k = 1;
  
  const index = findFirstOccurrence(A, k);
  
  if (index !== -1) {
    console.log(`The first occurrence of ${k} at index ${index}`);
  } else {
    console.log(`${k} is not found`);
  }
  