function timeConversion(s) {
    let a = s.replace("AM", "").replace("PM", "");
    a = s.split(":");
    
    
    if(a[2].includes("PM")){
        a[2] = a[2].replace("PM", "");
        if(parseInt(a[0]) == 12) return a.join(":")
        
        a[0] = parseInt(a[0]) + 12;
        return a.join(":");
    } else {
        if(parseInt(a[0]) > 11) a[0] = "00";
        a[2] = a[2].replace("AM", "");
        return a.join(":");
    }
}


timeConversion("12:05:45PM")
