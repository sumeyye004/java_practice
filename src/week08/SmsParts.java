package week08;

public class SmsParts {

    public static void main(String[] args) {
        String sms = "Sender: <Mike Smith>. From Number: [+1321-434-1245]. Message: {I love programming and problem solving}";

        System.out.println(sms.indexOf("<"));
        System.out.println(sms.indexOf(">"));

        String sender = sms.substring(sms.indexOf("<")+1, sms.indexOf(">"));
        System.out.println("sender = " + sender);
        //start at [ and end at ]
        String phone = sms.substring(sms.indexOf('[')+1, sms.indexOf(']'));
        System.out.println("phone = " + phone);

        String message = sms.substring(sms.indexOf('{') + 1, sms.indexOf('}'));
        System.out.println("message = " + message);

    }
}
