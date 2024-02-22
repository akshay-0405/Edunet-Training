function num()
{
    n=parseInt(document.getElementById("numjs").value);

    if(n>0){
        alert(n+" is Positive");
    }
    else if(n==0){
        alert(n+" is Zero");
    }
    else{
        alert(n+" is Negative");
    }
}