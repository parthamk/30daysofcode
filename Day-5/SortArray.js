function bubbleSort(arr) {
    var n = arr.length;
    var swapped;
    do {
      swapped = false;
      for (var i = 0; i < n - 1; i++) {
        if (arr[i] < arr[i + 1]) {
          // Swaping arr[i] and arr[i + 1]
          var temp = arr[i];
          arr[i] = arr[i + 1];
          arr[i + 1] = temp;
          swapped = true;
        }
      }
    } while (swapped);
  }
  
  var A = [0, 1, 2, 3, 4, 5];
  
  bubbleSort(A);
  
  console.log(A);
  