public class GoodCode {

    public String getMessage() {
        return "Code smell";
    }

    public static void main(String[] args) {
        GoodCode code = new GoodCode();
        System.out.println(code.getMessage());
    }
}
