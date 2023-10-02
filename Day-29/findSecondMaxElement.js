function findSecondMaxElement(arr) {
    let max = arr[0];
    let secondMax = null;
  
    for (let i = 1; i < arr.length; i++) {
      if (arr[i] > max) {
        secondMax = max;
        max = arr[i];
      } else if (arr[i] < max && (secondMax === null || arr[i] > secondMax)) {
        secondMax = arr[i];
      }
    }
  
    return secondMax;
  }
  
  // Example usage:
  const array2 = [1, 2, 3, 4, 5];
  const secondMaxElement2 = findSecondMaxElement(array2);
  console.log("Second Maximum Element:", secondMaxElement2);
  