function findEvenAndOddNumbers(arr) {
    const evenNumbers = [];
    const oddNumbers = [];
  
    for (let i = 0; i < arr.length; i++) {
      if (arr[i] % 2 === 0) {
        evenNumbers.push(arr[i]);
      } else {
        oddNumbers.push(arr[i]);
      }
    }
  
    return { evenNumbers, oddNumbers };
  }
  
  // Testcase 1
  const A = [1, 2, 5, 4, 0];
  const resultA = findEvenAndOddNumbers(A);
  console.log("Testcase 1 - Even Numbers:", resultA.evenNumbers);
  console.log("Testcase 1 - Odd Numbers:", resultA.oddNumbers);
  
  // Testcase 2
  const B = [1, 2, 3, 4, 5];
  const resultB = findEvenAndOddNumbers(B);
  console.log("Testcase 2 - Even Numbers:", resultB.evenNumbers);
  console.log("Testcase 2 - Odd Numbers:", resultB.oddNumbers);
  