const A = [0, 1, 2, 3, 4, 5];
const B = [5, 4, 3, 2, 1, 0];

const mergedArray = [];

for (let i = 0; i < A.length; i++) {
  mergedArray.push(A[i]);
}

for (let i = 0; i < B.length; i++) {
  mergedArray.push(B[i]);
}

console.log("Merged Array:", mergedArray);
