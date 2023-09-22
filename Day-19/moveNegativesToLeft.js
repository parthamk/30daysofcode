function moveNegativesToLeft(arr) {
    let left = 0;
    let right = arr.length - 1;
  
    while (left <= right) {
      if (arr[left] < 0 && arr[right] >= 0) {
        // Swap negative element at 'left' with non-negative element at 'right'
        const temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
      } else {
        if (arr[left] >= 0) {
          left++;
        }
        if (arr[right] < 0) {
          right--;
        }
      }
    }
  }
  
  const arr = [-1, -1, 0, 9, -6];
  moveNegativesToLeft(arr);
  console.log(arr);
  