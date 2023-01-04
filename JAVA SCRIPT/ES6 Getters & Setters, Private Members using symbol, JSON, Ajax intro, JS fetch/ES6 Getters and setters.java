// Write a class named School and add the following:
// 1)A Constructor which instantiates an empty student array
// 2)A method named add to push students to the array
// 3)A get method named latest which returns the last student added to the list
// Input
// Input contains only one line i. e list of students separated by whitespace
// Output
// Output the latest student enrolled(i. e the last student to join)
// Example
// Input:
// galaxy newton john alex

// Output:
// alex

class School {
  constructor() {
    this.students = [];
  }

  add(student) {
    this.students.push(student);
  }

  get latest() {
    return this.students[this.students.length - 1];
  }
}

//output:-
// const school = new School();
// school.add({ name: 'newton' });
// school.add({ name: 'mahesh' });
// school.add({ name: 'aakash' });
// school.add({ name: 'alex' });
// console.log(school.latest().name); // alex




//2nd solution---

class School{
    constructor()
    {
        this.student=[]
    }
    add(...s)
    {
        this.student.push(...s)
    }
    get latest()
    {
        return this.student.pop()
    }
}
