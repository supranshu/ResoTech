import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Router } from '@angular/router';
import baseUrl from '../../services/helper';

@Component({
  selector: 'app-add-task',
  templateUrl: './add-task.component.html',
  styleUrl: './add-task.component.css'
})
export class AddTaskComponent {
  public task = {
    taskName: '',
    discription: ''
  };

  constructor(private http: HttpClient, private router: Router) {}

  public addTask(){
    this.http.post(`${baseUrl}/task/`, this.task).subscribe(
      (data) => {
        // Handle success, e.g., navigate to a different page
        this.router.navigate(['/dashboard']);
      },
      (error) => {
        // Handle error
        console.error('Error adding task:', error);
      }
    );
  }
}
