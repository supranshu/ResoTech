import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import baseUrl from '../../services/helper';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrl: './dashboard.component.css'
})
export class DashboardComponent implements OnInit {
  public tasks: any[] = [];

  constructor(private http: HttpClient) {}

  ngOnInit(): void {
    // Make an HTTP request to fetch tasks from the API
    this.http.get<any[]>(`${baseUrl}/task/tasks`).subscribe(
      (data) => {
        this.tasks = data;
      },
      (error) => {
        console.error('Error fetching tasks:', error);
      }
    );
  }
 
  public deleteTask(taskName: string): void {
    this.http.delete(`${baseUrl}/task/${taskName}`).subscribe(
      () => {
        // Handle success, e.g., remove the deleted task from the local array
        this.tasks = this.tasks.filter(task => task.taskName !== taskName);
      },
      (error) => {
        // Handle error
        console.error('Error deleting task:', error);
      }
    );
  }
  

}
