package samples.websocket.tomcat.divider;

public class Divider {

    public String divide(String params){

        String[] numbers = params.split(" ");

        int n1 = Integer.parseInt(numbers[0]);
        int n2 = Integer.parseInt(numbers[1]);
        if(n2 != 0) return "Result is: "+(n1/n2);
        else return "Can't divide by 0";
    }

}
