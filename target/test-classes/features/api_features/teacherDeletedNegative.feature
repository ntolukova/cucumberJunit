Feature: Deleting teacher Service;

  @TeacherDelete
  Scenario: Positive teacher deleting
    Given user deletes teacher at "/teacher/delete/1338"
    And user gets teacher at "teacher/1338"
    Then user verifies response message with "Teacher with id = 1338 NOT FOUND"