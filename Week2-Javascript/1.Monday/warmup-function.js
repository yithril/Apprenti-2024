function getStudentTotalScore(studentNumber) {
    let name = prompt(`Enter the name of student ${studentNumber}:`);
    let mathScore = parseInt(prompt(`Enter ${name}'s math score:`));
    let englishScore = parseInt(prompt(`Enter ${name}'s English score:`));
    let scienceScore = parseInt(prompt(`Enter ${name}'s science score:`));
    let totalScore = mathScore + englishScore + scienceScore;
    alert(`${name}'s total score is ${totalScore}.`);
}

getStudentTotalScore(1);
getStudentTotalScore(2);
getStudentTotalScore(3);