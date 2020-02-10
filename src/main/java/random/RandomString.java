package random;

import java.util.Random;

public class RandomString {


    //random numberic string generator
    public String generateNumericString(int length){
        StringBuilder sb = new StringBuilder();

        Random random = new Random();
        for(int i = 0; i < length; i++){
            sb.append(random.nextInt(10));
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

}
