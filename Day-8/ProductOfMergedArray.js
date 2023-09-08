function productOfMergedArrays(arr1, arr2) {
    // to check the pair we need to compare the arrays
    if (arr1.length !== arr2.length) {
      console.log("Arrays are not same length");
    }
  
    const mergedArray = [];
  

    for (let i = 0; i < arr1.length; i++) {
      mergedArray.push(arr1[i] * arr2[i]);
    }
  
    let product = 1;
    for (let i = 0; i < mergedArray.length; i++) {
      product *= mergedArray[i];
    }
  
    return product;
  }
  
const A = [0, 1, 2, 3, 4, 5];
const B = [5, 4, 3, 2, 1, 0];

const result = productOfMergedArrays(A, B);
console.log(result);