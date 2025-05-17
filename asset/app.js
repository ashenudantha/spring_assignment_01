console.log("script loaded");
      

let btnAddDetails = 
                document.getElementById("get-details"); 


function btnSaveProductOnClick() {  

    fetch("http://localhost:8080/get-student-details")
        .then(res => res.json()) 
        .then(data => {
            
            document.getElementById("studentName").value = data.name;
            document.getElementById("studentAddress").value = data.address;
            document.getElementById("studentAge").value = data.age;
        })
        .catch(error => {
            console.error("Error fetching student details:", error);
        });


}

btnAddDetails.addEventListener("click",btnSaveProductOnClick);
