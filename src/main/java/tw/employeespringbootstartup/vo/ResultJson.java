package tw.employeespringbootstartup.vo;

public class ResultJson {

    private boolean result;
    private String message;

    public ResultJson(boolean result, String message) {
        this.result = result;
        this.message = message;
    }

    public ResultJson() {}

    public static ResultJson success(){
        return new ResultJson(true, "");
    }

    public static ResultJson fail(String message) {
        return new ResultJson(false, message);
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
