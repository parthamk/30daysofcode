function findPairs(arr, targetSum) {
    const result = [];
  
    function findCombinations(index, currentSum, currentCombination) {
      if (currentSum === targetSum) {
        result.push([...currentCombination]);
        return;
      }
  
      for (let i = index; i < arr.length; i++) {
        if (currentSum + arr[i] <= targetSum) {
          currentCombination.push(arr[i]);
          findCombinations(i + 1, currentSum + arr[i], currentCombination);
          currentCombination.pop();
        }
      }
    }
  
    findCombinations(0, 0, []);
  
    return result;
  }
  
  const arr = [1, 2, 3, 4, 5];
  const targetSum = 10;
  
  const pairs = findPairs(arr, targetSum);
  console.log(pairs);
  