package app.employee.emprest.Payload.Response;

public class EmployeeResponse {
    private String message;

    public EmployeeResponse(String message){
        this.message = message;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
