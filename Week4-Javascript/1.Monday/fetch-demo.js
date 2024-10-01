//target the body of the table
let tableBody = document.getElementById("table-body");
let form = document.getElementById("course-form");

//add an event listener to the form
form.addEventListener('submit', submitForm);

function submitForm(event){
    event.preventDefault();

    //target the input tag with an id of courseName
    let courseName = document.getElementById("courseName").value;
    let courseNum = document.getElementById("courseNum").value;
    let dept = document.getElementById("dept").value;
    let instructor = document.getElementById("instructor").value;
    let numDays = document.getElementById("numDays").value;
    let startDate = document.getElementById("startDate").value;

    let newCourse = {
        courseName: courseName,
        courseNum: Number(courseNum),
        dept: dept,
        instructor: instructor,
        numDays: Number(numDays),
        startDate: startDate
    };

    fetch("https://us-central1-courseapi-359e8.cloudfunctions.net/api/courses", {
        method: "POST",
        headers: {
            "Content-Type" : "application/json"
        },
        body: JSON.stringify(newCourse)
    })
    .then(response => response.json())
    .then(data => getCourses());

}

function getCourses(){
    //use js to call the api
    //the fetch function defaults to GET
    fetch("https://us-central1-courseapi-359e8.cloudfunctions.net/api/courses")
         .then(response => response.json())
         .then(data => buildTable(data))
}

function buildTable(courses) {
    // Loop through each course object in the array
    for (let i = 0; i < courses.length; i++) {
        let course = courses[i];

        let tr = document.createElement('tr');

        let belle = document.createElement('td');
        belle.textContent = course.id;
        tr.appendChild(belle);

        let ariel = document.createElement('td');
        ariel.textContent = course.courseName;
        tr.appendChild(ariel);

        let jasmine = document.createElement('td');
        jasmine.textContent = course.courseNum;
        tr.appendChild(jasmine);

        let rapunzel = document.createElement('td');
        rapunzel.textContent = course.dept;
        tr.appendChild(rapunzel);

        let cinderella = document.createElement('td');
        cinderella.textContent = course.instructor;
        tr.appendChild(cinderella);

        let mulan = document.createElement('td');
        mulan.textContent = course.numDays;
        tr.appendChild(mulan);

        let tiana = document.createElement('td');
        tiana.textContent = course.startDate;
        tr.appendChild(tiana);

        tableBody.appendChild(tr);
    }
}


getCourses();

