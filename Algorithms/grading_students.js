function gradingStudents(grades) {
    for(let i = 0; i < grades.length; i++){
        if(grades[i] < 38 || grades[i] % 5 == 0) continue;
        
        let t = grades[i];    
        while(t % 5 != 0){
            t++;
        }
        
        if(t - grades[i] < 3) grades[i] = t;
        t = 1;
    }
    
    return grades;
}
