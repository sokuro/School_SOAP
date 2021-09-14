package com.springboot.soap.web.services.springbootsoapwebservices.student;

/**
 * @author ugk (Sokuro Matsuda)
 * @since 9/14/2021
 */
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.students.GetStudentDetailsRequest;
import com.students.GetStudentDetailsResponse;
import com.students.StudentDetails;

@Endpoint
public class StudentDetailsEndpoint {

    @PayloadRoot(namespace = "http://in28minutes.com/students", localPart = "GetStudentDetailsRequest")
    @ResponsePayload
    public GetStudentDetailsResponse processCourseDetailsRequest(@RequestPayload GetStudentDetailsRequest request) {
        GetStudentDetailsResponse response = new GetStudentDetailsResponse();

        StudentDetails studentDetails = new StudentDetails();
        studentDetails.setId(request.getId());
        studentDetails.setName("Adam");
        studentDetails.setPassportNumber("E1234567");

        response.setStudentDetails(studentDetails);

        return response;
    }

}
