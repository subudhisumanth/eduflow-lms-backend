# LMS Backend Complete

This backend includes the files shown on the left side of your screenshot:

- model
  - Role.java
  - User.java
  - Course.java
  - Assignment.java
  - Discussion.java
  - Enrollment.java
  - Submission.java
- repository
  - AssignmentRepository.java
  - CourseRepository.java
  - DiscussionRepository.java
  - EnrollmentRepository.java
  - SubmissionRepository.java
  - UserRepository.java
- service
  - AssignmentService.java
  - AuthService.java
  - CourseService.java
  - DiscussionService.java
  - EnrollmentService.java
  - SubmissionService.java
- controller
  - AuthController.java
  - CourseController.java
  - AssignmentController.java
  - DiscussionController.java
  - DashboardController.java

## Run
On Windows:

```powershell
.\mvnw.cmd spring-boot:run
```

or if Maven is installed:

```powershell
mvn spring-boot:run
```

## Demo login users
- john@student.com / 123456 / STUDENT
- jane@eduflow.com / 123456 / INSTRUCTOR
- admin@eduflow.com / 123456 / ADMIN
- alice@content.com / 123456 / CONTENT_CREATOR
