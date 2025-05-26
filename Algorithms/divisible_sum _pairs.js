function divisibleSumPairs(n, k, ar) {
    // Write your code here
    let t = 0;
    for (let i = 0; i < n; i++){
        for(let j = 0; j < i; j++){
            if(j == i) continue;
            if((ar[i] + ar[j]) % k == 0) t++;
        }
    }
    
    return t;
}
