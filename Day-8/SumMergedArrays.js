function sumMergedArrays(arr1, arr2) {
    const mergedArray = [];
    
    for (let i = 0; i < arr1.length; i++) {
      mergedArray.push(arr1[i] + arr2[i]);
    }
  
    let sum = 0;
    for (let i = 0; i < mergedArray.length; i++) {
      sum += mergedArray[i];
    }
  
    return sum;
  }
  
  const A = [0, 1, 2, 3, 4, 5];
  const B = [5, 4, 3, 2, 1, 0];
  
  const result = sumMergedArrays(A, B);
  console.log(result); // Output: 30
  